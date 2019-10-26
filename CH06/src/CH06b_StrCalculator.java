
public class CH06b_StrCalculator {
	public static int sum;
	public static double min;
	public static double operation(int i, char c, int j) {
		// TODO Auto-generated method stub
		if(c=='+') {
			sum = i+j;
		}
		return sum;
	}

	public static double operation(String string, char c, String string2) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(string);
		int n2 = Integer.parseInt(string2);
		if(c=='+') {
			sum = n1+n2;
		}
		return sum;
	}

	public static double operation(double d, char c, double e) {
		// TODO Auto-generated method stub
		if(c=='-') {
			min = d-e;
		}
		return min;
	}
	
}
