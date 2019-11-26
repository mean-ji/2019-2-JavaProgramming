import java.util.*;
public class Rock_Paper_Scissor {

	public static void main(String[] args) {
		int result_num=0;
		String result="The winner is: ";
		String s1, s2;
		
		while(result_num==0) {
			System.out.println("*********************");
			System.out.println("input P or p is paper");
			System.out.println("input R or r is rock");
			System.out.println("input S or s is scissor");
			Scanner keyboard = new Scanner(System.in);
			System.out.print("People1: ");
			s1=keyboard.next();
			System.out.print("People2: ");
			s2=keyboard.next();
			if(s1.compareTo("r")==0 || s1.compareTo("R")==0) {
				if(s2.compareTo("s")==0 || s2.compareTo("S")==0) {
					result_num = 1;
					System.out.println(result+"People1");
					break;
				}
			}
			if(s1.compareTo("p")==0 || s1.compareTo("P")==0) {
				if(s2.compareTo("r")==0||s2.compareTo("R")==0) {
					result_num = 1;
					System.out.println(result+"People1");
					break;
				}
			}
			if(s1.compareTo("s")==0 || s1.compareTo("S")==0) {
				if(s2.compareTo("p")==0 || s2.compareTo("P")==0) {
					result_num = 1;
					System.out.println(result+"People1");
					break;
				}
			}
			if(s2.compareTo("r")==0 || s2.compareTo("R")==0) {
				if(s1.compareTo("s")==0 || s1.compareTo("S")==0) {
					result_num = 1;
					System.out.println(result+"People2");
					break;
				}
			}
			if(s2.compareTo("p")==0 || s2.compareTo("P")==0) {
				if(s1.compareTo("r")==0 || s1.compareTo("R")==0) {
					result_num = 1;
					System.out.println(result+"People2");
					break;
				}
			}
			if(s2.compareTo("s")==0||s2.compareTo("S")==0) {
				if(s1.compareTo("P")==0||s1.compareTo("P")==0) {
					result_num = 1;
					System.out.println(result+"People2");
					break;
				}
			}
			
		}

	}

}
