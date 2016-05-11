/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class GuestSerManager extends GuestServices {

	public GuestSerManager(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN)
	{
		super(address,hours,ID,name,phone,hourlypay,SSN);

	}

	public String toString()
	{
		String info = super.toString();

		return info;

	}
}
