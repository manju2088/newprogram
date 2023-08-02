package program;

public class InheritanceC extends InheritanceA{
	public void monkey() {
		System.out.println("husss");
	}

	public static void main(String[] args) {
		InheritanceC ref=new InheritanceC();
		ref.dog();
		ref.cat();
		ref.monkey();
		ref.tiger();
	
	}

}
