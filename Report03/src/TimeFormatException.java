
public class TimeFormatException extends Exception {
	private String str;
	public TimeFormatException()
	{ 
		str = "\nTryAgain";
	}
	public TimeFormatException(String message)
	{
		super(message);
	}
	public String toString() {
		return str;
	}
}
