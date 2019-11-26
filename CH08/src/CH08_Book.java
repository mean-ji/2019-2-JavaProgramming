
public class CH08_Book {
	
	private String name;
	private int id;
	public static int count;
	
	
	public int getCount() {
		
		return count;
	}
	public int getId() {
		
		return id;
	}
	
	public String getName() {
		return name;
	}
	public CH08_Book() {
		name = "not yet";
	}
	public CH08_Book(String bookName) {
		// TODO Auto-generated constructor stub
		name = bookName;
		count++;
		id = getCount();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	public String toString() {
		return ("<<Book>>"+"\nId: "+getId()+"\nBook name: "+name);
	}

}
