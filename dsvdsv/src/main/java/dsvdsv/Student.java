package dsvdsv;

public class Student {
private String name;
private int age;
private String division;
private int rollno;
private String addres;
private String standerd;

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
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
public String getStanderd() {
	return standerd;
}
public void setStanderd(String standerd) {
	this.standerd = standerd;
}
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
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", division=" + division + ", rollno=" + rollno + ", addres="
			+ addres + ", standerd=" + standerd + "]";
}


}
