import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Correlation {

	@Test
	public void method1() {
		String payload = "{\r\n"
				+ "  \"id\": 5,\r\n"
				+ "  \"petId\": 15,\r\n"
				+ "  \"quantity\": 25,\r\n"
				+ "  \"shipDate\": \"2022-08-05T18:24:36.673Z\",\r\n"
				+ "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}";
		
		Response response = RestAssured
									.given().contentType(ContentType.JSON).body(payload)
									.when().post("https://petstore.swagger.io/v2/store/order");
		
		response.prettyPrint();
		int id = response.jsonPath().get("id");  //Extracted the id from the post request and will pass to next request 
		
		RestAssured
				.given().pathParam("orderId", id)
				.when().get("https://petstore.swagger.io/v2/store/order/{orderId}")
				.then().statusCode(200).log().all();
		
	}
	
}
