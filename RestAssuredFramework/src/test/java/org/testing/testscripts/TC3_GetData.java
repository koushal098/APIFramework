package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetData
{
//Get Perticular data
	@Test
	public void GetData() throws IOException
	{
		Properties pr=PropertiesHandle.loadproperties("../RestAssuredFramework/URI.properties");
		HTTPmethod http=new HTTPmethod(pr);
		http.GetRequest("QA_URi", TC1_PostRequest.responseidvalue);
	}
}
