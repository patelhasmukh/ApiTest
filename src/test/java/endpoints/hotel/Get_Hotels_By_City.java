package endpoints.hotel;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseSetup;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//@Listeners(TestNGListeners.CustomListener.class)

public class Get_Hotels_By_City extends BaseSetup {

	private static String ENDPOINT = null;

	@BeforeSuite
	public void setup() throws IOException {
		init();
	}

	@BeforeClass
	public void setEndpoint() {
		ENDPOINT = testProperties.getProperty("GET_HOTELS_BY_CITY_ENDPOINT");
	}

	@Test
	/* 
	 * Verify if GET_HOTELS_BY_CITY_ENDPOINT is reachable for a particular city_id
	 */
	@Parameters("city_id")
	public void verifyStatusCode200(String city_id) {
		Map<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("city_id", city_id);
		RequestSpecification request = getRestRequestSpecification();
		Response response = given().spec(request).params(parametersMap).
				log().all().
				when().get(ENDPOINT)
				.then().extract().response();
		JsonPath jsonPath = new JsonPath(response.asString());
		assertTrue(jsonPath.getBoolean("success"),"Unable to reach endpoint - get_hotels_by_cityid, rest of the cases will be skipped");
	}

	
	@Test(dependsOnMethods = { "verifyStatusCode200" })
	/* 
	 * Verify if GET_HOTELS_BY_CITY_ENDPOINT is responsive for a particular city_id within given responseTime
	 */
	@Parameters({ "city_id", "responseTime" })
	public void verifyResponseSLA(String city_id, int responseTime) {
		Map<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("city_id", city_id);
		RequestSpecification request = getRestRequestSpecification();
		Response response = given().spec(request).params(parametersMap).when().get(ENDPOINT);
		logger.info("Time for response " + response.getTime());
		assertTrue(response.getTime() < responseTime, "Response time more than expected "+responseTime);
		
	}
	
	

}