
/**
 * This is the class to be extended
 * @author		Johnathan Marin-Romero
 * @version		1.0
 * @since			4/26/16
 */
public class Animal
{
	/**
	 * Age in number of years
	 */
	public int Age;
	public int getAge(){ return Age; }
	
	/**
	 * Either "Egg" or "Birth"
	 */
	public String Birth_method;
	public String getBirth(){ return Birth_method; }
	
	/**
	 *I don't really know what this is
	 */
	public String Conservation_status;
	public String getCon(){return Conservation_status; }
	
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
	 * Height in inches
	 */
	public int Height;
	public int getHieght(){ return Height; }
	
	/**
	 * String format for the date of the animal's last checkup {@code "MM/DD/YY"}
	 */
	public String Last_Checkup;
	public String getLastC(){ return Last_Checkup; }
	
	/**
	 *Length in inches
	 */
	public int Length;
	public int getLength(){ return Length; }

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
	public int Weight;
	public int getWeight(){ return Weight; }

	/**
	 * Animal class constructor
	 */
	public Animal(){
		
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
	public void Feed() {
		// TODO implement me
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
	 * @return A neat display of all the Animal object's information
	 */
	@Override
	public String toString(){
		String temp = "Infomation for ";
		temp += getName() + this.getClass().getName() + "\n";
		temp += "Age in Years: " + getAge() + "\n";
		temp += "Birth Method: " + getBirth() + "\n";
		temp += "Diet: " + getDiet() + "\n";
		temp += "Can it fly? " + (getFlight()) ? "Yes" : "no";
		temp += "Natural Habit: " + getHabit() + "\n";
		temp += "Last check up was on: " + getLastC() + "\n";
		temp += "Length in inches: " + getLength() + "\n";
		temp += "Average Lifespan in years: " + getLife() + "\n";
		temp += "Location in Zoo: " + getLoc() + "\n";
		temp += "Weight in pounds: " + getWeight() + "\n";
		return temp;
	}
}