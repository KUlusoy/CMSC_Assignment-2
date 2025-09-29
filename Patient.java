/* Class: CMSC203 
* Program: Assignment #2
* Instructor: 
* Summary of Description: A patient management system where it 
* stores, calculates, and outputs information about the patient
* Due Date: 09/29/25
* Integrity Pledge: I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
*/
public class Patient {
	private String firstName, middleName, lastName, phoneNumber;
	private String streetAddress, city, state;
	private String emergencyName, emergencyPhoneNum;
	private int zipCode;

	public Patient() {

		firstName = "default first name";
		middleName = "default middle name";
		lastName = "default last name";
		phoneNumber = "123-456-7890";
		streetAddress = "123 Street";
		city = "default city";
		state = "default state";
		zipCode = 9876;

	}

	public Patient(String firstName, String middleName, String lastName) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		phoneNumber = "123-456-7890";
		streetAddress = "123 Street";
		city = "default city";
		state = "default state";
		zipCode = 9876;
	}

	public Patient(String firstName, String middleName, String lastName, String phoneNumber, String streetAddress,
			String city, String state, int zipCode, String emergencyName, String emergencyPhoneNum) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.emergencyName = emergencyName;
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getEmergencyPhoneNum() {
		return emergencyPhoneNum;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setEmergencyPhoneNum(String emergencyPhoneNum) {
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}

	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhoneNum;
	}

	@Override
	public String toString() {
		return "Patient info: \n  Name: " + buildFullName() + "\n  Address: " + buildAddress()
				+ "\n  EmergencyContact: " + buildEmergencyContact() + "\n";
	}
}
