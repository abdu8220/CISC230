
/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public  class Animal
{
	public int Age;
	public int getAge(){ return Age; }


	public String Conservation_status;
	public String getCon(){return Conservation_status; }
	public String dispCon(){
		String str = " ";
		if(this.Conservation_status.equals("LC"))str ="Least Concern";
		if(this.Conservation_status.equals("NT"))str = "Near Threatened";
		if(this.Conservation_status.equals("VU"))str = "Vulnerable";
		if(this.Conservation_status.equals("EN"))str = "Endangered";
		if(this.Conservation_status.equals("CR"))str = "Critically Endangered";
		if(this.Conservation_status.equals("EW"))str = "Extinct In The Wild";
		if(this.Conservation_status.equals("EX"))str = "Extinct";
		if(this.Conservation_status.equals("DD"))str = "Data Deficient";

		return str;
	}
	/**
	 * A string to say what this animal eats
	 */
	public String Diet;
	public String getDiet(){ return Diet; }

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
	public Animal(int Age, String Consevervation_status, String Diet, boolean Flight, String Habit, boolean healthy, String Last_Checkup,  int Lifespan, String Location, String Name, double Weight){
		this.Age = Age;
		this.Conservation_status = Consevervation_status;
		this.Diet = Diet;
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
	public void Feed(){}

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
