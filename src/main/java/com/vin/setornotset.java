package com.vin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setornotset {
	public static void main (String args[]) {
		HashSet<Integer> h = new HashSet<Integer>();
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int []a = {1,2,4,4,6,4,4,5,3,4,6,7,2,4,2,5};
		for (int i = 0; i<a.length;i++) {
			if (h.add(a[i]) != true) {
				int a1 = 2;
				System.out.println("Duplicate value found " + a[i] );
				if (hmap.containsKey(a[i])) {
					a1 = hmap.get(a[i]).intValue() + 1;
				} 
				hmap.put(a[i], a1);
			}
		}

//		for (int j = 0; j<hmap.size(); j++) {
			System.out.println("No of duplicate of " + hmap.toString());
//		}
	}
}
