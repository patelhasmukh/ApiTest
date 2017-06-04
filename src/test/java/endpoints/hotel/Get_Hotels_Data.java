package endpoints.hotel;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Base.BaseSetup;

public class Get_Hotels_Data extends BaseSetup {

		private static String ENDPOINT = null;
		
		@BeforeClass
		public void setup() throws IOException {
			init();
			setEndpoint();
		}
		
		public void setEndpoint() {
			ENDPOINT = testProperties.getProperty("GET_HOTELS_DATA");
		}
}
