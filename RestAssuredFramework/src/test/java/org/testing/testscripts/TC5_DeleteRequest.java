package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_DeleteRequest 
{
	@Test
	public void deleteRequest() throws IOException
	{
		Properties pr=PropertiesHandle.loadproperties("../RestAssuredFramework/URI.properties");
		HTTPmethod http=new HTTPmethod(pr);
		http.Delete("QA_URI", TC1_PostRequest.responseidvalue);
	}

}
