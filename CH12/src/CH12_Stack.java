
public class CH12_Stack {
	private ListNode head;
	

	public void Push(String string) {
		// TODO Auto-generated method stub
		head = new ListNode (string, head);
	}

	public void showData() {
		// TODO Auto-generated method stub
		ListNode position = head;
		System.out.println ("============");
		System.out.println ("Stack Status");
		System.out.println ("============");
		
		while(position != null) {
			System.out.println (position.data);
			position = position.link;
			System.out.println("------------");
		}
	}

	public void Pop() {
		// TODO Auto-generated method stub
		if (head != null) head = head.link;
		else {
			System.out.println ("Deleting from an empty list.");
			System.exit (0); 
		}
	}
	private class ListNode{
		private String data;
		private ListNode link;
		public ListNode (){
			link = null;
			data = null;
		}
		public ListNode (String newData, ListNode linkValue) {
			data = newData;
			link = linkValue;
		}
	}

}
