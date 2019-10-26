import java.util.*;
public class CH05_PassFail {
	
	private String name;
	private int score;
	
	public void writeoutput() {
	String grade;
	if (score > 50)
	grade = "pass";
	else
	grade = "fail";
	System.out.println(name + ": " + score + ": " + grade);
	}
	
	public int getScore() {return score;}
	
	public String getName() {return name;}
	
	public void setdata(String s_name, int s_score){
	name = s_name;
	score = s_score;
	}
	
	public Boolean equals(CH05_PassFail in_object) {
		if( this.score == in_object.score ) return true;
		return false;
	}
	
	public void copyFrom(CH05_PassFail in_object) {
		in_object = this;
	}
	
	public static void identifyOrSameValue(CH05_PassFail student1, CH05_PassFail student2) {
		if(student1.equals(student2) == true) student1.copyFrom(student2);
		else student1.score = student2.score;
	}

	

}
