
public class BoundedStack {
	protected Object rep[]; 
	protected int front = 0; 
	protected int back = -1; 
	protected int size = 0; 
	protected int count = 0;
	
	
	public BoundedStack(int size) {
		if (size > 0) {
			this.size = size;
			rep = new Object[size];
			back = size - 1;
		} 
	}
	
	public boolean isEmpty() {
		return (count == 0); 
	}
	
	public boolean isFull() {
		return (count == size);
	}
	
	public int getCount() {
		return count; 
	}
	
	public void put(Object e) {
		if(e!=null && !isFull()) {
			back++;
			if(back>=size)
				back = 0;
			rep[back] = e;
			count++;
		}
	}
	
	public Object get() {
		Object result = null;
		if(!isEmpty()) {
			front = count-1;
			result = rep [front];
			rep[front] = null;
			
			//if(front>=size)
			//	front = 0;
			back--;
			count--;
		}
		return result;
	}
}
