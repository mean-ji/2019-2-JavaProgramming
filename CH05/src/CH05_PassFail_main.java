
public class CH05_PassFail_main {
	public static void main(String[] args) {
		System.out.println("Before copying\n");
		String name = "Hongkildong";
		CH05_PassFail student1 = new CH05_PassFail();
		CH05_PassFail student2 = new CH05_PassFail();
		student1.setdata(name, 80);
		student2.setdata("KimChulSoo", 40);
		CH05_PassFail.identifyOrSameValue(student1, student2);
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: " + student1.toString());
		System.out.println("Hashcode of student2: " + student2.toString());
		student1.copyFrom(student2);
		System.out.println("\n\nAfter copying\n");
		CH05_PassFail.identifyOrSameValue(student1, student2);
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: " + student1.toString());
		System.out.println("Hashcode of student2 " + student2.toString());
		System.out.println("\n\nAfter assigning the variable\n");
		student1.setdata("HongKilDong", 80);
		student2.setdata("KimChulSoo", 40);
		student1 = student2;
		CH05_PassFail.identifyOrSameValue(student1, student2);
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: " + student1.toString());
		System.out.println("Hashcode of student2 " + student2.toString());

	}
}
