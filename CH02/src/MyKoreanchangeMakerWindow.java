import javax.swing.*;
	public class MyKoreanchangeMakerWindow
	{
		public static void main(String[] args)
		{
			String amountString =
					JOptionPane.showInputDialog("Enter a whole number from 1 to 99.\n"+
							"I will output a combination of coins\n"+
							"that equals that amount of change.");

			int amount, originalAmount,
			n1, n2, n3, n4, n5;
			amount = Integer.parseInt(amountString);

			
			originalAmount = amount;
			n1 = amount/500;
			amount = amount%500;
			n2 = amount/100;
			amount = amount%100;
			n3 = amount/10;
			amount = amount%10;
			n4 = amount/5;
			amount = amount%5;
			n5 = amount/1;
			
			JOptionPane.showMessageDialog(null,originalAmount
					+ " cents in coins can be given as:\n"
					+ n1 + " 500 won\n"
					+ n2 + " 100 won\n"
					+ n3 + " 10 won\n"
					+ n4 + " 5 won\n"
					+ n5 + " 1 won");
			System.exit(0);
		}
	}