package model;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	static int id = 0;
	private int userId;
	private String userName, dateOfBirth, password;
	private long mobile;
	public List<UserDetails> friendsList;

	public UserDetails() {
		id++;
		setUserId(id);
		friendsList = new ArrayList<>();

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
