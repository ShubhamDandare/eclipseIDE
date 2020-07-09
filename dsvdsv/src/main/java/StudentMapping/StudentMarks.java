package StudentMapping;

public class StudentMarks {
private int submarks1;
private int submarks2;
private int submarks3;
private int submarks4;
public int getSubmarks1() {
	return submarks1;
}
public void setSubmarks1(int submarks1) {
	this.submarks1 = submarks1;
}
public int getSubmarks2() {
	return submarks2;
}
public void setSubmarks2(int submarks2) {
	this.submarks2 = submarks2;
}
public int getSubmarks3() {
	return submarks3;
}
public void setSubmarks3(int submarks3) {
	this.submarks3 = submarks3;
}
public int getSubmarks4() {
	return submarks4;
}
public void setSubmarks4(int submarks4) {
	this.submarks4 = submarks4;
}
@Override
public String toString() {
	return "StudentMarks [submarks1=" + submarks1 + ", submarks2=" + submarks2 + ", submarks3=" + submarks3
			+ ", submarks4=" + submarks4 + "]";
}
public StudentMarks() {
	super();
	// TODO Auto-generated constructor stub
}

}
