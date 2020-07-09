
package entity;

public class RegisterEntity {
private int UserId;
private String UserName;
private String UserEmail;
private String UserContact;
private String Password;
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserEmail() {
	return UserEmail;
}
public void setUserEmail(String userEmail) {
	UserEmail = userEmail;
}
public String getUserContact() {
	return UserContact;
}
public void setUserContact(String userContact) {
	UserContact = userContact;
}

@Override
public String toString() {
	return "RegisterEntity [UserId=" + UserId + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserContact="
			+ UserContact + ", Password=" + Password + "]";
}

public RegisterEntity(int userId, String userName, String userEmail, String userContact, String password) {
	super();
	UserId = userId;
	UserName = userName;
	UserEmail = userEmail;
	UserContact = userContact;
	Password = password;
}
public RegisterEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
