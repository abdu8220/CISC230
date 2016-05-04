/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Bird extends Animal
{
	public int FlightSpeed;
	public int Wingspan;
	
	public int getFlightSpeed(){
		return FlightSpeed;
	}
	public int getWingspan(){
		return Wingspan;
	}
	public Bird(String Consevervation_status, String Diet, boolean Flight, String Habit, boolean heathly, int height, String Last_Checkup, int Length, int Lifespan, String Location, String Name, int Weight, int FlightSpeed,int Wingspan){
		super(Consevervation_status, Diet, Flight,  Habit, heathly, height, Last_Checkup, Length, Lifespan, Location, Name, Weight);
		this.FlightSpeed = FlightSpeed;
		this.Wingspan = Wingspan;
	}
	public String toString()
	{
		String info = super.toString();
		info += "Flight speed:" + getFlightSpeed() + " mph\n";
		info += "Wingspan: " + getWingspan() + " in\n";
		return info;
	}

}

