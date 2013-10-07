package ch5;

public class Spitter {
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private String email;
	private boolean updateByEmail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUpdateByEmail(boolean updateByEmail) {
		this.updateByEmail = updateByEmail;
	}

	public boolean isUpdateByEmail() {
		return updateByEmail;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("id = ").append(id).append(" ");
		stringBuilder.append("username=").append(userName).append(" ");
		stringBuilder.append("password=").append(password).append(" ");
		stringBuilder.append("fullname=").append(fullName).append(" ");
		stringBuilder.append("email=").append(email).append(" ");
		stringBuilder.append("updateByEmail=").append(updateByEmail);
		return stringBuilder.toString();
	}

}
