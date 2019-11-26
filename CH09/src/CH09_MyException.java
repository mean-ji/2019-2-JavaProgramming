
public class CH09_MyException extends Exception {
	private String str;
	public CH09_MyException( )
	{ 
		str = "String should not include\n" + 
				"special character $.";
	}
	public CH09_MyException(String message)
	{
		super(message);
	}
	public String toString() {
		return str;
	}
	
}
