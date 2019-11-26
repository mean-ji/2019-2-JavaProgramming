import java.util.Scanner;

public class CH11_RecursionCountOnes {
	public static void main(String[] args)
	{
		System.out.println("Enter a nonnegative number:");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt( );
		System.out.println(number + " contains "+ numberOfOnes(number) +" ones");
	}
	
	public static int numberOfOnes(int n)
	{
		if (n == 1)
			return 1;
		else if(n == 0) return 0;
		else 
			return (n % 10 == 1) ? 1 + (numberOfOnes(n/10)) : (numberOfOnes(n/10));

	}
}
