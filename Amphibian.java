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
	public int getNumberOfLegs()
	{
		return NumberOfLegs;
	}

	public Amphibian(String Name, int Age,String Consevervation_status,String Diet,boolean Flight,String Habit
		,boolean Healthy,String Last_Checkup,int Lifespan,String Location,int Weight,int NumberOfLegs){

		super(Name,Age,Consevervation_status,Diet,Flight,Habit,Healthy,Last_Checkup,Lifespan,Location,Weight);
		this.NumberOfLegs = NumberOfLegs;
	}


}

