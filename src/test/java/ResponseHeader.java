import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;  
import io.restassured.response.Response;

public class ResponseHeader {
	
	@Test
	public void method1() {
		Response response = RestAssured
									.given().pathParam("petId", 20)
									.when().get("https://petstore.swagger.io/v2/pet/{petId}");
		
//		response.prettyPrint();
		Headers allheaders = response.getHeaders();
		System.out.println(allheaders + "\n");
		
		Header oneHeader = allheaders.get("content-type");
		System.out.println(oneHeader + "\n");  //Content-Type=application/json
		
		String headerValue = allheaders.getValue("content-type");
		System.out.println(headerValue + "\n");  //application/json
		
		String contentTypeValue = response.header("content-type");
		System.out.println(contentTypeValue);  //application/json
	
	}
	
	
}
