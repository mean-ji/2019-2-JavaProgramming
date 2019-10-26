import java.util.Scanner;
public class CH04_MyDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number:");
		int n1;
		Scanner keyboard = new Scanner(System.in);
		n1=keyboard.nextInt();
		int count;
		for(count = 0; count < n1; count++) {
			for(int j = 0; j <= count ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(count = n1; count > 0; count--) {
			for(int j = count; j  > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
