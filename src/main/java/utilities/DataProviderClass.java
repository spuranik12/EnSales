package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "Valid Login Detials")
	public static Object[][] loginWithValidCredentials(){
		return new Object[][]{ 
				{"pradip.sudke@silicus.com", "Pa55w0rd"},
		}; 
	}
}