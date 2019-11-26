
public class CH09_SpeedLim {
	private int limit;
	private int speed;
	public CH09_SpeedLim(int i, int e) {
		// TODO Auto-generated constructor stub
		limit = i;
		speed = e;
	}

	public void SpeedWarning() {
		// TODO Auto-generated method stub
		try
		{
			if(speed>=limit) {
				throw new Exception ("Speed Limit "+ limit +"km exceeded!\n" + 
			"You are being fined.");
			}
			System.out.print("You are a law abiding" + "\ncitizen\n!");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Your current speed: "+speed);
	}

}
