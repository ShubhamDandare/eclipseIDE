package entity;

public class StudentEntity {
private	String Name;
private	int MarkSub1;
private	int Marksub2;
private	int Marksub3;
private	int Marksub4;
private	int avgmarks;
private	int totalmarks;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getMarkSub1() {
	return MarkSub1;
}
public void setMarkSub1(int markSub1) {
	MarkSub1 = markSub1;
}
public int getMarksub2() {
	return Marksub2;
}
public void setMarksub2(int marksub2) {
	Marksub2 = marksub2;
}
public int getMarksub3() {
	return Marksub3;
}
public void setMarksub3(int marksub3) {
	Marksub3 = marksub3;
}
public int getMarksub4() {
	return Marksub4;
}
public void setMarksub4(int marksub4) {
	Marksub4 = marksub4;
}
public int getAvgmarks() {
	return avgmarks;
}
public void setAvgmarks(int avgmarks) {
	this.avgmarks = avgmarks;
}
public int getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(int totalmarks) {
	this.totalmarks = totalmarks;
}
@Override
public String toString() {
	return "StudentEntity [Name=" + Name + ", MarkSub1=" + MarkSub1 + ", Marksub2=" + Marksub2 + ", Marksub3="
			+ Marksub3 + ", Marksub4=" + Marksub4 + ", avgmarks=" + avgmarks + ", totalmarks=" + totalmarks + "]";
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}
