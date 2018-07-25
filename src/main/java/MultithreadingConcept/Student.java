package MultithreadingConcept;

import java.util.HashMap;

public class Student {
	private HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	
	public void addstudent(int rollno, String name) {
		name = name + " : " + Thread.currentThread().getName();
		hmap.put(rollno, name);
	}
	
	public HashMap<Integer, String> getstudentlist() {
		return hmap;
	}
	
	public synchronized String getStudentName(int rollnumber) {
		if(hmap.containsKey(rollnumber)) {
			for (int i = 0; i<10;i++) {
				System.out.println("name : " + hmap.get(rollnumber));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(" rollnumber : " + rollnumber);
			}
			return hmap.get(rollnumber);
		} else {
			return "Name Not found";
		}
	}
}
