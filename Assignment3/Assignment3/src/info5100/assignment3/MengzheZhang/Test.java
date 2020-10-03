package info5100.assignment3.MengzheZhang;

public class Test {

	public static void main(String[] args) {
		// Question 1 Registration System
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
	      Course l = new Course("info5100");
	      l.registerStudent(a);
	      l.registerStudent(b);
	      l.registerStudent(c);
	      l.registerStudent(d);
	      l.registerStudent(e);
	      l.registerStudent(f);
	      l.registerStudent(g);
	      l.registerStudent(h);
	      l.registerStudent(i);
	      l.registerStudent(j);
	      l.registerStudent(k);
	      
	     //Question 2 Reverse String
	     // Main method for Question2 is in ReverseString.java
	      
	     //Question 3 Professor Builder
	      Professor professor = new Professor.Builder("Tom", "Ford")
				    .setPersonalId(123456).build();
	}

}
