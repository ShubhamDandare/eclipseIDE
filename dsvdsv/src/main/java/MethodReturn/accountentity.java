package MethodReturn;

public class accountentity {
private String accountcategory;                                    
private int accountnumber;
private int accountbalance;
public String getAccountcategory() {
	return accountcategory;
}
public void setAccountcategory(String accountcategory) {
	this.accountcategory = accountcategory;
}
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public int getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(int accountbalance) {
	this.accountbalance = accountbalance;
}
@Override
public String toString() {
	return "accountentity [accountcategory=" + accountcategory + ", accountnumber=" + accountnumber
			+ ", accountbalance=" + accountbalance + "]";
}
public accountentity() {
	super();
	// TODO Auto-generated constructor stub
}

}
