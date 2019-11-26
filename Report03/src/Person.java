
public class Person {
	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return ("\nName: "+getName());
	}
	
	public Person() {
		name = "not yet";
	}
	
	public void setName(String newName)
	{
		name = newName; 
	}
	
	public Person(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}
	public boolean sameName(Person otherPerson) {
		return (this.name.equalsIgnoreCase(otherPerson.name));
	}
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
