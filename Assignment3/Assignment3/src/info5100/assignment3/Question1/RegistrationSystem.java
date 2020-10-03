package info5100.assignment3.Question1;

import java.util.ArrayList;


	class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Student a = new Student("aa","1");
      Student b = new Student("bb","2");
      Student c = new Student("cc","3");
      Student d = new Student("dd","4");
      Student e = new Student("ee","5");
      Student f = new Student("ff","6");
      Student g = new Student("gg","7");
      Student h = new Student("hh","8");
      Student i = new Student("ii","9");
      Student j = new Student("jj","10");
      Student k = new Student("kk","11");
      Course.registerStudent(a);
      Course.registerStudent(b);
      Course.registerStudent(c);
      Course.registerStudent(d);
      Course.registerStudent(e);
      Course.registerStudent(f);
      Course.registerStudent(g);
      Course.registerStudent(h);
      Course.registerStudent(i);
      Course.registerStudent(j);
      Course.registerStudent(k);
      
	}

 }



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
	 

	public static void registerStudent(Student student){
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