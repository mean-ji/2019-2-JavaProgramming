
public class CH16_Counter2 implements Runnable{
	protected int count;
	protected int inc;
	protected int delay;
	
	public CH16_Counter2(int init, int inc, int delay) { this.count = init;
	this.inc = inc;
	this.delay = delay;
	}
	
	public void run() {
		try {
			for(int i = 0;i < 20; i++) {
				System.out.println(count+""+" Count2");
				count += inc;
				Thread.sleep(delay);
			}
		}catch (InterruptedException e) {}
	}
}
