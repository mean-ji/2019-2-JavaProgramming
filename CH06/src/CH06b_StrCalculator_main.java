
public class CH06b_StrCalculator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result= 0.0;
		result= CH06b_StrCalculator.operation(10, '+', 20);
		System.out.println("Int op Int: "+ result);
		result= CH06b_StrCalculator.operation("10", '+', "20");
		System.out.println("Str op Str: "+ result);
		result= CH06b_StrCalculator.operation(10.0,'-', 20.0);
		System.out.println("Double op Double: "+ result);
	}

}
