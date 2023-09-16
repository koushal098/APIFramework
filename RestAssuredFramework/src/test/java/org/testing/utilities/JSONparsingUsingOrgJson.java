package org.testing.utilities;

import org.json.JSONObject;

public class JSONparsingUsingOrgJson 
{
  public static String jsonparse(String body,String KeyName)
  {
	  JSONObject js=new JSONObject(body);
	  return js.getString(KeyName);
  }
}
