import java.util.*;
public class CH06a_Pet_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CH06a_Pet p;
		System.out.println("\nExample 1 ‐ No parameter");
		p = new CH06a_Pet();
		p.writeOutput();
		
		System.out.println("\nExample 2‐1 ‐ Full parameter");
		p = new CH06a_Pet("cat",5,2.2);
		p.writeOutput();
		
		System.out.println("\nExample 2‐2 ‐ Negative Age");
		p = new CH06a_Pet("cat",-5,2.2);
		p.writeOutput();
		
		System.out.println("\nExample 2‐3 ‐ Negative Weight");
		p = new CH06a_Pet("cat",5,-2.2);
		p.writeOutput();
		
		System.out.println("\nExample 3 ‐ Name parameter");
		p = new CH06a_Pet("cat");
		p.writeOutput();
		
		System.out.println("\nExample 4‐1 ‐ Age parameter");
		p = new CH06a_Pet(5);
		p.writeOutput();
		
		System.out.println("\nExample 4‐2 ‐ Negative Age");
		p = new CH06a_Pet(-5);
		p.writeOutput();
		
		System.out.println("\nExample 5‐1 ‐ Weight parameter");
		p = new CH06a_Pet(2.2);
		p.writeOutput();
		
		System.out.println("\nExample 5‐2 ‐ Negative Weight");
		p = new CH06a_Pet(-2.2);
		p.writeOutput();
	}

}
