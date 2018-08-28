package com.vin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class READJSON {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://api.myjson.com/bins/y5d1o");
		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    String json = "";
		    String inputLine;
		    while ((inputLine = in.readLine()) != null)
		    	json += inputLine;
		        System.out.println(inputLine);
		    in.close();
		    
			JSONObject jsonObject = new JSONObject(json);
			JSONArray jarr = jsonObject.getJSONArray("data");
			
			//String post_id = arr.getJSONObject(i).getString("post_id");
			
			//JSONArray jarr = new JSONArray(jobj.getJSONArray("data"));
			
			String str = jarr.getJSONObject(0).getString("id");
						
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
