
package StudentMapping;

public class studententity {
private String name;
private int studentid;
private int rollnum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}
public studententity(String name, int studentid, int rollnum) {
	super();
	this.name = name;
	this.studentid = studentid;
	this.rollnum = rollnum;
}
public studententity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "studententity [name=" + name + ", studentid=" + studentid + ", rollnum=" + rollnum + "]";
}

}
