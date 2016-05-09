/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class Employee {
	String address;
	int hours;
	int ID;
	String name;
	String phone;
	double hourlyPay;
	String SSN;
	
	public String	getAddress()	{ return address; }
	public int 		getHours()	{ return hours; }
	public int 		getID()			{ return ID;}
	public String	getName()		{ return name; }
	public String	getPhone()	{ return phone; }
	public double	getPayratel()		{ return hourlyPay; }
	public String	getSSN()		{ return SSN; }
	
	public Employee(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		this.address = address;
		this.hours = hours;
		this.ID = ID;
		this.name = name;
		this.phone = phone;
		this.hourlyPay = hourlypay;
		this.SSN = SSN;
	}
	
	public double pay(){
		return hourlyPay * hours;
	}
	
	@Override
	public String toString(){
		String temp = "Infomation for: ";
		temp += getName() + "\n";
		temp += "Employee type: " + this.getClass().getName() + "\n";
		temp += "ID number: " + getID() + "\n";
		temp += "Hours per weeks: " + getHours() + "\n";
		temp += "Phone Number: " + phone + "\n";
		temp += "Salary: $" + getPayratel() + "\n";
		temp += "SSN: " + getSSN() + "\n";
		return temp;
	}
}