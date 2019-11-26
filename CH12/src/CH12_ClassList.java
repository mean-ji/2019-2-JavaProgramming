import java.util.*;
public class CH12_ClassList {
	ArrayList <String> className = new ArrayList<String>();
	
	public void Print() {
		// TODO Auto-generated method stub
		
		System.out.println("\nList of Classes");
		int listSize = className.size();
		for(int position = 0; position < listSize; position++)
			System.out.println("class "+(position+1)+": "+className.get(position));
	}

	public void add(String s) {
		// TODO Auto-generated method stub
		className.add(s);
		
	}

}
