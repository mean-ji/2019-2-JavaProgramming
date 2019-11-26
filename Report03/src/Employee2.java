
public class Employee2 extends Person {
	private String dept;
	private int employID;
	
	
	public int getemployID() {
		return employID;
	}
	
	public void setemployID(int i) {
		employID = i;
	}
	public void setdept(String i) {
		dept = i;
	}
	
	
	public String getDept() {
		return dept;
	}
	
	public String toString() {
		return (super.toString()+"\nDept: "+getDept()
		+"\nEmployee ID: "+getemployID());
	}
	
	public boolean equals(Employee2 otherEmployee) //
	{
	return (super.sameName(otherEmployee)
	&& (this.employID == otherEmployee.employID)); 
	}
	
	

	public Employee2(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
		super(string);
		dept = string2;
		employID = i;
	}
	
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
