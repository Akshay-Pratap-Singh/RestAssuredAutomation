import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TechLeap2 {

	@Test
	public void secondLecture() {
		RestAssured.given().when().get("https://petstore.swagger.io/v2/store/inventory").then().statusCode(200);
	}
}
