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
	double salary;
	String SSN;
	
	public String	getAddress()	{ return address; }
	public int 		getHours()	{ return hours; }
	public int 		getID()			{ return ID;}
	public String	getName()		{ return name; }
	public String	getPhone()	{ return phone; }
	public double	getSal()		{ return salary; }
	public String	getSSN()		{ return SSN; }
	
	@Override
	public String toString(){
		String temp = "Infomation for: ";
		temp += getName() + " employee type: " + this.getClass().getName() + "\n";
		return temp;
	}
}