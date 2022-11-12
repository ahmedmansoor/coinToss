package coinTossAssignment;

// 1. Create an Owner class
public class Owner {

	public String nickName;
	public String fullName;
	
	// 3. Create the default constructor
	public Owner(String nick_name, String full_name) {
		
		nickName = nick_name;
		fullName = full_name;
	}

	public String getNickName() {
		return nickName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setNickName(String nick_name) {
		nickName = nick_name;
	}

	public void setFullName(String full_name) {
		fullName = full_name;
	}

}
