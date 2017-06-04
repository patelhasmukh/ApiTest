package endpoints.bus;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseSetup;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ExcelUtility;

/*
 * Sample Request : "http://developer.goibibo.com/api/bus/search/?
 * 					app_id=f8bd7c07&
 * 					app_key=03bcba5ae02860332f32d99ededca212&
 * 					format=json&
 * 					source=bangalore&
 * 					destination=mumbai&
 * 					dateofdeparture=20170604&
 * 					dateofarrival=20170610
 */

public class BusSearch extends BaseSetup {

	private static String ENDPOINT = null;

	@BeforeSuite
	public void setup() throws IOException {
		init();
	}
	
	@BeforeClass
	public void setEndpoint() {
		ENDPOINT = testProperties.getProperty("GET_BUS_SEARCH");
	}

	@DataProvider(name="BusSearch_Data")
	public Object[][] createTestDataRecords() {
		ExcelUtility readXlsx = new ExcelUtility();
		String filepath =  System.getProperty("user.dir") + File.separator + testProperties.getProperty("testdata.endpoint.bus");
		return readXlsx.readXLSXFile(filepath, "TestData");
//		return new Object[][] {"json","bangalore", "mumbai", "20170601"}};
	}
	
	@Test(dataProvider="BusSearch_Data")
	public void verifyBusAvailability(String format, String source, String destination, String dateofdeparture, String dateofarrival, String expectedcount) {
		Map<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("format", format);
		parametersMap.put("source", source);
		parametersMap.put("destination", destination);
		parametersMap.put("dateofdeparture", dateofdeparture);

		RequestSpecification request = getRestRequestSpecification();
		Response response = given().spec(request).params(parametersMap).
				log().all().
				when().get(ENDPOINT).then().extract().response();
		
		
		if(expectedcount.compareToIgnoreCase("error") == 0){
			assertNull(response.body().path("data.onwardflights"));
		} else {
			List<String> onwardflights = response.body().path("data.onwardflights");
			System.out.println("####### Number :" + onwardflights.size());
			assertTrue(onwardflights.size()>=Integer.parseInt(expectedcount), "Expected number of buses not matched");
		}
		


	}

	
}
