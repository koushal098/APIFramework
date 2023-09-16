package org.testing.utilities;

import io.restassured.response.Response;

public class JSONParsingUsingJsonPath
{
	public static String jsonparse(Response res,String jsonpath)
	{
		return res.jsonPath().getString(jsonpath);
	}
}
