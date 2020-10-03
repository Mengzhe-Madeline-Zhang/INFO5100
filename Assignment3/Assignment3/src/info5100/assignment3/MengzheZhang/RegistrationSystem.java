package info5100.assignment3.MengzheZhang;

import java.util.ArrayList;

 class Student{
 String studentName;
 String studentID;
 
 public Student(String name, String id) {
	 this.studentName=name;
	 this.studentID=id;
 }
 
 //getter and setter
 public void setName(){
	 this.studentName= studentName; 
 }
 public String getName() {
	 return studentName;
 }
 
 public void setID(){
	 this.studentID= studentID; 
 }
 public String getID() {
	 return studentID;
 }
}
 
 
  class Course{
	 String courseName;
	 static int numberOfStudent=0;
	 static ArrayList<Student> studentList= new ArrayList<Student>();
	 
public Course(String name) {
	this.courseName = name;
}
	 
	 static ArrayList<Student> getStudent(){
		 return  studentList;
	 }
	 
	public static Boolean isFull() {
		 if(numberOfStudent>=10) {
			 return true;
		 }
		 return false;
	 }
	 
	 int getStudentNumber(){
		 return numberOfStudent;
	 }
	 

	public void registerStudent(Student student){
		if(!isFull()) {
			studentList.add(student);
			numberOfStudent++;
			System.out.println(student.getName()+" (id:"+student.getID()+")"+" has successfully registered this course!");
			System.out.println("Total number of registered students: "+numberOfStudent);
		} else {
			System.out.println(student.getName()+" (id:"+student.getID()+")"+ " can't register, because this course is full!!!");
		}
	
	 }
  }
 

/***
  Console Result
aa (id:1) has successfully registered this course!
Total number of registered students: 1
bb (id:2) has successfully registered this course!
Total number of registered students: 2
cc (id:3) has successfully registered this course!
Total number of registered students: 3
dd (id:4) has successfully registered this course!
Total number of registered students: 4
ee (id:5) has successfully registered this course!
Total number of registered students: 5
ff (id:6) has successfully registered this course!
Total number of registered students: 6
gg (id:7) has successfully registered this course!
Total number of registered students: 7
hh (id:8) has successfully registered this course!
Total number of registered students: 8
ii (id:9) has successfully registered this course!
Total number of registered students: 9
jj (id:10) has successfully registered this course!
Total number of registered students: 10
kk (id:11) can't register, because this course is full!!!
  ****/