import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class RunSIS
	{
	//arraylist and variables
	static ArrayList<Student>TVShows = new ArrayList<Student>();
	static String student;
	
		public static void main(String[] args) throws IOException
			{
			fillArrayList();
			}
		public static void fillArrayList() throws IOException
		{
			//filling arraylist
			Scanner myFile = new Scanner(new File("StudentList.txt"));
			while (myFile.hasNext()) {	
				student = myFile.nextLine();
		}
			//printing out main menu
			Scanner userInt = new Scanner(System.in);
			System.out.println("What would you like to do?");
			System.out.println("1) add or delete a student");
			System.out.println("2) change student grades/schedule");
			System.out.println("3) sort students");
			
			
			
			

			}

	}
