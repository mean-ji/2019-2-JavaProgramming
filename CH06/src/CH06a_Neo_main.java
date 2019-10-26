
public class CH06a_Neo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CH06a_Neo emoticon1 = new CH06a_Neo("Smile");
		CH06a_Neo emoticon2 = new CH06a_Neo("Angry");
		CH06a_Neo emoticon3 = new CH06a_Neo("Fighting");
		CH06a_Neo emoticon4 = new CH06a_Neo("Sad");
		CH06a_Neo emoticon5= new CH06a_Neo("Happy");
		CH06a_Neo emoticon6 = new CH06a_Neo("Sleepy");
		System.out.println("The number of Emoticons:"+ CH06a_Neo.gethowmany());
		emoticon1.EmoticonStyle();
		emoticon2.EmoticonStyle();
		emoticon3.EmoticonStyle();
		emoticon4.EmoticonStyle();
		emoticon5.EmoticonStyle();
		emoticon6.EmoticonStyle();
	}

}
