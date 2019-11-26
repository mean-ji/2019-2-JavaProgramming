import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CH10_TimesTable {
	public static void main(String[] args) {
		String fileName = "ThreeTimesTable.txt";
		PrintWriter outputStream = null;
		try
		{
			outputStream  = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file");
			System.exit(0);;
		}
		
		System.out.println("I am writing the 3 times table...\n" + 
				"3 times table was created in ThreeTimesTable.txt");
		outputStream.println("3 times table\n");
		
		for(int i = 1; i <10; i++ ) {
			outputStream.println(i+" * "+"3" +" = "+ i*3);
		}
		
		outputStream.close();
	}
}
