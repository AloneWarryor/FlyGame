package entity;

public class Account {
	private String studentID;
	private String userName;
	private String password;
	
	public Account() {
	}

	public Account(String studentID, String userName, String password) {
		super();
		this.studentID = studentID;
		this.userName = userName;
		this.password = password;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
