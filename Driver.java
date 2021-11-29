package service;

import java.util.Scanner;

import model.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical \n2.Admin \n3.Human Resource \n4.Legal");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name:");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name:");
		String lastName=sc.nextLine();
		
		Employee e= new Employee(firstName,lastName);
		int option = sc.nextInt();
		CredentailService cs = new CredentailService();
		//System.out.println(cs.generatePassword());
		//Employee e = new Employee();
		//System.out.println(cs.generateEmailAddress("Sai Harini", "Karumuri", "Technical"));
		
		String generatedEmail;
		char[] generatedPassword;
		
		if(option==1) {
			generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"tech" );
			generatedPassword=cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		else if(option==2) {
			generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"admin" );
			generatedPassword=cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		else if(option==3) {
			generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"hr" );
			generatedPassword=cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		else if(option==4) {
			generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"legal" );
			generatedPassword=cs.generatePassword();
			cs.showCredentials(e, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("Enter valid option");
		}
	}

}