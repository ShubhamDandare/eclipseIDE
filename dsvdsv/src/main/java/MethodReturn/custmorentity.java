package MethodReturn;

public class custmorentity {
private String custmorname;
private int custmorid;
private String custmorcity;
public String getCustmorname() {
	return custmorname;
}
public void setCustmorname(String custmorname) {
	this.custmorname = custmorname;
}
public int getCustmorid() {
	return custmorid;
}
public void setCustmorid(int custmorid) {
	this.custmorid = custmorid;
}
public String getCustmorcity() {
	return custmorcity;
}
public void setCustmorcity(String custmorcity) {
	this.custmorcity = custmorcity;
}
@Override
public String toString() {
	return "custmorentity [custmorname=" + custmorname + ", custmorid=" + custmorid + ", custmorcity=" + custmorcity
			+ "]";
}
public custmorentity() {
	super();
	// TODO Auto-generated constructor stub
}

}
