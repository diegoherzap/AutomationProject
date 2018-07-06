package RestApiTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetUser {
  @Test
  public void getUserReturns200WithExpectedName() {
	String baseUrl = "http://localhost:3000";
	Response resp = RestAssured.get(baseUrl+"/users/{id}",1);
	int code = resp.getStatusCode();
	System.out.println("Status code is: "+ code);
	Assert.assertEquals(200, code);
  }
}
