import java.util.ArrayList;
/**
 * This is the class made to execute the program
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Zoo {

	public static void main(String[] args) {
		ArrayList<Animal> AnimalsList = new <Animal>ArrayList(20);

		AnimalsList.add(0,new Bird("Rhinoceros Hornbill",20,"NT","Fruits",true,"Island Tropical Forest",true,"02/06/2016",35,"Tropics Trail",5,19,60));
		System.out.println(AnimalsList);
	}

}
