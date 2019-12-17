
public class CH16_ThreadStackMain {
	public static void main(String[] args) { 
		BoundedStackWithGuard stack =
			new BoundedStackWithGuard(3); 
		new Producer(stack, 15).start();
		new Consumer(stack, 15).start(); }
}
