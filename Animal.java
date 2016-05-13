/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public  class Animal
{
	/**
	 * Age in years
	 */
	public int Age;
	public int getAge(){ return Age; }
	
	public String Conservation_status;
	public String getCon(){ return Conservation_status; }
	
	/**
	 * A string to say what this animal eats
	 */
	public String Diet;
	public String getDiet(){ return Diet; }

	public int Feeding_Schedule;
	public int getFeeding_Schedule(){return Feeding_Schedule;}
	/**
	 * {@code true} for this animal can fly
	 * {@code false} for this animal cannot fly
	 */
	public boolean Flight;
	public boolean getFlight(){ return Flight; }

	/**
	 * String for the place where the animal lives ex: {@code "Pacific Ocean"}
	 */
	public String Habit;
	public String getHabit(){ return Habit; }

	/**
	 * {@code true} for this animal is healthy
	 * {@code false} for this animal is not healthy
	 */
	public boolean Healthy;
	public boolean getHealth(){ return Healthy; }

	/**
	 * String format for the date of the animal's last checkup {@code "MM/DD/YY"}
	 */
	public String Last_Checkup;
	public String getLastC(){ return Last_Checkup; }

	/**
	 *lifespan in years
	 */
	public int Lifespan;
	public int getLife(){ return Lifespan; }

	/**
	 * String for where the animal is located in the zoo
	 */
	public String Location;
	public String getLoc(){ return Location; }

	/**
	 * String for the species name ex: {@code "cat"}
	 */
	public String Name;
	public String getName(){ return Name; }

	/**
	 * Weight in pounds
	 */
	public double Weight;
	public double getWeight(){ return Weight; }

	/**
	 * Animal class constructor
	 */
	public Animal(int Age, String Consevervation_status, String Diet,int Feeding_Schedule, boolean Flight, String Habit, boolean healthy, String Last_Checkup,  int Lifespan, String Location, String Name, double Weight){
		this.Age = Age;
		this.Conservation_status = Consevervation_status;
		this.Diet = Diet;
		this.Feeding_Schedule = Feeding_Schedule;
		this.Flight = Flight;
		this.Habit = Habit;
		this.Healthy = healthy;
		this.Last_Checkup = Last_Checkup;
		this.Lifespan = Lifespan;
		this.Location = Location;
		this.Name = Name;
		this.Weight = Weight;
	}

	/**
	 * Zoo keeper sends the animal to have a check up
	 */
	public void CheckUp() {
		// TODO implement me
	}

	/**
	 * Zoo keeper feeds the animal
	 */
	public String Feed(){
		return getName() + " some yummy " + getDiet();
	}

	/**
	 * Move moves the animal to a new location on the zoo
	 * @param newLoc is a string for where the animal is going to be moved to
	 * @return A string to where the animal was moved to
	 */
	public String Move(String newLoc) {
		Location = newLoc;
		return getLoc();
	}
	/**
	 * @return full conservation status
	 */
	public String dispCon(){
		switch(getCon()){
			case "LC":
				return "Least Concern"; 
			case "NT":
				return "Near Threatened"; 
			case "VU":
				return "Vulnerable";
			case "EN":
				return "Endangered";
			case "CR":
				return "Critically Endangered";
			case "EW":
				return "Extinct In The Wild";
			case "EX":
				return "Extinct";
			case "DD":
				return "Data Deficient";
			default:
				return "";
		}
	}
	
	/**
	 * @return A neat display of all the Animal object's information
	 */
	@Override
	public String toString(){
		String temp = "Infomation for ";
		temp += getName() + " of type: " + this.getClass().getName() + "\n";
		temp += "Age in years: " + getAge() + "\n";
		temp += "Conservation Satus: " + getCon() + ", which traslates to: " + dispCon()+".\n";
		temp += "Diet: " + getDiet() + "\n";
		temp += "Can it fly? " + ((getFlight()) ? "Yes" : "no") + "\n";
		temp += "Natural Habit: " + getHabit() + "\n";
		temp += "Is it Healthy? " + ((getHealth()) ? "Yes" : "no") + "\n";
		temp += "Last check up was on: " + getLastC() + "\n";
		temp += "Average Lifespan in years: " + getLife() + "\n";
		temp += "Location in Zoo: " + getLoc() + "\n";
		temp += "Weight in pounds: " + getWeight() + "\n";
		return temp;
	}
}