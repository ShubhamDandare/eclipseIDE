package service;



import entity.StudentEntity;

public class studentService {
public int getStudentservice(StudentEntity se) {
	int TotalMark= se.getMarkSub1()+se.getMarksub2()+se.getMarksub3()+se.getMarksub4();
	System.out.println("total marks="+TotalMark);
	return TotalMark;
	
}
}
