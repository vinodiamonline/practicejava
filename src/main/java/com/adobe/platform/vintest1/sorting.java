package com.adobe.platform.vintest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class sorting {
	public void MyArray(int[] a1) {

		int[]a = a1.clone();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

	public void mylist(int[] a) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);
		}

		System.out.println("First index of " + a[a.length - 1] 
				+ " in " + list1.toString() + " is "
				+ list1.indexOf(a[a.length - 1]));

		Collections.sort(list1);
		
		System.out.println("First index of " + a[a.length - 1] 
				+ " in sorted list " + list1.toString() + " is "
				+ list1.indexOf(a[a.length - 1]));
		
	}
	
	public void myarraylist(int[] a) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);
		}
		
		System.out.println(list1.get(2));
		
	}
	
	public void myqueue(int []a) {
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			queue1.add(a[i]);
		}
		
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		
		
	}
}
