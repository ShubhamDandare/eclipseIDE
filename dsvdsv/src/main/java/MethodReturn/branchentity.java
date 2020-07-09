package MethodReturn;

public class branchentity {
private int branchid;
private String branchname;
private String branchcity;
public int getBranchid() {
	return branchid;
}
public void setBranchid(int branchid) {
	this.branchid = branchid;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public String getBranchcity() {
	return branchcity;
}
public void setBranchcity(String branchcity) {
	this.branchcity = branchcity;
}
@Override
public String toString() {
	return "branchentity [branchid=" + branchid + ", branchname=" + branchname + ", branchcity=" + branchcity + "]";
}
public branchentity() {
	super();
	// TODO Auto-generated constructor stub
}

}
