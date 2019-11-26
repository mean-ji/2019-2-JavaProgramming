import java.util.*;
public class CH11_Fibonacci_main {
	
	public static int fibo(int number) {
		// TODO Auto-generated method stub
		if(number == 0 || number == 1 || number == 2) return 1;
		return fibo(number-1)+fibo(number-2);
	}

	public static void main(String[] args) {
		int number = 10;
		// TODO Auto-generated method stub
		while(number != -1) {
			System.out.println("Input n (‐1 for exit): ");
			Scanner keyboard = new Scanner(System.in);
			number = keyboard.nextInt( );
			if(number == -1) break;
			System.out.println("Fibonacci("+number + ")" + "is "+fibo(number));
		}
		System.out.println("Good Bye~!!");
	}

	

}
