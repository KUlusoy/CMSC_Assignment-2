/* Class: CMSC203 
* Program: Assignment #2
* Instructor: 
* Summary of Description: A patient management system where it 
* stores, calculates, and outputs information about the patient
* Due Date: 09/29/25
* Integrity Pledge: I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
*/

import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		String firstName, middleName, lastName, phoneNumber;
		String streetAddress, city, state;
		String emergencyName, emergencyPhoneNum;
		int zipCode;
		Patient patient1;
		String procedureName;
		String date;
		String practitionerName;
		double procedureCharges;
		Procedure procedure1 = new Procedure();
		Procedure procedure2;
		Procedure procedure3;
		Scanner scan = new Scanner(System.in);

		// get input on the patient
		System.out.println("What is the patient's first, middle, and last name?");
		firstName = scan.nextLine();
		middleName = scan.nextLine();
		lastName = scan.nextLine();

		System.out.println("What is the patient's phone number?");
		phoneNumber = scan.nextLine();

		System.out.println("What is the patient's address, city, state, and zip code?");
		streetAddress = scan.nextLine();
		city = scan.nextLine();
		state = scan.nextLine();
		zipCode = scan.nextInt();

		System.out.println("What is the patient's emergency contact's name and phone number?");
		emergencyName = scan.nextLine();
		scan.nextLine();
		emergencyPhoneNum = scan.nextLine();

		patient1 = new Patient(firstName, middleName, lastName, phoneNumber, streetAddress, city, state, zipCode,
				emergencyName, emergencyPhoneNum);

		// get input on the procedures
		System.out.println("\nWhat is procedure 2's name?");
		procedureName = scan.nextLine();
		System.out.println("What is procedure 2's date?");
		date = scan.nextLine();
		procedure2 = new Procedure(procedureName, date);

		System.out.println("\nWhat is procedure 3's name?");
		procedureName = scan.nextLine();
		System.out.println("What is procedure 3's date?");
		date = scan.nextLine();

		System.out.println("What is procedure 3's practitioner's name?");
		practitionerName = scan.nextLine();

		System.out.println("What is procedure 3's procedure charges?");
		procedureCharges = scan.nextDouble();
		procedure3 = new Procedure(procedureName, date, practitionerName, procedureCharges);

		// display and print all the information
		displayPatient(patient1);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);

		System.out.printf("\nTotal Charges: $%,.2f", calculateTotalCharges(procedure1, procedure2, procedure3));
		scan.close();

		System.out.println();
		System.out.println("\nStudent Name: Kubra Ulusoy");
		System.out.println("MC#: M21192814");
		System.out.println("Due date: 09/29/2025");

	}

	public static void displayPatient(Patient patient1) {
		System.out.println(patient1);
	}

	public static void displayProcedure(Procedure procedure1) {
		System.out.println(procedure1);
	}

	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
	}
}
