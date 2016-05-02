/**
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Mammal extends Animal
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int NumberofArms;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int NumberOfLegs;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Mammal(int Age, String Birth_method, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean heathly, int height, String Last_Checkup, int Length, int Lifespan, String Location, String Name, int Weight){
		super(Age, Birth_method, Consevervation_status, Diet, Flight,  Habit, heathly, height, Last_Checkup, Length, Lifespan, Location, Name, Weight);
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
}

