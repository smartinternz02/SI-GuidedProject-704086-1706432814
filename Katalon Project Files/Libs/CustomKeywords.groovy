
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "dropdown.customFunctiions.refreshBrowser"() {
    (new dropdown.customFunctiions()).refreshBrowser()
}


def static "dropdown.customFunctiions.CheckDropDownListElementExists"(
    	TestObject object	
     , 	String option	) {
    (new dropdown.customFunctiions()).CheckDropDownListElementExists(
        	object
         , 	option)
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "dropdown.customFunctiions.clickElement"(
    	TestObject to	) {
    (new dropdown.customFunctiions()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "dropdown.customFunctiions.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new dropdown.customFunctiions()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */ 
def static "dropdown.customFunctiions.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new dropdown.customFunctiions()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

 /**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */ 
def static "dropdown.customFunctiions.getCurrentSessionMobileDriver"() {
    (new dropdown.customFunctiions()).getCurrentSessionMobileDriver()
}

 /**
	 * Send request and verify status code
	 * @param request request object, must be an instance of RequestObject
	 * @param expectedStatusCode
	 * @return a boolean to indicate whether the response status code equals the expected one
	 */ 
def static "dropdown.customFunctiions.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new dropdown.customFunctiions()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

 /**
	 * Add Header basic authorization field,
	 * this field value is Base64 encoded token from user name and password
	 * @param request object, must be an instance of RequestObject
	 * @param username username
	 * @param password password
	 * @return the original request object with basic authorization header field added
	 */ 
def static "dropdown.customFunctiions.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new dropdown.customFunctiions()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}
