/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Bird extends Animal
{
	public int flightSpeed;
	public int wingspan;
	
	public int getFlightSpeed(){
		return flightSpeed;
	}
	public int getWingspan(){
		return wingspan;
	}
	public Bird(int Age, String Birth_method, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean heathly, int height, String Last_Checkup, int Length, int Lifespan, String Location, String Name, int Weight, int flightSpeed,int wingspan){
		super(Age, Birth_method, Consevervation_status, Diet, Flight,  Habit, heathly, height, Last_Checkup, Length, Lifespan, Location, Name, Weight);
		this.flightSpeed = flightSpeed;
		this.wingspan = wingspan;
	}
	public String toString()
	{
		String info = super.toString();
		info += "Flight speed:" + getFlightSpeed() + " MPH.\n";
		info += "Wingspan: " + getWingspan() + " IN.\n";
		return info;
	}

}

