package Entity;

public class studentity {
private String name;
private int age;
private String division;
private int rollno;
private String Standerd;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDivision() {
	return division;
}
public void setDivision(String division) {
	this.division = division;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getStanderd() {
	return Standerd;
}
public void setStanderd(String standerd) {
	Standerd = standerd;
}
@Override
public String toString() {
	return "studentity [name=" + name + ", age=" + age + ", division=" + division + ", rollno=" + rollno + ", Standerd="
			+ Standerd + "]";
}
public studentity() {
	super();
	// TODO Auto-generated constructor stub
}

}
