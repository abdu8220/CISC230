import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class medicalCenter {
	FileReader inFile = null;
	BufferedReader readLine = null;
	ArrayList<String> read = new ArrayList<String>();
	
	public void start(){
		try {
			fileHandle();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		testResult[] tr = new testResult[20];
		createTR(tr, read);
		findBadR(tr);
		findT4(tr);
		
		System.out.println("All test results:");
		for(testResult t: tr){
			System.out.println(t);
		}
		
		closeEverything();
	}

	public void findT4(testResult[] tr) {
		int count = 0;
		System.out.println("Results for bilirubin tests: ");
		for(testResult t : tr){
			if(t.getTest() == 4){
				System.out.println(t);
				count++;
			}
		}
		System.out.println("Total: " + count + "\n");
	}

	public void findBadR(testResult[] tr) {
		int count = 0;
		System.out.println("Results with out of range:");
		for(testResult t : tr){
			if(!t.getIn()){
				System.out.println(t);
				count++;
			}
		}
		System.out.println("Total: " + count + "\n");
	}

	public void createTR(testResult[] tr, ArrayList<String> read) {
		String temp = "";
		int id = 0 , clinicNumber = 0, testCode = 1;
		String doctor = "", result = "", normalRange = "", comments = "";
		boolean inRange = true;
		int toB = 0;
		
		for(int x = 0; x < tr.length; x++){
			temp = read.get(x);
			id = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring(temp.indexOf(" ") + 1);
			clinicNumber = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring(temp.indexOf(" ") + 1);
			doctor = temp.substring(0, temp.indexOf(" "));
			temp = temp.substring(temp.indexOf(" ") + 1);
			testCode = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring(temp.indexOf(" ") + 1);
			result = temp.substring(0, temp.indexOf(" "));
			temp = temp.substring(temp.indexOf(" ") + 1);
			normalRange = temp.substring(0, temp.indexOf(" "));
			temp = temp.substring(temp.indexOf(" ") + 1);
			toB = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring(temp.indexOf(" ") + 1);
			inRange = (toB == 0) ? true: !true;
			comments = temp;
			tr[x] = new testResult(id, clinicNumber, doctor, testCode, normalRange,  result, inRange, comments);
		}
	}
	
	public void fileHandle() throws IOException {
		String temp = "";
		try {
			inFile = new FileReader("src/results.dat");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		readLine = new BufferedReader(inFile);
		while ((temp = readLine.readLine()) != null)
	    {
	        read.add(temp);
	    }
	}
	
	public void closeEverything() {
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			readLine.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
