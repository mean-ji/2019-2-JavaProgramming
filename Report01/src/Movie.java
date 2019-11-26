
public class Movie {
	private String name;
	private String MPAA;
	public int Terrible;
	public int Bad;
	public int OK;
	public int Good;
	public int Great;
	public double average;
	
	public void addRating(int input){
		switch(input) {
		case 1: Terrible++;break;
		case 2: Bad++;break;
		case 3: OK++;break;
		case 4: Good++;break;
		case 5: Great++;break;
		default: break;
		}
	}
	public void setAverage() {
		average = (double)((Terrible*1)+(Bad*2)+(OK*3)+(Good*4)+(Great*5))/
				(Terrible+Bad+OK+Good+Great);
	}
	public double getAverage(){
		return average;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	public void setMPAA(String newName) {
		MPAA = newName;
	}
	
	public String getMPAA() {
		return MPAA;
	}
	public int getTerrible() {
		return Terrible;
	}
	public int getBad() {
		return Bad;
	}
	public int getOK() {
		return OK;
	}
	public int getGreat() {
		return Great;
	}
	public int getGood() {
		return Good;
	}

	
	
}
