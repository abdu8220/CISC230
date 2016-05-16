/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class Zoologist extends AnimalCM {
	String[] enrichments = {"Sprinkler", "bird feeder", "treasure chest","ball"};
	public Zoologist(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		super(address,hours,ID,name,phone,hourlypay,SSN);
	}

	public void devlopEnrichment(Animal a){
		System.out.print(getName() + " enriches " + a.getName() + " with ");
		if(a instanceof Amphibian){
			System.out.println(enrichments[0]);
		}else if(a instanceof Bird){
			System.out.println(enrichments[1]);
		}else if(a instanceof Fish){
			System.out.println(enrichments[2]);
		}else if(a instanceof Mammal){
			System.out.println(enrichments[3]);
		}
	}

	@Override
	public String toString(){
		String info = super.toString();
		return info;
	}
}
