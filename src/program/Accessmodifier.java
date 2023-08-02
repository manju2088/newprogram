package program;

public class Accessmodifier {
	
	private int i=10;
	private void accessmodifier()
	{
		System.out.println("private access modifier");
	}
	
	public static void main(String[] args) {
		Accessmodifier ref=new Accessmodifier();
		System.out.println(ref.i);
		ref.accessmodifier();
		
	}

}
