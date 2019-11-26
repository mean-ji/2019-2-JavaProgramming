
public class Faculty extends Employee2 {
	
	private String title;
	

	
	public String getTitle() {
		return title;
	}
	
	
	
	public String toString() {
		return (super.toString()
				+"\nTitle: "+getTitle());
	}
	
	

	public Faculty(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
		super(string,string2,i);
		title = string3;
	}
	
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	
	public void setLevel(String i) {
		title = i;
	}
	
	
	public void reset(String newName, int id,String i)
	{
	 	super.setName(newName);
	 	super.setemployID(id);
	 	title = i;
	}



}
