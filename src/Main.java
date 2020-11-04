
public class Main {

	public static void main(String[] args) 
	{
		MemberOne m1 = new MemberOne();
		MemberTwo m2 = new MemberTwo();
		MemberThree m3 = new MemberThree();
		
		MessageGroup g1 = new MessageGroup();

		g1.attach(m1);
		g1.notifyUpdate(new Message("Hallo"));
		g1.attach(m2);
		g1.notifyUpdate(new Message("Hallo wie gehts"));

		g1.detach(m1);
		g1.attach(m3);
		g1.notifyUpdate(new Message("Member 3 wurde hinzugefügt"));
	}
}
