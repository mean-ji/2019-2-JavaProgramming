import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class CH12_NumIntegers {
	
	HashSet<Integer> inSet = new HashSet<Integer>();
	

	public void readdata(String fileName) {
		// TODO Auto-generated method stub
		try
		{
			Scanner inputStream = new Scanner(new File(fileName));
			String line = inputStream.nextLine();
			
			
			while(inputStream.hasNextLine()) {
				line = inputStream.nextLine();
				inSet.add(Integer.parseInt(line));
			}
			inputStream.close( );
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File " + fileName+ " not found.");
					System.exit(0);
		}  
		catch(IOException e)
		{
			System.out.println("Error opening input file "+ fileName);
			System.exit(0);
		}
	}

	public void printIntegers() {
		// TODO Auto-generated method stub
		int co = 1;
		for(Object obj : inSet.toArray()) {
			if(co % 20 == 0) {
				System.out.println("");
			}
			Integer num  = (Integer) obj;
			System.out.print(num.intValue()+ " ");
			co++;
		}
		
	}

	public int getNumIntegers() {
		// TODO Auto-generated method stub
		return inSet.size();
	}

}
