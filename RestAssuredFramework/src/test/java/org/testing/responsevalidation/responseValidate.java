package org.testing.responsevalidation;

import org.testing.utilities.JSONParsingUsingJsonPath;

import io.restassured.response.Response;

public class responseValidate 
{
public static void StatusCodeValidation(Response res, int expectedStatusCode)
{
	if(expectedStatusCode==res.getStatusCode())
	{
		System.out.println("Status code is matching");
	}
	else
	{
		System.out.println("Status code is not matching");
	}
	}
public static void dataValidate(String ExpectedData,Response res,String jsonPath)
{
	String actualdata=JSONParsingUsingJsonPath.jsonparse(res, jsonPath);
	if(actualdata.equals(ExpectedData))
	{
		System.out.println("Data is matching");
	}
	else
	{
		System.out.println("Data is not matching");
	}
}
}
