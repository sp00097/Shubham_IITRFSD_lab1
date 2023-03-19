package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.employee;
import com.greatlearning.service.CredserviceImpl;

public class EmailDriver { 

	public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Your First Name");
    String fname=sc.next();
    System.out.println("Enter Your Last Name");
    String lname=sc.next();
	employee e1 = new employee(fname,lname);
	
	employee e2=new employee();
	e2.setFirstname(fname);
	e2.setLastname(lname);
	
    CredserviceImpl cs=new CredserviceImpl();
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. HR");
	System.out.println("4. Legal");
	System.out.println("Enter Your choice");
	int choice=sc.nextInt();
	String genemail="";
	String genpass="";
	switch (choice)
	{
	case 1: 
		genemail=cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"tech");
	    break;
	case 2: 
		genemail=cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"admin");
	    break;
	case 3: 
		genemail=cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"hr");
	    break;
	case 4: 
		genemail=cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"legal");
	    break;
	    default:
	    System.out.println("Please enter the valid choice");	
	}
	
	  genpass=cs.generatePassword();
	  e1.setEmail(genemail);
	  e1.setPassword(genpass);
	  
	  cs.showDetails(e1);
	
	}	
}
