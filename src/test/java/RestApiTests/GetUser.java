package RestApiTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetUser {
  
	private static String baseUrl = "http://localhost:3000";
	
	@Test
	public void getUserReturns200WithExpectedName() {
		Response resp = RestAssured.get(baseUrl+"/users/{id}",1);
		int code = resp.getStatusCode();
		System.out.println("Status code is: "+ code);
		Assert.assertEquals(200, code);
  }
  
	@Test
	public void getUser2Returns200WithExpectedName() {
		given().
		when().
			get(baseUrl+"/users/?firstName=John").
		then()
			.statusCode(200);
  }
}
