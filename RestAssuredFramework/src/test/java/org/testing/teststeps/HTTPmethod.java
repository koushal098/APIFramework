package org.testing.teststeps;
import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPmethod {
	Properties pr;
	public HTTPmethod(Properties pr)
	{
		this.pr=pr;
	}
	//We will call this method,where we need to hit post request
	public Response postrequest(String bodydata, String URIkey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(URIkey));
		System.out.println("Status code is"+res.statusCode());
		System.out.println("********ResponseData************");
		System.out.println(res.asString());
		return res;
	}
	public void GetAllRequest(String URIKey)
	{
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(URIKey));
		System.out.println("StatusCode is");
		System.out.println(res.statusCode());
		System.out.println("ResponseData");
		System.out.println(res.asString());
	}
	public void GetRequest(String URIKey, String IDValue )
	{
		String uri=pr.getProperty(URIKey)+"/"+IDValue;
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		System.out.println("StatusCode is");
		System.out.println(res.statusCode());
		System.out.println("ResponseData");
		System.out.println(res.asString());
	}
	public void updaterequest(String bodydata,String URIkey,String IDValue)
	{
		String uri=pr.getProperty(URIkey)+"/"+IDValue;
		Response RES=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
		System.out.println("Status code is");
		System.out.println(RES.statusCode());
		System.out.println("ResponseData is");
		System.out.println(RES.asString());
	}
	public void Delete(String URIKey, String IDValue )
	{
		String uri=pr.getProperty(URIKey)+"/"+IDValue;
		Response res=given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		System.out.println("StatusCode is");
		System.out.println(res.statusCode());
		System.out.println("ResponseData");
		System.out.println(res.asString());
	}

}
