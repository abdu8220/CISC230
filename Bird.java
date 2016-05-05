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
	public Bird(int Age,String Consevervation_status,String Diet,boolean Flight,String Habit
	,boolean Healthy,String Last_Checkup,int Lifespan,String Location,int Weight,int flightSpeed, int wingspan){
		super(Name,Age,Consevervation_status,Diet,Flight,Habit,Healthy,Last_Checkup,Lifespan,Location,Weight);
		this.flightSpeed = flightSpeed;
		this.wingspan = wingspan;
	}
	public String toString()
	{
		String info = super.toString();
		info += "Flight speed:" + getFlightSpeed() + " mph.\n";
		info += "Wingspan: " + getWingspan() + " inch.\n";
		return info;
	}

}

