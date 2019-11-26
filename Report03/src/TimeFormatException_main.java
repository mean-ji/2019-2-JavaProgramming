import java.util.Scanner;

public class TimeFormatException_main {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		boolean select = true;
		while(select) {
			try{
				System.out.println("Enter time in 24-hour notation:");
				String str= kb.nextLine();
				StringTest(str);
				
				System.out.println("Again?(y/n)");
				String yOrN= kb.nextLine();
				if(yOrN.equals("n")) select = false;
				
			}
			catch(TimeFormatException mae){
				System.out.println(mae);
			}
		}
		System.out.println("End of Program");
	}
		
	
	static void StringTest(String str) throws TimeFormatException{
		str = str.replaceAll(" ", "");
		String strhour = str.substring(0,str.lastIndexOf(":"));
		String strmin = str.substring(str.lastIndexOf(":")+1);
		if (str.contains("$") || str.contains("*") || 
				strmin.length()>2 || strhour.length()>2) {
			System.out.print("There is no such time as "+str);
			throw new TimeFormatException();
		}
		
		int hour = Integer.parseInt(strhour);
		int min = Integer.parseInt(strmin);
		
		if (min<0 || min > 60 || hour<0 || hour > 60) {
			System.out.print("There is no such time as "+str);
			throw new TimeFormatException();
		}
			
		
		
		if(hour<25 && min<61) {
			if(hour<13) {
				if(hour == 12) {
					System.out.println("That is the same as\n"+str +" PM");
				}else {
					System.out.println("That is the same as\n"+str +" AM");
				}
				
			}
				
			else {
				str= str.replace(strhour, Integer.toString(hour-12));
				System.out.println("That is the same as\n"+str +" PM");
			}
		}
		
	}

}
