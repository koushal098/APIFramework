package org.testing.utilities;

import java.util.regex.Pattern;

public class StringReplacement 
{
	//input------->jsonfile(String data)
	//input----->Key name
	//input------>key value
	public static String replacement(String completeData,String KeyName, String KeyValue)
	{
		completeData=completeData.replaceAll(Pattern.quote("{{"+KeyName+"}}"), KeyValue);
		return completeData;
	}

}
