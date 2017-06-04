package endpoints.flight;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Base.BaseSetup;

public class FlightSearch extends BaseSetup {

	private static String ENDPOINT = null;

	@BeforeClass
	public void setup() throws IOException {
		init();
		setEndpoint();
	}
	
	public void setEndpoint() {
		ENDPOINT = testProperties.getProperty("GET_FLIGHT_SEARCH");
	}
}
