import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CH10_Grader {
	public static PrintWriter outputStream = null;
	public static void run(String fileName, String outfileName) {
		// TODO Auto-generated method stub
		try
		{ 
			outputStream = new PrintWriter(outfileName);
		}
		catch(IOException e)
		{
		System.out.println("Error opening output file " +fileName + ".");
		System.exit(0);
		} 
		
		
		try
		{
			Scanner inputStream = new Scanner(new File(fileName));
			
			double sub1total = 0;
			double sub2total = 0;
			double sub3total = 0;
			double sub4total = 0;
			double totalAvg = 0;
			String line = inputStream.nextLine();
			outputStream.println(line);
			while(inputStream.hasNextLine()) {
				double total = 0;
				line = inputStream.nextLine();
				String[] ary = line.split(",");
				String name = ary[0];
				String id = ary[1];
				outputStream.print("\n"+ary[0]+","+ary[1]+",");
				for(int i = 2; i < 6; i++) {
					outputStream.print(ary[i]+",");
					double score = Double.parseDouble(ary[i]);
					total = total + score;
				}
				double avg = total/4;
				outputStream.print(avg);
				totalAvg = totalAvg + avg;
				sub1total = sub1total + Double.parseDouble(ary[2]);
				sub2total = sub2total + Double.parseDouble(ary[3]);
				sub3total = sub3total + Double.parseDouble(ary[4]);
				sub4total = sub4total + Double.parseDouble(ary[5]);
				
				
			}
			outputStream.print("\nAverage,000000," + sub1total/8 + ","+ sub2total/8 + ","+ sub3total/8 + ","+ sub4total/8 + ","+totalAvg/8);
			inputStream.close( );
			outputStream.close( );
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
	

}
