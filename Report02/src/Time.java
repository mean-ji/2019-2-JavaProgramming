import java.util.Scanner;

public class Time {
	public int minute;
	public static int hour;
	public String shour;
	public static String sminute;
	public static int count=1;
	public boolean boo ;
	
	private String getTime24() {
		// TODO Auto-generated method stub
		
		
		
		count ++;
		if(count % 2 ==0) {
			if(boo == true && Integer.parseInt(shour)>=12) {
				return "0"+String.valueOf(Integer.parseInt(shour)-12)+sminute;
			}
			if(boo == false && Integer.parseInt(shour)<12) {
				return ""+String.valueOf(Integer.parseInt(shour)+12)+sminute;
			}
			else {
				return ""+shour+sminute;
			}
			
		}else {
			if(boo == false) {
				
				return ""+shour+":"+sminute+"PM";
			}
			else {
				
				return ""+shour+":"+sminute+"AM";
				
			}
		}
		
	}
	
	public Time(int i, int j) {
		// TODO Auto-generated constructor stub
		if(i<10) {
			shour = "0"+String.valueOf(i);
		}
		else {
			shour = String.valueOf(i);
			sminute = String.valueOf(j);
		}
		if(i<12) {
			boo = true;
		}
	}

	public Time(int i, int j, boolean b) {
		// TODO Auto-generated constructor stub
		if(i<10) {
			shour = "0"+String.valueOf(i);
		}
		else {
			shour = String.valueOf(i);
			sminute = String.valueOf(j);
		}
		boo = b;
	}

	public Time() {
		// TODO Auto-generated constructor stub
		hour = 0;
		minute = 0;
	}
	private Boolean isValid(int i, int j) {
		if(i>=0&&i<=23&&j<=59&&j>=0) 
			return true;
		return false;
	}
	private void setTime(int i, int j) {
		// TODO Auto-generated method stub
		Boolean isV = isValid(i,j);
		if(isV==true&&(i < 0 || i >12)) {
			hour = 12;
		}
		else if(isV==true&&(j < 0 || j > 12)) {
			minute = 12;
		}
		else if(isV==false) {
			hour =12;
			minute =12;
		}
		else {
			hour = i;
			minute= j;
		}
		
	}
	
	private void setTime(int i, int j, boolean b) {
		// TODO Auto-generated method stub
		Boolean isV = isValid(i,j);
		if(isV == true && b == true) {//am
			if(i>=1 && i<12) {
				hour = i;
				minute = j;
			}else if(i == 12) {
				hour = i-12;
				minute = j;
			}
			else {
				hour = 20;
				//minute = j;
			}
		}
		if(isV == true && b == false) {//pm
			if(i>=1 && i<12) {
				hour = i+12;
				minute = j;
			}else if(i==12) {
				hour = i;
				minute = j;
			}
			else {
				hour = 20;
				//minute = j;
			}
		}
	}
	@Override
	public String toString() {
		return "hour: " + hour +" minute: "+minute;
		
	}


	public static void main(String[] args) {

        Time time1 = new Time();
        System.out.println("Create a default time");
        System.out.println("\t should be 0, 0:  " + time1);

        System.out.println("Set the time to 12, 12");
        time1.setTime(12, 12);
        System.out.println("\t should be 12, 12:  " + time1);

        System.out.println("Trying to set time to -1, 12");
        time1.setTime(-1, 12);
        System.out.println("\t should be 12, 12:  " + time1);

        System.out.println("Trying to set time to 12, -1");
        time1.setTime(12, -1);
        System.out.println("\t should be 12, 12:  " + time1);

        System.out.println("Trying to set time to 24, 12");
        time1.setTime(24, 12);
        System.out.println("\t should be 12, 12:  " + time1);

        System.out.println("Trying to set time to 12, 60");
        time1.setTime(12, 60);
        System.out.println("\t should be 12, 12:  " + time1);


        System.out.println("Set the time to 8, 16 am");
        time1.setTime(8, 16, true);
        System.out.println("\t should be 8, 16:  " + time1);

        System.out.println("Set the time to 8, 16 pm");
        time1.setTime(8, 16, false);
        System.out.println("\t should be 20, 16:  " + time1);

        System.out.println("Trying to set time to 0, 17 am");
        time1.setTime(0, 17, true);
        System.out.println("\t should be 20, 16:  " + time1);

        System.out.println("Trying to set time to 13, 17 am");
        time1.setTime(13, 17, true);
        System.out.println("\t should be 20, 16:  " + time1);

        System.out.println("Trying to set time to 0, 17 pm");
        time1.setTime(0, 17, false);
        System.out.println("\t should be 20, 16:  " + time1);

        System.out.println("Trying to set time to 13, 17 pm");
        time1.setTime(13, 17, false);
        System.out.println("\t should be 20, 16:  " + time1);

        System.out.println("Set the time to 12, 19 am");
        time1.setTime(12, 19, true);
        System.out.println("\t should be 0, 19:  " + time1);

        System.out.println("Set the time to 12, 19 pm");
        time1.setTime(12, 19, false);
        System.out.println("\t should be 12, 19:  " + time1);

        System.out.println("\nTesting the constructors");
        System.out.println("Create the time  12, 19");
        Time time2 = new Time(12, 19);
        System.out.println("\t should be 12:19pm:  " + time2.getTime24() + " and " + time2.getTime24());
        System.out.println("Create the time  12, 19 with the other constructor");
        time2 = new Time(12, 19, false);
        System.out.println("\t should be 12:19pm:  " + time2.getTime24() + " and " + time2.getTime24());

        System.out.println("Create the time  0, 19");
        time2 = new Time(0, 19);
        System.out.println("\t should be 12:19am:  " + time2.getTime24() + " and " + time2.getTime24());
        System.out.println("Create the time  12, 19 with the other constructor");
        time2 = new Time(12, 19, true);
        System.out.println("\t should be 12:19am:  " + time2.getTime24() + " and " + time2.getTime24());

        System.out.println("Create the time  3, 19");
        time2 = new Time(3, 19);
        System.out.println("\t should be 3:19am:  " + time2.getTime24() + " and " + time2.getTime24());
        System.out.println("Create the time  3, 19 with the other constructor");
        time2 = new Time(3, 19, true);
        System.out.println("\t should be 3:19am:  " + time2.getTime24() + " and " + time2.getTime24());

        System.out.println("Create the time  15, 19");
        time2 = new Time(15, 19);
        System.out.println("\t should be 3:19pm:  " + time2.getTime24() + " and " + time2.getTime24());
        System.out.println("Create the time  3, 19 with the other constructor");
        time2 = new Time(3, 19, false);
        System.out.println("\t should be 3:19pm:  " + time2.getTime24() + " and " + time2.getTime24());


    }

	



}
