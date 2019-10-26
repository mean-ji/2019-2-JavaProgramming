import java.util.*;

public class MySimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input two numbers:");
		int n1, n2;
		Scanner keyboard = new Scanner(System.in);
		n1=keyboard.nextInt();
		n2=keyboard.nextInt();
		System.out.println("a + b = "+ (n1+n2));
		System.out.println("a - b = "+ (n1-n2));
		System.out.println("a * b = "+ (n1*n2));
		System.out.println("a / b = "+ (n1/n2));

	}

}
