import org.testng.annotations.Test;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllureReport {
	
	@Epic("EP 001")
	@Story("Strory 01")
	@Feature("Testing reqres APIs")
	@Description("Smoke testing of APIs which shows list of user details")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void method_001() {
		RestAssured.given().queryParam("page", 2)
						.when().get("https://reqres.in/api/users")
						.then().statusCode(200);
		
	}
	
	@Epic("EP 001")
	@Story("Strory 01")
	@Feature("Testing reqres APIs")
	@Description("Smoke testing of APIs which shows single user details")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void method_002() {
		RestAssured.given().pathParam("user", 2)
					.when().get("https://reqres.in/api/users/{user}")
					.then().statusCode(200);
	}
	

}
