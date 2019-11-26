
public class Undergraduate extends Student {

	private int level;
	
	public void setLevel(int i) {
		level = i;
	}
	

	
	public int getLevel() {
		return level;
	}
	
	public String toString() {
		return (super.toString()+"\nStudent Level: "+getLevel());
	}
	
	public Undergraduate() {
		super();
		level = 0;
	}
	
	public void reset(String newName, int newStudentNumber,int newLevel)
	{
	 	super.setName(newName);
	 	super.setStudentNumber(newStudentNumber);
	 	level = newLevel;
	}

	public Undergraduate(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		super(string,i);
		level = j;
	}
	
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
}
