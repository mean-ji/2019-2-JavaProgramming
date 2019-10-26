import java.util.*;

public class CH05_MyCalculator2 {
	private int a;
	private int b;
	public void getinput() {
		printmenu();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Type 1st Num: ");
		a=keyboard.nextInt();
		System.out.print("Type 2st Num: ");
		b=keyboard.nextInt();
		
	}
	public void printresult() {
		double result;
		result=addition();
		System.out.println("a + b = "+result);
		result=substraction();
		System.out.println("a - b = "+result);
		result=multiplication();
		System.out.println("a * b = "+result);
		result=division();
		System.out.println("a / b = "+result);
	}
	private void printmenu() {
		System.out.println("*** CH05_MyCalculator2 ***");
	}
	private double addition() {
		return a+b;
	}
	private double substraction() {
		return a-b;
	}
	private double multiplication() {
		return a*b;
	}
	private double division() {
		return a/b;
	}

}
