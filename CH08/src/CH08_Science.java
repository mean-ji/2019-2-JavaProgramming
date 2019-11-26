
public class CH08_Science extends CH08_Book {
	
	private String publisher;
	
	public CH08_Science() {
		super();
	}

	public CH08_Science(String bookName, String string2) {
		// TODO Auto-generated constructor stub
		super(bookName);
		publisher = string2;
		
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
	public String toString() {
		return (super.toString()+"\nPublisher: "+publisher);
	}

}
