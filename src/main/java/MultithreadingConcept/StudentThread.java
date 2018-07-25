package MultithreadingConcept;

public class StudentThread extends Thread {
	Student s;
	String name = "defaut";
	int rollno = 0;

	public StudentThread(Student s, String name, int rollno) {
		// TODO Auto-generated constructor stub
		this.s= s;
		this.name = name;
		this.rollno = rollno;
	}
	public void run() {
		callsynchronized();
	}
	public void callsynchronized() {
		s.addstudent(rollno, name);
		s.getStudentName(rollno);	
	}
}
