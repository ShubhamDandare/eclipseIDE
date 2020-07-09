package entity;

public class UserEntity {
 private String UserId;
private String UserName;
private String UserEmail;
private String UserContact;
public String getUserId() {
	return UserId;
}
public void setUserId(String userId) {
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
	return "UserEntity [UserId=" + UserId + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserContact="
			+ UserContact + "]";
}
public UserEntity(String userId, String userName, String userEmail, String userContact) {
	super();
	UserId = userId;
	UserName = userName;
	UserEmail = userEmail;
	UserContact = userContact;
}
public UserEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
