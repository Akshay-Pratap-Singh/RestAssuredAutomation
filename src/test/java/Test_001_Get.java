import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Test_001_Get {
	
	@Test
	void test_001() {
//		//Code-1
//		String json = get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc")
//						.asString();
//		Response jsoN = get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc");
//		System.out.println(json);
//		System.out.println("");
//		System.out.println(jsoN.getBody().asString());
//		System.out.println(jsoN.getStatusCode());	
		
//		//Code-2
//		Float id =
//				given().
//				        get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc").
//				then().
//				        body("timezone", equalTo(19800)).
//				extract().
//				        path("wind.speed"); 
//		
//		System.out.println(id);
		
		
//		//Code-3
//		Response response = 
//				given().get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc"). 
//				then().
//					body("name", equalTo("Pitampura")).
//				extract(). 
//					response();
//		
//		System.out.println(response.path("wind.speed"));
//		System.out.println(response.path("visibility"));
		
		
//		//Code-4.1 All Headers
//		Response response = get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc");
//		//Get all headers
//		Headers headers = response.getHeaders();
//		System.out.println(headers);
//		String header = response.getHeader("Content-Type");
//		String header2 = response.getHeader("Connection");
//		System.out.println("");
//		System.out.println(header);
//		System.out.println(header2);
		
		//Code-4.2 Cookies
//		Response response = get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc");
//		Map<String, String> allCookies = response.getCookies();
//		System.out.println(allCookies);
//		String cookieValue = response.getCookie("cookieName");
		
//		//Code-4.3 Status
//		Response response = get("https://api.openweathermap.org/data/2.5/weather?lat=28.7041&lon=77.1025&appid=4dfd8f4e99e802c28ae9938db70659fc");
//		String statusLine = response.getStatusLine();
//		int statusCode = response.getStatusCode();
//		System.out.println(statusLine);
//		System.out.println(statusCode);
		
		
		
		
		
		
		
		
		
		
		
	}
}




















