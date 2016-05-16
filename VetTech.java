import java.util.ArrayList;
/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class VetTech extends AnimalHE {


public VetTech(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		super(address, hours, ID, name, phone, hourlypay, SSN);
	}
	
	public void vaccinate(ArrayList<Animal> a){
		for(int x = 0; x < a.size(); x++){
			a.get(x).Healthy = true;
			System.out.println(getName() + " vaccinates " + a.get(x).getName());
		}
	}

	@Override
	public String toString()
	{
		String info = super.toString();
		return info;
	}
}
