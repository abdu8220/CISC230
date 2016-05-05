/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Fish extends Animal
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int numOfFins;
	public int getNumOfFins(){return numOfFins;}

	public int swimSpeed;
	public int getSwimSpeed(){return swimSpeed;}

	public int waterTemp;
	public int getWaterTemp(){return waterTemp;}


	public Fish(int Age, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean healthy, String Last_Checkup, int Lifespan, String Location, String Name, int Weight, int numOfFins, int swimSpeed, int waterTemp){
			super(Age, Consevervation_status, Diet, Flight,  Habit, healthy, Last_Checkup, Lifespan, Location, Name, Weight);
			this.numOfFins = numOfFins;
			this.swimSpeed = swimSpeed;
			this.waterTemp = waterTemp;
	}
	
	@Override
	public String toString(){
			String info = super.toString();
			info += "Number of fins:" + getNumOfFins() + " fins.\n";
			info += "Swim Speed: " + getSwimSpeed() + " mph.\n";
			info += "Water temperature: " + getWaterTemp() + " F.\n";
			return info;
	}
}