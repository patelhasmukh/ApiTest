package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseSetup {

	protected static Properties testProperties = new Properties();
	protected static Logger logger = Logger.getLogger(BaseSetup.class);
	
	private String INIT_PROPERTIES = System.getProperty("user.dir") + "\\Config\\init.properties";
	
	// Test Initializer Block
	public void init() throws IOException {
		loadPropertiesFile();
		setupLog4j();
		RestConfigurator();
	}
	
	public void loadPropertiesFile() throws IOException {
		File f = new File(INIT_PROPERTIES);
		testProperties.load(new FileInputStream(f));
	}
	
	public void setupLog4j() {
		String log4jConfPath = System.getProperty("user.dir") + File.separator + testProperties.getProperty("log4j.properties");
		PropertyConfigurator.configure(log4jConfPath);
	}
	
	public void RestConfigurator() {
		RestAssured.baseURI = testProperties.getProperty("server.host");
		//RestAssured.basePath = testProperties.getProperty("server.base");
	}
	
	public RequestSpecification getRestRequestSpecification(){
		Map<String, String> params = new HashMap<String, String>();
		params.put("app_id", testProperties.getProperty("aut.app_id"));
		params.put("app_key", testProperties.getProperty("aut.app_key"));
		return RestAssured.given().contentType(ContentType.JSON).params(params);
	}
}
