import java.util.Scanner;
public class CH09_SpeedLim_main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int limit= 0, speed= 0;
		System.out.print("Input the speed limit:");
		limit= kb.nextInt();
		System.out.print("Input the current speed:");
		speed= kb.nextInt();
		CH09_SpeedLim lim= new CH09_SpeedLim(limit, speed);
		lim.SpeedWarning();
		kb.close();
	}

}
