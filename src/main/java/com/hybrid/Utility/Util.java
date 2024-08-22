package com.hybrid.Utility;

import java.util.Date;

public class Util 
{
	public static String GenerataEmailwithTimeStamp()
	{
	Date date=new Date();
	String timestamp = date.toString().replace(" ", "_").replace(":", "_");
	return "sujatatupale"+timestamp+"@gmail.com";

}
}

	
	