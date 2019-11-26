import java.util.*;
public class Movie_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		movie1.setName("Rambo");
		movie1.setMPAA("R");
		movie2.setName("Abominable Movie");
		movie2.setMPAA("PG");
		
		System.out.println("*****************Before evaluate***************");
		String name1=movie1.getName();
		String MPAA1=movie1.getMPAA();
		int terrible1=movie1.getTerrible();
		int bad1=movie1.getBad();
		int ok1=movie1.getOK();
		int good1=movie1.getGood();
		int great1=movie1.getGreat();
		double average1=movie1.getAverage();
		System.out.println("Movie1: " + name1);
		System.out.println("MPAA: " + MPAA1);
		System.out.println("Terrible: " + terrible1);
		System.out.println("Bad: " + bad1);
		System.out.println("OK: " + ok1);
		System.out.println("Good: " + good1);
		System.out.println("Great: " + great1);
		System.out.println("Average: " + average1);
		
		System.out.println("");
		
		String name2=movie2.getName();
		String MPAA2=movie2.getMPAA();
		int terrible2=movie2.getTerrible();
		int bad2=movie2.getBad();
		int ok2=movie2.getOK();
		int good2=movie2.getGood();
		int great2=movie2.getGreat();
		double average2=movie2.getAverage();
		System.out.println("Movie1: " + name2);
		System.out.println("MPAA: " + MPAA2);
		System.out.println("Terrible: " + terrible2);
		System.out.println("Bad: " + bad2);
		System.out.println("OK: " + ok2);
		System.out.println("Good: " + good2);
		System.out.println("Great: " + great2);
		System.out.println("Average: " + average2);
		System.out.println("***********************************************");
		System.out.println("");
		for(int i = 1; i <= 5; i++) {
		System.out.println("------Choose 1 movie you want to evaluate------");
		
		Scanner keyboard = new Scanner(System.in);
		int n1;
		do{
			System.out.print("Input!! (1 is Movie1, 2 is Movie2) : ");
			n1 = keyboard.nextInt();
		}while(n1<1 || n1>2);
		
		System.out.println("");
		
		System.out.println("----------------Evaluate Movie------------------");
		System.out.println("1 is Terrible");
		System.out.println("2 is Bad");
		System.out.println("3 is OK");
		System.out.println("4 is Good");
		System.out.println("5 is Great");
		int n2;
		do{
			System.out.print("Input your evaluate: ");
			n2 = keyboard.nextInt();
		}while(n2<1 || n2>5);
		
		switch(n1) {
		case 1: movie1.addRating(n2); break;
		case 2: movie2.addRating(n2); break;
		default: break;
		}
		
		}
		movie1.setAverage();
		average1=movie1.getAverage();
		terrible1=movie1.getTerrible();
		bad1=movie1.getBad();
		ok1=movie1.getOK();
		good1=movie1.getGood();
		great1=movie1.getGreat();
		System.out.println("**************After evaluate******************");
		System.out.println("Movie1: " + name1);
		System.out.println("MPAA: " + MPAA1);
		System.out.println("Terrible: " + terrible1);
		System.out.println("Bad: " + bad1);
		System.out.println("OK: " + ok1);
		System.out.println("Good: " + good1);
		System.out.println("Great: " + great1);
		System.out.println("Average: " + average1);
		
		System.out.println("");
		terrible2=movie2.getTerrible();
		bad2=movie2.getBad();
		ok2=movie2.getOK();
		good2=movie2.getGood();
		great2=movie2.getGreat();
		movie2.setAverage();
		average2=movie2.getAverage();
		System.out.println("Movie1: " + name2);
		System.out.println("MPAA: " + MPAA2);
		System.out.println("Terrible: " + terrible2);
		System.out.println("Bad: " + bad2);
		System.out.println("OK: " + ok2);
		System.out.println("Good: " + good2);
		System.out.println("Great: " + great2);
		System.out.println("Average: " + average2);
		System.out.println("***********************************************");
		
		
		
	}

}
