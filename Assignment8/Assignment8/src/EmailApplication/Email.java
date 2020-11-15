package EmailApplication;

import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class Email {

    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String Email;
    private String name;
    

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    }

    // Ask for the department
    private String SetDepartment() {
		System.out.println("New Worker: "+ this.getName()+". Department Codes:" );
		System.out.println("1 for Sales");
		System.out.println("2 for Development");
		System.out.println("3 for Accounting");
		System.out.println("0 for none");
		System.out.println("Enter department code:");
		
    	Scanner scan = new Scanner(System.in);
    	int dep=0;
    	if(scan.hasNextInt()) {
    	dep=scan.nextInt();
    	}    	
    	scan.close();
    	if(dep==0) {
    		department="none";
    	}
    	if(dep==1) {
    		department="sal";
    	}
    	if(dep==2) {
    		department="dev";
    	}
    	if(dep==3) {
    		department="acc";
    	}
		return department;
    }

    // Generate a random password
    private String randomPassword(int length) {
    	this.defaultPasswordLength=length;
    	String set="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    	String randomP=RandomStringUtils.random(length, set);
    	return randomP;
    }
    
    // Set methods
    public void setPassword(String password) {
    	this.password=password;
    }
    public void setMailboxCapacity(int mc) {
    	this.mailboxCapacity=mc;
    }
    public void defineEmail(String fn, String ln, String dep, String com) {
    	
    	this.Email=fn+"."+ln+"@"+dep+"."+com;
    }
    
    // Get methods
   public String getName() {
	   return name=this.firstName+" "+this.lastName;
   }
   public String getEmail() {
	   this.defineEmail(this.firstName, this.lastName, this.department, this.companySuffix);
	   return this.Email;
   }
   public String getMailboxCapacity() {
	   return mailboxCapacity+"mb";
   }

	public String showInfo() {

		SetDepartment();
		String info = "DISPLAY NAME: "+ this.getName()+"\n"
				+"DEPARTMENT: "+this.department+"\n"
                +"COMPANY EMAIL: "+this.getEmail()+"\n"
                +"PASSWORD: "+this.randomPassword(defaultPasswordLength)+"\n"
                +"MAILBOX CAPACITY: " +this.getMailboxCapacity();

		return info;
		
	}

}


/**
 * Console Result
New Worker: John Smith. Department Codes:
1 for Sales
2 for Development
3 for Accounting
0 for none
Enter department code:
2
DISPLAY NAME: John Smith
DEPARTMENT: dev
COMPANY EMAIL: John.Smith@dev.aeycompany.com
PASSWORD: UWK3USTUY2
MAILBOX CAPACITY: 500mb
 * **/
