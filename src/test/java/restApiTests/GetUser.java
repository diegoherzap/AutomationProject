package restApiTests;

//import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetUser {
  
	private static String baseUrl = "http://localhost:3000";
	
	@Test
	public void getAllUsersReturns200() {
		Response resp = RestAssured.get(baseUrl+"/users/");
		int code = resp.getStatusCode();
		System.out.println("Status code is: "+ code);
		System.out.println("JSON field is: "+ resp.asString());
		Assert.assertEquals(200, code);
  }
  
	@Test
	public void getSingleUserReturns200() {
		Response resp =	RestAssured.get(baseUrl+"/users?firstName=John");
		System.out.println("JSON is: " + resp.asString());
		System.out.println("Status code is: " + resp.getStatusCode());
		Assert.assertEquals(200, resp.getStatusCode());
		}
}
