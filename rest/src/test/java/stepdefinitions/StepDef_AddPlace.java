package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;

public class StepDef_AddPlace {
	
	
	@Given("Add place Payload")
	public void add_place_payload() {
		
		 RestAssured.baseURI="https://rahulshettyacademy.com";
		 AddPlace addplace = new AddPlace();
		 addplace.setAccuracy(50);
		 addplace.setAddress("30, New York Central");
		 addplace.setLanguage("German-IN");
		 addplace.setPhone_number("(+91) 8199291929");
		 addplace.setWebsite("https://www.google.com");
		 addplace.setName("Midway Street");
		 List<String> mylist = new ArrayList<String>();
		 mylist.add("Green Park");
		 mylist.add("Central Square");
		 addplace.setTypes(mylist);
		 
		 
		 //RequestSpecification req= new RequestSpecBuilder().setBaseUri()
		 
		 
	   
	}

	@When("when user call {string} with POST Http request")
	public void when_user_call_with_post_http_request(String string) {
	 
	}
	@Then("the response code should be {int}")
	public void the_response_code_should_be(Integer int1) {
	   
	}
	@Then("{string} in the response body is {string}")
	public void in_response_body_is(String key, String value) {
	   
	}



	

}
