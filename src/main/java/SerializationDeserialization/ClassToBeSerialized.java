package SerializationDeserialization;

import java.io.Serializable;

public class ClassToBeSerialized implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7519011215048550684L;
	private int chalk = 2; 
	private int dustor = 5;
	private int board = 3;
	transient static private int teacher = 10; // no use of transient here
	private String Username = "vinod";
	private transient String password = "password"; 
	private transient int pinnumber = 7531;

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
