/* Class: CMSC203 
* Program: Assignment #2
* Instructor: Farnaz Eivazi 
* Summary of Description: A patient management system where it 
* stores, calculates, and outputs information about the patient
* Due Date: 09/29/25
* Integrity Pledge: I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
*/
public class Procedure {

	private String procedureName;
	private String date;
	private String practitionerName;
	private double procedureCharges;

	public Procedure() {
		procedureName = "Physical Exam";
		date = "09/28/2025";
		practitionerName = "Doctor Billy";
		procedureCharges = 263.42;
	}

	public Procedure(String procedureName, String date) {
		this.procedureName = procedureName;
		this.date = date;
		practitionerName = "Doctor Diane";
		procedureCharges = 297.00;
	}

	public Procedure(String procedureName, String date, String practitionerName, double procedureCharges) {
		this.procedureName = procedureName;
		this.date = date;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
	}

	public String getProcedureName() {
		return procedureName;

	}

	public String getPractionerName() {
		return practitionerName;

	}

	public String getDate() {
		return date;

	}

	public double getProcedureCharges() {
		return procedureCharges;

	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setProcedureCharges(double procedureCharges) {
		this.procedureCharges = procedureCharges;
	}

	@Override
	public String toString() {
		return "\n        Procedure: " + getProcedureName() + "\n        ProcedureDate=" + getDate()
				+ "\n        Practioner=" + getPractionerName() + "\n        Charge=" + getProcedureCharges();
	}

}
