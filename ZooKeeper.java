import java.util.ArrayList;

/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			5/4/16
 */
public class ZooKeeper extends AnimalCM {

public int numOfAnimals;
public int getNumOfAnimals(){return numOfAnimals;}

	public ZooKeeper(String address, int hours, int ID, String name, String phone, double hourlypay, String SSN){
		super(address,hours,ID,name,phone,hourlypay,SSN);
	}
		
	public void feedTheAnimals(ArrayList<Animal> animal){
		for(Animal a : animal){
			System.out.print(this.name + " fed " ); 
			a.feed();
		}
	}
	
	public void setNumAnimal(int numOfAnimals) {
		this.numOfAnimals = numOfAnimals;
	}
	
	@Override
	public String toString(){
		String info = super.toString();
		info += "Number of the zoo's animals: " + numOfAnimals + "animals.\n";
		return info;
	}
}
