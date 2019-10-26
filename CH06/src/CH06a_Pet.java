
public class CH06a_Pet {
	private String name;
	private int age; //in years
	private double weight;//in pounds
	
	public CH06a_Pet(String initialName, int initialAge, double initialWeight){
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)){
			System.out.println("Error: Negative age or weight.");
			age = 0; 
			weight=0.0;
		}
		else{
			age = initialAge;
			weight = initialWeight;
		}
	}
	public CH06a_Pet(String initialName) {
		name = initialName;
		age = 0; 
		weight=0.0;
	}
	public CH06a_Pet(int initialAge) {
		name = "No name yet";
		if (initialAge < 0){
			System.out.println("Error: Negative age.");
			age = 0; 
			weight=0.0;
		}
		else{
		age = initialAge;
		weight=0.0;
		}
	}
	public CH06a_Pet(double initialWeight) {
		name = "No name yet";
		if (initialWeight < 0){
			System.out.println("Error: Negative Weight.");
			age = 0; 
			weight=0.0;
		}
		else{
		age = 0;
		weight=initialWeight;
		}
	}
	public CH06a_Pet() {
		name = "No name yet";
		age = 0;
		weight=0.0;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getWeight() {return weight;}
	
	public void writeOutput(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age+ " years");
		System.out.println("Weight: " + weight+ " pounds");
	}
}