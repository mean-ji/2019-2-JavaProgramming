
public class Staff extends Employee2 {

	private int payGrade;
	
	

	public int getpayGrade() {
		return payGrade;
	}
	
	public void setpayGrade(int i) {
		if(0<i&&i<21) {
			payGrade = i;
		}	
	}

	
	public String toString() {
		return (super.toString()+"\nPay Grade: "+getpayGrade());
	}
	

	public Staff(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
		super(string,string2,i);
		
		payGrade = j;
	}
	
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
	public void reset(String newName, int id,int i)
	{
	 	super.setName(newName);
	 	super.setemployID(id);
	 	payGrade = i;
	}

}
