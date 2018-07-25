package SerializationDeserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClassToBeSerialized2 extends ParentSerialized2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8749230348057102082L;
	private int chalk = 20; 
	private int dustor = 50;
	private int board = 30;
	transient static private int teacher = 100; // no use of transient here
	private String Username = "vinod0";
	private transient String password = "kumar"; 
	private transient int pinnumber = 1357;
	
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String password = (String)ois.readObject();

		String newpassword = "";
		for (int i = 0 ; i< password.length();i++) {
			newpassword = newpassword + Character.toString((char)((int)password.charAt(i) - 1));
		}

		this.password = newpassword;
		this.pinnumber = ((Integer)ois.readObject())/5;
	}
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();
		String password = "";
		for (int i = 0 ; i< this.password.length();i++) {
			password = password + Character.toString((char)((int)this.password.charAt(i) + 1));
		}
		oos.writeObject(password);
		oos.writeObject(this.pinnumber*5);
	}

	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getChalk() {
		return chalk;
	}
	public void setChalk(int chalk) {
		this.chalk = chalk;
	}
	public int getDustor() {
		return dustor;
	}
	public void setDustor(int dustor) {
		this.dustor = dustor;
	}
	public int getBoard() {
		return board;
	}
	public void setBoard(int board) {
		this.board = board;
	}
	public int getTeacher() {
		return teacher;
	}
	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}
	public int getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	} 
}
