package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPmethod;
import org.testing.utilities.JSONfileHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacement;
import org.testng.annotations.Test;

public class TC4_UpdateRequest
{
	@Test
	public void Putrequest() throws IOException
	{
	Properties pr=PropertiesHandle.loadproperties("../RestAssuredFramework/URI.properties");
	String bodydata=JSONfileHandle.loadjson("../RestAssuredFramework/src/test/java/org/testing/resources/PostRequestpaload.json");
	String updatedbodydata =StringReplacement.replacement(bodydata,"id",TC1_PostRequest.responseidvalue);
	HTTPmethod http=new HTTPmethod(pr);
	http.updaterequest(updatedbodydata, "QA_URI", TC1_PostRequest.responseidvalue);
	
}}
