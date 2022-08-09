import java.io.File;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

public class ResponseCookies {
	
	@Test
	public void method1() {
		Response response = RestAssured
									.given()
									.when().get("https://www.google.com/");
		Map<String, String> allCookies = response.getCookies();
		System.out.println(allCookies + "\n");
		
		String cookie = response.getCookie("1P_JAR");
		System.out.println(cookie);
		
		Cookie allInformation = response.getDetailedCookie("1P_JAR");
		System.out.println(allInformation);
		
		Cookies allInformation1 = response.getDetailedCookies();
		System.out.println(allInformation1);

	}
	

}
