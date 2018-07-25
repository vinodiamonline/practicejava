package com.adobe.platform.vintest1;

public class threadsafesingletonclass {
	
	public static threadsafesingletonclass getInstance() {
		System.out.println("FIrst time call to threadsafe");
		return threadsafesingletonclassholder.INST;
	}
	
	private static class threadsafesingletonclassholder {
		private static threadsafesingletonclass INST = new threadsafesingletonclass();
	}
	
	public String getSampleString( ) {
		return "abc";
	}
}
