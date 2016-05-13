import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * This is the class made to execute the program
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Zoo {
	static String fileName;
	static String record = "";
	static StringTokenizer field;
	static File file;
	static Scanner scan;
	static ArrayList<Animal> AnimalsList = new ArrayList<Animal>();
	static ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
	
	public static void main(String[] args){
		fileName = "src/Animal.txt";
		file = new File(fileName);
		
		try { scan = new Scanner(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
		
		try { animalFileHandle(); } catch (IOException e) {e.printStackTrace(); }
		
		try { employeeFileHandle(); } catch (IOException e) { e.printStackTrace(); }
		
		// Feeding the zoo's animals
		System.out.print("2*Feeding all of the zoo's animals:\n..................................\n");

		for( Animal a : AnimalsList ){
			a.Feed();
		}
	}
	
	public static void animalFileHandle() throws IOException{
		// Animals attributes
		String Name = "", Consevervation_status = "", Diet="", Habit = "", Last_Checkup = "", Location = "";
		boolean Flight = false, Healthy = false;
		int Lifespan = 0, flightSpeed = 0, wingspan = 0, Age = 0, numOfArms = 0, numOfLegs = 0, swimSpeed = 0, waterTemp = 0, numOfFins = 0, Feeding_Schedule = 0, animalType = 0;
		double Weight = 0;
		
		while (scan.hasNext()){//Animal file management
			record = scan.nextLine();
			field = new StringTokenizer(record,",");
			animalType = Integer.parseInt(field.nextToken());
			Name= field.nextToken();
			Age= Integer.parseInt(field.nextToken());
			Consevervation_status= field.nextToken();
			Diet= field.nextToken();
			Feeding_Schedule = Integer.parseInt(field.nextToken());
			Flight= Boolean.parseBoolean(field.nextToken());
			Habit= field.nextToken();
			Healthy= Boolean.parseBoolean(field.nextToken());
			Last_Checkup= field.nextToken();
			Lifespan= Integer.parseInt(field.nextToken());
			Location= field.nextToken();
			Weight= Double.parseDouble(field.nextToken());

			switch (animalType){
				case 1:
					numOfLegs = Integer.parseInt(field.nextToken());
					AnimalsList.add(new Amphibian(Age, Consevervation_status, Diet,Feeding_Schedule, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfLegs));
					break;

				case 2:
					flightSpeed = Integer.parseInt(field.nextToken());
					wingspan= Integer.parseInt(field.nextToken());
					AnimalsList.add(new Bird(Age, Consevervation_status, Diet,Feeding_Schedule, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, flightSpeed,wingspan));
					break;

				case 3:
					numOfArms = Integer.parseInt(field.nextToken());
					numOfLegs = Integer.parseInt(field.nextToken());
					AnimalsList.add(new Mammal(Age, Consevervation_status, Diet,Feeding_Schedule, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfArms,numOfLegs));
					break;

				case 4:
					numOfFins = Integer.parseInt(field.nextToken());
					swimSpeed = Integer.parseInt(field.nextToken());
					waterTemp = Integer.parseInt(field.nextToken());
					AnimalsList.add(new Fish(Age, Consevervation_status, Diet,Feeding_Schedule, Flight,  Habit, Healthy, Last_Checkup, Lifespan, Location, Name, Weight, numOfFins,swimSpeed,waterTemp));
					break;
							
				default:
					System.out.println("Default Case");
			}//end switch
		}//end Animal while loop
		scan.close();
		//Part2
		// Printing toString of AnimalsList
		System.out.println("1* Information about current zoo's animals:");
		for ( Animal a : AnimalsList ) {
			System.out.println(a);
		}
	}
	
	public static void employeeFileHandle() throws IOException{
		fileName = "src/Employee.txt";
		file = new File(fileName);
		try { scan = new Scanner(file); } catch (FileNotFoundException e) { e.printStackTrace(); }

		//Attributes for Employee:
		String empAddress = "", empName = "", empPhone = "", empSSN = "";
		int empHours = 0, empID = 0, empType = 0;
		double empSalary = 0;

		while (scan.hasNext()){
			record = scan.nextLine();
			field = new StringTokenizer(record,",");
			empType = Integer.parseInt(field.nextToken());
			empAddress= field.nextToken();
			empHours = Integer.parseInt(field.nextToken());
			empID = Integer.parseInt(field.nextToken());
			empName = field.nextToken();
			empPhone = field.nextToken();
			empSalary = Double.parseDouble(field.nextToken());
			empSSN = field.nextToken();

			switch (empType){
				case 1:
					EmployeeList.add(new ZooManager(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 2:
					EmployeeList.add(new ZooKeeper(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 3:
					EmployeeList.add(new Zoologist(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 4:
					EmployeeList.add(new Vet(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 5:
					EmployeeList.add(new VetTech(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 6:
					EmployeeList.add(new GuestSerManager(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 7:
					EmployeeList.add(new GuestSerEmp(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 8:
					EmployeeList.add(new VolunteerManager(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				case 9:
					EmployeeList.add(new Volunteer(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN)); break;
				default:
					System.out.println("Default Case");
			}//end switch
		}//end employee while loop
		scan.close();
		// Printing toString of EmlpoyeeList
		System.out.println("3* Information about current zoo's employees:");
		for ( Employee e : EmployeeList ){
			System.out.println(e);
		}
	}
}
