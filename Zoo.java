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

		//**Part1**//

		//a-Printing toString of AnimalsList
		System.out.println("***WELCOME to Minnestoa Zoo's Java-Implementation***");
		System.out.print("1* Information about current zoo's animals:\n..................................\n");

		//b- makes the animal feed themselves
		for ( Animal a : AnimalsList ) {
			System.out.println(a);
		}
		// **End Part1** //

		//**Part2**//

		//a-Printing toString of EmlpoyeeList

		System.out.print("\n3* Information about current zoo's employees:\n..................................\n");
		for ( Employee e : EmployeeList ){
					System.out.println(e);
		}

		//b-Paying the Employees
		System.out.print("4* Paying the employees :\n..................................\n");
		for ( Employee e : EmployeeList ){
			System.out.println(e.pay());
		}
		// **End Part2**//

		//**Part 3**//

		//a- Asking the zoo keeper to feed the animals
		System.out.print("\n5* Zoo Keeper feed the animals:\n..................................\n");
		((ZooKeeper) EmployeeList.get(1)).feedTheAnimals(AnimalsList);


		//b- Zoo Manager pays all the employees
		System.out.print("\n6* Zoo Manager pays the employees:\n..................................\n");
		((ZooManager) EmployeeList.get(0)).payEmployees(EmployeeList);

		//c- Guest Service manager assign duties to his employees
		System.out.print("\n7* Guest Service manager assign duties to his employees:\n..................................\n");
		((GuestSerManager) EmployeeList.get(6)).work(((GuestSerEmp)EmployeeList.get(7)),"work in the gift shop",4);
		((GuestSerManager) EmployeeList.get(6)).work(((GuestSerEmp)EmployeeList.get(8)),"sell tickets at desk#2",8);
		((GuestSerManager) EmployeeList.get(6)).work(((GuestSerEmp)EmployeeList.get(9)),"distribute zoo's brochures in the parking area",2);

		//d- Volunteer manager schedule volunteers for work hours
		System.out.print("\n8* Volunteer manager assign duties to the volunteers:\n..................................\n");
		((VolunteerManager) EmployeeList.get(10)).work(((Volunteer)EmployeeList.get(11)),"interpret artifacts along the Tropicals trail",5);
		((VolunteerManager) EmployeeList.get(10)).work(((Volunteer)EmployeeList.get(12)),"assist guest seating in the cow milking parlor",2);
		((VolunteerManager) EmployeeList.get(10)).work(((Volunteer)EmployeeList.get(13)),"handle data input for the Education Department",3);
		((VolunteerManager) EmployeeList.get(10)).work(((Volunteer)EmployeeList.get(14)),"replenish merchandise on the gift store shelves",2);

		//e- The Zoologist develop enrichments for the zoo's animals
		System.out.print("\n9* The Zoologist developing enrichments for the zoo's animals:\n..................................\n");
		for(Animal a : AnimalsList){
			((Zoologist) EmployeeList.get(2)).devlopEnrichment(a);
		}

		//f- Veterinarian give phyiscal exam for the zoo's animals
		System.out.print("\n10* Veterinarian examines all animals:\n..................................\n");
		ArrayList<Animal> sick = ((Vet) EmployeeList.get(3)).examine(AnimalsList);

		//g- Veterinarian tech gives vaccinces to sick animals
		System.out.print("\n10* Veterinarian Technician creates vaccines for sick animals:\n..................................\n");
		((VetTech) EmployeeList.get(4)).vaccinate(sick);

		//**End Part3**//

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
	}


	public static void employeeFileHandle() throws IOException{
		fileName = "src/Employee.txt";
		file = new File(fileName);
		try { scan = new Scanner(file); } catch (FileNotFoundException e) { e.printStackTrace(); }

		//Attributes for Employee:
		String empAddress = "", empName = "", empPhone = "", empSSN = "", volPeriod ="";
		int empHours = 0, empID = 0, empType = 0, numOfVolunteers=0;
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
					numOfVolunteers = Integer.parseInt(field.nextToken());
					EmployeeList.add(new VolunteerManager(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN,numOfVolunteers)); break;
				case 9:
					volPeriod = field.nextToken();
					EmployeeList.add(new Volunteer(empAddress,empHours,empID,empName,empPhone,empSalary,empSSN,volPeriod)); break;
				default:
					System.out.println("Default Case");
			}//end switch
		}//end employee while loop
		((ZooManager) EmployeeList.get(0)).setNumEmp(EmployeeList.size());
		((ZooKeeper) EmployeeList.get(1)).setNumAnimal(AnimalsList.size());
		scan.close();
	}
}
