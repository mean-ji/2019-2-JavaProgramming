import java.util.*;
public class CH03_MyEnumTest {
	enum Weeks {MON, TUE, WED,THR,FRI,SAT,SUN}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weeks[] arr = Weeks.values();
		for (Weeks rating : arr) {
			switch (rating) {
			case MON:
			System.out.println("Monday!");
			break;
			case TUE:
			System.out.println("Tuesday!");
			break;
			case WED:
			System.out.println("Wednesday!");
			break;
			case THR:
			System.out.println("Thursday!");
			break;
			case FRI:
			System.out.println("Friday!");
			break;
			case SAT:
			System.out.println("Saturday!");
			break;
			case SUN:
			System.out.println("Sunday");
			break;
			}
		}
	}

}
