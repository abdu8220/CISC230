/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Mammal extends Animal
{
	
	public int NumberOfArms;
	public int NumberOfLegs;

	public int getNumberOfArms()
	{
		return NumberOfArms;
	}
	public int getNumberOfLegs()
	{
		return NumberOfLegs;
	}
	
	public Mammal(int Age, String Birth_method, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean heathly, int height, String Last_Checkup, int Length, int Lifespan, String Location, String Name, int Weight, int NumberOfArms, int NumberOfLegs){
		super(Age, Birth_method, Consevervation_status, Diet, Flight,  Habit, heathly, height, Last_Checkup, Length, Lifespan, Location, Name, Weight);
		this.NumberOfArms = NumberOfArms;
		this.NumberOfLegs = NumberOfLegs;
		
	}
	
	@Override
	public String toString(){
		String info = super.toString();
		info += "Number of Arms:" + getNumberOfArms() + ".\n";
		info += "Number of legs:" + getNumberOfLegs() + ".\n";
		
		return info;
	}
}

