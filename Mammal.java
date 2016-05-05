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

	public Mammal(String Name, int Age,String Consevervation_status,String Diet,boolean Flight,String Habit
	,boolean Healthy,String Last_Checkup,int Lifespan,String Location,int Weight,int flightSpeed, int wingspan){
		super(Name,Age,Consevervation_status,Diet,Flight,Habit,Healthy,Last_Checkup,Lifespan,Location,Weight);

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

