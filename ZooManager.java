import java.util.ArrayList;
/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class ZooManager extends AnimalCM {

// number of employees
public int numOfEmp;

public int getNumOfEmp(){return numOfEmp;}
	public ZooManager(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN, int numOfEmp){

			super(address,hours,ID,name,phone,hourlypay,SSN);
			this.numOfEmp = numOfEmp;

	}

	public String toString()
	{
			String info = super.toString();
			info += "Number of zoo's employees: " + numOfEmp + " employees.\n";
			return info;

	}
	public void pay(ArrayList<Employee> employee){

		for(Employee e : employee){

		System.out.println( name + " has paid " + e.getName() + " an amount of: $" + (e.hourlyPay * e.hours));

		}
	}

}
