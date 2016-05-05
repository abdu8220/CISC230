/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Amphibian extends Animal
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int NumberOfLegs;
	public int getNumberOfLegs(){ return NumberOfLegs; }

	public Amphibian(int Age, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean healthy, String Last_Checkup, int Lifespan, String Location, String Name, int Weight, int NumberOfLegs){
		super(Age, Consevervation_status, Diet, Flight,  Habit, healthy, Last_Checkup, Lifespan, Location, Name, Weight);
		this.NumberOfLegs = NumberOfLegs;
	}
}

