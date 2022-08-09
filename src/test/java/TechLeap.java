import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TechLeap {

	@Test
	public void secondLecture() {
		Response response = RestAssured.given().when().get("https://petstore.swagger.io/v2/store/inventory");
		String res = response.body().asString();
		System.out.println(res);
	}
}
