
public class Student extends Person {
	private int studentNumber;
	
	
	public int getSudentNumber() {
		
		return studentNumber;
	}
	
	public void reset(String newName, int newStudentNumber)
	{
		super.setName(newName);
	 	studentNumber = newStudentNumber;
	}
	
	public Student() {
		super();
		studentNumber = 0;
	}
	

	public String toString() {
		return (super.toString()+"\nStudent Number: "
				+getSudentNumber());
	}
	
	
	
	public void setStudentNumber(int newStudentNumber)
	{
		studentNumber = newStudentNumber;
	}
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		super(string);
		studentNumber = i;
	}
	
	
	
	public boolean equals(Student otherStudent) //
	{
	return (super.sameName(otherStudent)
	&& (this.studentNumber == otherStudent.studentNumber)); 
	}
	
	public void writeOutput() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
