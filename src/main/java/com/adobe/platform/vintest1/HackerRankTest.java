package com.adobe.platform.vintest1;

import java.util.HashMap;

public class HackerRankTest {
	public static void main (String [] args) {
		System.out.println("minimum values to be removed " + makingAnagrams("zaabbabcde","acdz"));		
		System.out.println("GOT " + gameOfThrones("cdeaaabcabcde"));

	}
	
    public static int makingAnagrams(String s1, String s2) {
		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hmap2 = new HashMap<String, Integer>();
		int retValue = 0;
        for (int i = 0; i < s1.length(); i++) {
        	Integer a1 = 1;
			if (hmap1.containsKey(String.valueOf(s1.charAt(i)))) {
				a1 = hmap1.get(String.valueOf(s1.charAt(i))).intValue() + 1;
			} 
			hmap1.put((String.valueOf(s1.charAt(i))), a1);
        }
        
        for (int i = 0; i < s2.length(); i++) {
        	Integer a2 = 1;
			if (hmap2.containsKey(String.valueOf(s2.charAt(i)))) {
				a2 = hmap2.get(String.valueOf(s2.charAt(i))).intValue() + 1;
			} 
			hmap2.put((String.valueOf(s2.charAt(i))), a2);
        }

        for (int i = 97; i <= 122; i++) {
        	String key = String.valueOf((char)i);
        	int a1 = hmap1.containsKey(key) ? hmap1.get(key).intValue() : 0;
        	int a2 = hmap2.containsKey(key) ? hmap2.get(key).intValue() : 0;
        	
        	retValue = retValue + Math.abs(a1 - a2);
        }        
        return retValue;
    }
    
    public static String gameOfThrones(String s) {
    	String retValue = "YES";
    	HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
        	Integer a1 = 1;
			if (hmap1.containsKey(String.valueOf(s.charAt(i)))) {
				a1 = hmap1.get(String.valueOf(s.charAt(i))).intValue() + 1;
			} 
			hmap1.put((String.valueOf(s.charAt(i))), a1);
        }
        int oddnumbers = 0;
        for (int i = 97; i <= 122; i++) {
        	String key = String.valueOf((char)i);
        	int a1 = hmap1.containsKey(key) ? hmap1.get(key).intValue() : 0;
        	
        	if (Math.floorMod(a1,2) != 0) {
        		oddnumbers++;
        	}
        	if (oddnumbers > 1) {
        		retValue = "NO";
        		break;
        	}
        }        
    	return retValue;
    }
    
    static String twoStrings(String s1, String s2) {
    	String retValue = "NO";
		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hmap2 = new HashMap<String, Integer>();
        for (int i = 0; i < s1.length(); i++) {
        	Integer a1 = 1;
			if (hmap1.containsKey(String.valueOf(s1.charAt(i)))) {
				a1 = hmap1.get(String.valueOf(s1.charAt(i))).intValue() + 1;
			} 
			hmap1.put((String.valueOf(s1.charAt(i))), a1);
        }
        
        for (int i = 0; i < s2.length(); i++) {
        	Integer a2 = 1;
			if (hmap2.containsKey(String.valueOf(s2.charAt(i)))) {
				a2 = hmap2.get(String.valueOf(s2.charAt(i))).intValue() + 1;
			} 
			hmap2.put((String.valueOf(s2.charAt(i))), a2);
        }

        for (int i = 97; i <= 122; i++) {
        	String key = String.valueOf((char)i);
 
        	if (hmap1.containsKey(key) && hmap2.containsKey(key)) {
        		retValue = "YES";
        	}
        }        
        return retValue;
    }

}
