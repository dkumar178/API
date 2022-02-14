package org.readerJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader filer=new FileReader("C:\\Users\\LAPTOP\\eclipse-workspace\\API\\src\\test\\resources\\ApiTest\\daytask.json");
		JSONParser jp=new JSONParser();
		Object parse = jp.parse(filer);
		JSONObject jo=(JSONObject)parse;
		System.out.println(jo.get(""));
		
		
		
		
		
		
	}
}
