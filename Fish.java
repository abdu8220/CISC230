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


	public Fish(String Name, int Age,String Consevervation_status,String Diet,boolean Flight,String Habit
		,boolean Healthy,String Last_Checkup,int Lifespan,String Location,int Weight,int numOfFins, int swimSpeed, int waterTemp){
			super(Name,Age,Consevervation_status,Diet,Flight,Habit,Healthy,Last_Checkup,Lifespan,Location,Weight);

			this.numOfFins = numOfFins;
			this.swimSpeed = swimSpeed;
			this.waterTemp = waterTemp;

	}
	public String toString()
		{
			String info = super.toString();
			info += "Number of fins:" + getNumOfFins() + " fins.\n";
			info += "Swim Speed: " + getSwimSpeed() + " mph.\n";
			info += "Water temperature: " + getWaterTemp() + " F.\n";
			return info;
	}

}

