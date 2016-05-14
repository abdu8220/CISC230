import java.util.ArrayList;
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
	public double	getPayratel()	{ return hourlyPay; }
	public String	getSSN()		{ return SSN; }

	public String getJobTitle(){
		switch(getClass().getName()){
		case "ZooManager":
			return "The Zoo Manager";
		case "ZooKeeper":
			return "Zoo Keeper";
		case "Zoologist":
			return"Zoologist";
		case "Vet":
			return "Veterinarian";
		case "VetTech":
			return "Vet Tech";
		case "GuestSerManager":
			return "Guest Service Manager";
		case "GuestSerEmp":
			return "Guest Service Employee";
		case "VolunteerManager":
			return "Volunteer Manager";
		case "Volunteer":
			return "Volunteer";
		default:
			return "";
		}
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

	public String pay(){
		return getName() + " was paid: $" + (hourlyPay * hours);
	}

	public void pay(ArrayList<Employee> employee){
	}

	@Override
	public String toString(){
		String temp = "Infomation for:\n";
		temp += "Employee name:" + getName() + ".\n";
		temp += "Job Title: " + getJobTitle()+".\n";
		temp += "ID number: " + getID() + "\n";
		temp += "Hours per weeks: " + getHours() + "\n";
		temp += "Salary: $" + getPayratel() + "\n";
		temp += "Phone Number: " + getPhone() + "\n";
		temp += "Address: " + getAddress() + "\n";
		temp += "SSN: " + getSSN() + "\n";
		return temp;
	}
	public void work(Employee theLucky1, String ins, int h){}
	public void feedTheAnimals(ArrayList<Animal> animals){}

}
