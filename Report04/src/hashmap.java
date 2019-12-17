import java.util.HashMap;
import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		int input = 0;
		Scanner keyboard = new Scanner(System.in);
		
		HashMap<Integer, Integer> number = 
				new HashMap<Integer,Integer>();
		System.out.println("input number:");
		int count = 0;
		
		while(true) {
			input = keyboard.nextInt();
			if(input==-1) break;
			else {
				if(number.containsKey(input)==true) {
					number.put(input,number.get(input)+1);
				}else {
					number.put(input,1);
				}
			}
			
		}
		printMap(number);
		
		
	}

	private static void printMap(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		System.out.println("Map contains: ");
		for(Integer number : map.keySet()) {
			Integer count = map.get(number);
			System.out.println("The number "+number + " occurs " +
			count +" times.");
		}
		System.out.println();
		
	}

}
