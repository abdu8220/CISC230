/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class Zoologist extends AnimalCM {

public Zoologist(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		super(address,hours,ID,name,phone,hourlypay,SSN);
	}

	//some method needs to go here, check later

	@Override
	public String toString()
	{
		String info = super.toString();
		return info;
	}
}
