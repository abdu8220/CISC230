import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * This is the class made to execute the program
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Zoo {

	public static void main(String[] args) throws IOException
	{
		String fileName = "Animal.txt";
		String record = null;
		StringTokenizer field;
		File file = new File(fileName);
		int animalType = 0;
		Scanner scan = new Scanner(file);

		// Animals attributes
		String Name="",Consevervation_status="",Diet="",Habit="",Last_Checkup="",Location="";
		boolean Flight=false, Healthy=false;
		int Lifespan=0,Weight=0,flightSpeed=0,wingspan=0,Age=0,numOfArms=0,numOfLegs=0,swimSpeed=0,waterTemp=0,numOfFins=0;

		// Our Animal list declared and inizialized
		ArrayList<Animal> AnimalsList = new ArrayList<Animal>();

		while (scan.hasNext())
		{
			try{
			record = scan.nextLine();
			field = new StringTokenizer(record,",");
			animalType = Integer.parseInt(field.nextToken());

			Name= field.nextToken();
			Age= Integer.parseInt(field.nextToken());
			Consevervation_status= field.nextToken();
			Diet= field.nextToken();
			Flight= Boolean.parseBoolean(field.nextToken());
			Habit= field.nextToken();
			Healthy= Boolean.parseBoolean(field.nextToken());
			Last_Checkup= field.nextToken();
			Lifespan= Integer.parseInt(field.nextToken());
			Location= field.nextToken();
			Weight= Integer.parseInt(field.nextToken());

				switch (animalType)
				{

					case 1:
					numOfLegs = Integer.parseInt(field.nextToken());
					AnimalsList.add(new Amphibian(Age, Consevervation_status, Diet, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfLegs));
					break;

					case 2:

					flightSpeed = Integer.parseInt(field.nextToken());
					wingspan= Integer.parseInt(field.nextToken());

					AnimalsList.add(new Bird(Age, Consevervation_status, Diet, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, flightSpeed,wingspan));
					break;

					case 3:
					numOfArms = Integer.parseInt(field.nextToken());
					numOfLegs = Integer.parseInt(field.nextToken());

					AnimalsList.add(new Mammal(Age, Consevervation_status, Diet, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfArms,numOfLegs));

					break;

					case 4:

					numOfFins = Integer.parseInt(field.nextToken());
					swimSpeed = Integer.parseInt(field.nextToken());
					waterTemp = Integer.parseInt(field.nextToken());

					AnimalsList.add(new Fish(Age, Consevervation_status, Diet, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfFins,swimSpeed,waterTemp));
					break;

					default:
					System.out.println("Default Case");

				}

			}
			catch (Exception e){
				System.out.println("This is an exception! " + Name);
				e.printStackTrace();
			};

		}
		scan.close();

		for (int j = 0; j < AnimalsList.size(); j++)
		{
			System.out.println(AnimalsList.get(j));
		}
	}

}
