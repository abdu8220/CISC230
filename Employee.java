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
	String jobTitle;

	public String	getAddress()	{ return address; }
	public int 		getHours()	{ return hours; }
	public int 		getID()			{ return ID;}
	public String	getName()		{ return name; }
	public String	getPhone()	{ return phone; }
	public double	getPayratel()		{ return hourlyPay; }
	public String	getSSN()		{ return SSN; }

	public String getJobTitle()
	{
		String str="";

		switch(this.getClass().getName())
		{

		case "ZooManager":
		str = "The Zoo Manager";
		break;

		case "ZooKeeper":
		str = "Zoo Keeper";
		break;

		case "Zoologist":
		str = "Zoologist";
		break;

		case "Vet":
		str = "Veterinarian";
		break;

		case "VetTech":
		str = "Vet Tech";
		break;

		case "GuestSerManager":
		str = "Guest Service Manager";
		break;

		case "GuestSerEmp":
		str = "Guest Service Employee";
		break;

		case "VolunteerManager":
		str = "Volunteer Manager";
		break;

		case "Volunteer":
		str = "Volunteer";
		break;

		}

		return str;
	}

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
		String temp = "Infomation for:\n";
		temp += "Employee name:" + getName() + ".\n";
		temp += "Job Title: " + this.getJobTitle()+".\n";
		temp += "ID number: " + getID() + "\n";
		temp += "Hours per weeks: " + getHours() + "\n";
		temp += "Salary: $" + getPayratel() + "\n";
		temp += "Phone Number: " + getPhone() + "\n";
		temp += "Address: " + getAddress() + "\n";
		temp += "SSN: " + getSSN() + "\n";
		return temp;
	}
}