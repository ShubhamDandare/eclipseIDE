package com.projectmaven.entity;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class StudentEntity {	
private int id;
private String name;
private String Address;
}
class Studentservice{
  public static void main(String[] args) {
	

	  StudentEntity se=new StudentEntity(1,"dfd", "nafg");
	  StudentEntity build=StudentEntity.builder().id(1).Address("pune").name("ss").build();
System.out.println(se);
System.out.println(build);
  }
}