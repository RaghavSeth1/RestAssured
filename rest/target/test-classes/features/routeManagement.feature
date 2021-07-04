Feature: Validating Place API's
Scenario: Validate if the place has been added successfully.
	Given Add place Payload
	When when user call "addPlaceAPI" with POST Http request
	Then the response code should be 200
	And "status" in the response body is "OK"
	And "scope" in the response body is "APP"
	
