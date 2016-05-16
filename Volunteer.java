/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class Volunteer extends GuestServices {
	public String volPeriod;
	public String getVolPeriod(){return volPeriod;}

	public Volunteer(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN, String volPeriod){
		super(address,hours,ID,name,phone,hourlypay,SSN);
		this.volPeriod = volPeriod;
	}

	@Override
	public String pay(){
		return getName()+ " cannot be paid, because volunteers don't get paid.";
	}

	@Override
	public String toString()
	{
		String info = super.toString();
		info += "Volunteering Period: " + volPeriod + ".\n";
		return info;
	}
}
