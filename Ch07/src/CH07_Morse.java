
public class CH07_Morse {

	private static String[] morse = {"o‐", "‐ooo", "‐o‐o","‐oo","o",
	"oo‐o","‐‐o","oooo","oo","o‐‐‐", "‐o‐","o‐oo","‐‐",
	"‐o","‐‐‐", "o‐‐o","‐‐o‐","o‐o","ooo","‐", "oo‐",
	"ooo‐","o‐‐","‐oo‐","‐o‐‐","‐‐oo"};
	public static String convert(String word){
		String wordd="";
		for(int i = 0; i < word.length(); i++) {
			switch(word.substring(i,i+1)) {
			case "A" : wordd=wordd+morse[0];break;
			case "B" : wordd=wordd+morse[1];break;
			case "C" : wordd=wordd+morse[2];break;
			case "D" : wordd=wordd+morse[3];break;
			case "E" : wordd=wordd+morse[4];break;
			case "F" : wordd=wordd+morse[5];break;
			case "G" : wordd=wordd+morse[6];break;
			case "H" : wordd=wordd+morse[7];break;
			case "I" : wordd=wordd+morse[8];break;
			case "J" : wordd=wordd+morse[9];break;
			case "K" : wordd=wordd+morse[10];break;
			case "L" : wordd=wordd+morse[11];break;
			case "M" : wordd=wordd+morse[12];break;
			case "N" : wordd=wordd+morse[13];break;
			case "O" : wordd=wordd+morse[14];break;
			case "P" : wordd=wordd+morse[15];break;
			case "Q" : wordd=wordd+morse[16];break;
			case "R" : wordd=wordd+morse[17];break;
			case "S" : wordd=wordd+morse[18];break;
			case "T" : wordd=wordd+morse[19];break;
			case "U" : wordd=wordd+morse[20];break;
			case "V" : wordd=wordd+morse[21];break;
			case "W" : wordd=wordd+morse[22];break;
			case "X" : wordd=wordd+morse[23];break;
			case "Y" : wordd=wordd+morse[24];break;
			case "Z" : wordd=wordd+morse[25];break;
			default: break;
			}
		}
		
		return wordd;
		}
	}
