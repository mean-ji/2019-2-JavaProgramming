
public class CH06a_Neo {
	public static int howmany;
	public String emotion;
	
	public CH06a_Neo(String string) {
		// TODO Auto-generated constructor stub
		emotion = string;
		howmany++;
	}

	public static int gethowmany(){
		return howmany;
	}
	
	public void EmoticonStyle() {
		System.out.println("Neo is " + emotion);
	}
}
