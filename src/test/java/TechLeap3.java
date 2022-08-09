import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TechLeap3 {

	@Test
	public void secondLecture() {
		RestAssured.given().when().get("https://petstore.swagger.io/v2/store/inventory").then().statusCode(200);
	}
	
	@Test
	public void testCreatePet() {
		RestAssured.given().contentType(ContentType.JSON).body(new File("src/test/resources/payload/pet.json")).
		when().post("https://petstore.swagger.io/v2/pet").
		then().log().body().statusCode(200);
	}
	
	@Test
	public void testUpdatePet() {
		/***Change something in json and update and then copy the id from the log 
		 * and paste in get pet status code in swagger https://petstore.swagger.io/#/pet/updatePet
		 * and you will see the json is updated ***/
		
		RestAssured.given().contentType(ContentType.JSON).body(new File("src/test/resources/payload/pet.json")).
		when().put("https://petstore.swagger.io/v2/pet").
		then().log().body().statusCode(200);
	}
	
	@Test
	public void testPetById() {
		RestAssured.given().pathParam("petid", "9223372036854055406").
		when().get("https://petstore.swagger.io/v2/pet/{petid}").
		then().log().body().statusCode(200);
	}
	
	@Test
	public void testDeletePet() {
		RestAssured.given().pathParam("petid", "9223372036854055406").
		when().delete("https://petstore.swagger.io/v2/pet/{petid}").
		then().log().body().statusCode(200);
	}
	
	
	
	
	
}



















