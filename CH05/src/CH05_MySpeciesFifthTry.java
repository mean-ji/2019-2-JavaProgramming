import java.util.*;


public class CH05_MySpeciesFifthTry {
	private String name;
	private int population;
	private double growthRate;
	
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine( );
		System.out.println("What is the population of the species?");
		keyboard = new Scanner(System.in);
		population = keyboard.nextInt( );
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = keyboard.nextDouble( );
	}
	public void writeOutput() {
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}
	public int predictPopulation(int years) {
		int result = 0;
		double populationAmount = population;
		int count = years;
		while ((count > 0) && (populationAmount > 0))
		{
		populationAmount = (populationAmount +
		(growthRate / 100) * populationAmount);
		count--; }
		if (populationAmount > 0)
		result = (int)populationAmount;
		return result;
	}
	public String getName() {
		return name;
	}
	public int getPopulation() {
		return population;
	}
	public double getGrowthRate() {
		return growthRate;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setPopulation (int newPopulation) {
		if (newPopulation >= 0)
			population = newPopulation;
			else
			{
			System.out.println(
			"ERROR: using a negative population.");
			System.exit(0); }
	}
	public void  setGrowthRate (double newGrowthRate) {
		growthRate = newGrowthRate;
	}
	

}
