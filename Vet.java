import java.util.ArrayList;
import java.util.Date;
/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class Vet extends AnimalHE {
	Date d = new Date();
	public Vet(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		super(address, hours, ID, name, phone, hourlypay, SSN);
	}

	@SuppressWarnings("deprecation")
	public ArrayList<Animal> examine(ArrayList<Animal> a){
		ArrayList<Animal> sick = new ArrayList<Animal>();
		for(int x = 0; x < a.size(); x++){
			a.get(x).Last_Checkup = d.getMonth() + "/" + d.getDate() + "/" + (d.getYear() - 100);
			if((int)(Math.random() * 100) < 30)
				a.get(x).Healthy = false;
			if(!a.get(x).getHealth()){
				System.out.println(a.get(x).getName() + " is sick and needs to be vaccinated");
				sick.add(a.get(x));
			}
		}
		return sick;
	}

	@Override
	public String toString(){
		String info = super.toString();
		return info;
	}
}
