package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAllData 
{
	@Test
public void testcase2() throws Exception
{
	Properties pr=PropertiesHandle.loadproperties("../RestAssuredFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	http.GetAllRequest("URI_QA");
	
	}
}
