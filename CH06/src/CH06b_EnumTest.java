
public class CH06b_EnumTest {
	public static void main(String[] args){
		
		Suit s = Suit.FRI;
		System.out.println("s.ordinal()="+s.ordinal());
		System.out.println("s.compareTo(Suit.WED)="+s.compareTo(Suit.WED));
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.getColor() = "+s.getColor());
		s = Suit.MON;
		System.out.println("MON = "+s.getColor());
		s = Suit.TUE;
		System.out.println("TUE = "+s.getColor());
		s = Suit.WED;
		System.out.println("WED = "+s.getColor());
		s = Suit.THU;
		System.out.println("THU = "+s.getColor());
		s = Suit.FRI;
		System.out.println("FRI = "+s.getColor());
		s = Suit.SAT;
		System.out.println("SAT = "+s.getColor());
		s = Suit.SUN;
		System.out.println("SUN = "+s.getColor());
	}
}
