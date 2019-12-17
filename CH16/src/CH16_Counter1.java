
public class CH16_Counter1 extends Thread{
	protected int count;
	protected int inc;
	protected int delay;
	
	public CH16_Counter1( int init, int inc, int delay ) { this.count = init;
	this.inc = inc;
	this.delay = delay;
	}
	
	public void run() {
		try {
			for(int i = 0; i<10; i++) {
				System.out.println(count+""+"  count1");
				count += inc;
				sleep(delay);
			}
		}catch (InterruptedException e) {}
	}
}
