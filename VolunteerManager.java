/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class VolunteerManager extends GuestServices {

	public int numOfVolunteers;
	public int getNumOfVolunteers(){return numOfVolunteers;}

	public VolunteerManager(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN, int numOfVolunteers)
	{
		super(address,hours,ID,name,phone,hourlypay,SSN);
		this.numOfVolunteers = numOfVolunteers;

	}

	public void work (Employee GMEmp, String instruction, int Hours)
	{
		System.out.println( this.name + " assigns " + GMEmp.getName() + " to " + instruction + " for the next " + Hours + " hours.");
	}

	public String toString()
	{
		String info = super.toString();

		return info;

	}


}
