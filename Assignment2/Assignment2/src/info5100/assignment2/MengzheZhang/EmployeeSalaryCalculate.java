package info5100.assignment2.MengzheZhang;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
    	return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
    	this.name = name;
    }
    
    public void raiseSalary(double byPercent) {
    this.salary = byPercent*salary;
    }

}

enum Gender {
    MALE,
    FEMALE;
}

public class EmployeeSalaryCalculate {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
        //write your code here
    	double sst = 0;
    	if (employee.salary>8900) {
    		sst= 106800*0.062;
    	} else {
    		if (employee.salary<=8900 && employee.salary>0) {
    		sst = employee.salary*0.062;
    		}
    	}
    	System.out.println("The Social Security Tax of "+employee.name+" is:"+sst);
		return sst;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
    	double ic=0;
    	if(employee.age<35) {
    		ic=employee.salary*0.03;
    	}
    	if(employee.age<=50 && employee.age>=35) {
    		ic=employee.salary*0.04;
    	}
    	if(employee.age<60 && employee.age>50) {
    		ic=employee.salary*0.05;
    	}
    	if(employee.age>=60) {
    		ic=employee.salary*0.06;
    	}
    	System.out.println("The Insurance Coverage of "+employee.name +" is:"+ic);
		return ic;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
    	ArrayList<Employee> e = new ArrayList<>();
    	e.add(e1);
    	e.add(e2);
    	e.add(e3);
    	
    	e.sort(Comparator.comparingDouble(employee -> employee.salary));
    	System.out.println("Sort salary from low to high:");
    	for (Employee employee: e) {
    		System.out.println(employee.getName());
    	}
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public static void tripleSalary(Employee employee) {
        //write your code here
        employee.raiseSalary(3);
        System.out.println(employee.name+"'s salary after raising is:" +employee.salary);
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Java strictly uses only call by value while passing reference variables as well, not call by reference.
     It creates a copy of references and passes them as valuable to the methods.
     As reference points to same address of object, creating a copy of reference is of no harm. 
     But if new object is assigned to reference it will not be reflected.
     So in the swap(), x and y get swap, but this won't influence on a and b, 
     because x,y are copy of a, b and can't affect the origin a and b.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        
        // test the methods above
        Employee c = new Employee("Abbey", 22, Gender.FEMALE, 2500.5);
        socialSecurityTax(c);
        insuranceCoverage(c);
        sortSalary(c, a, b);
        tripleSalary(c);
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
    
}
/*
Console Result

Before: a=Jenny
Before: b=John
After: a=Jenny
After: b=John
The Social Security Tax of Abbey is:155.031
The Insurance Coverage of Abbey is:75.015
Sort salary from low to high:
Jenny
John
Abbey
Abbey's salary after raising is:7501.5

*/
