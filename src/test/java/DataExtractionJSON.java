//import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DataExtractionJSON {
	
	@Test
	public void method1() {
		
		Response response = RestAssured
									.given().pathParam("id", 3)
									.when().get("https://petstore.swagger.io/v2/pet/{id}");
		response.prettyPrint();
//		Change the id if you don't get the response
//		{
//		    "id": 1,
//		    "category": {
//		        "id": 0,
//		        "name": "string"
//		    },
//		    "name": "BEETROOT QA :3",
//		    "photoUrls": [
//		        "string"
//		    ],
//		    "tags": [
//		        {
//		            "id": 0,
//		            "name": "string"
//		        }
//		    ],
//		    "status": "available"
//		}
		
		List<Integer> tagsId = response.jsonPath().get("tags.id");  //Return array
		List<String> tagsName = response.jsonPath().get("tags.name");  //Return array
		String name = response.jsonPath().get("category.name");
		
		System.out.println(tagsId);
		System.out.println(tagsName);
		System.out.println(name);
		
		//Second way for data extraction
		System.out.println(response.then().extract().path("category.name"));
		//Third way
		System.out.println(response.then().extract().jsonPath().get("category.name"));
	}
	
}

















