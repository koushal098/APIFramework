package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.responseValidate;
import org.testing.teststeps.HTTPmethod;
import org.testing.utilities.JSONfileHandle;
import org.testing.utilities.JSONparsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacement;
import org.testing.utilities.generateRandomNumber;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	
	public static String responseidvalue;
	Response res;
	@Test
	
public static void testcase1() throws IOException 
{
	Properties pr=PropertiesHandle.loadproperties("../RestAssuredFramework/URI.properties");
	String bodydata=JSONfileHandle.loadjson("../RestAssuredFramework/src/test/java/org/testing/resources/PostRequestpaload.json");
	Integer num=generateRandomNumber.randomnumber();
	 String updatedbodydata =StringReplacement.replacement(bodydata,"id",num.toString());
	HTTPmethod http=new HTTPmethod(pr);
	Response res=http.postrequest(bodydata,"QA_URI");
	//For parsing ID from Testcase1 which will use for TC3
	String responseidvalue=JSONparsingUsingOrgJson.jsonparse(res.asString(), "id");
	responseValidate.StatusCodeValidation(res, 201);
	responseValidate.dataValidate("deepak", res, ".firstname");
	
	
	
}
}