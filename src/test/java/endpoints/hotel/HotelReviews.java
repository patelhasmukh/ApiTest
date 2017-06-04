package endpoints.hotel;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import Base.BaseSetup;

public class HotelReviews extends BaseSetup {

	private static String ENDPOINT = null;
	
	@BeforeClass
	public void setup() throws IOException {
		init();
		setEndpoint();
	}
	
	public void setEndpoint() {
		ENDPOINT = testProperties.getProperty("GET_HOTELS_REVIEW");
	}
}
