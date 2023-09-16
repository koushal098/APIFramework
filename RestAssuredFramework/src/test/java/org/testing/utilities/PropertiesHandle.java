package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle
{
	public static Properties loadproperties(String filepath) throws IOException
	{
		//Properties file load code
		File f=new File(filepath);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
	}

}
