package program;

public class Methodoverridingsub {
	
	public void methodoverriding (int i) {
		System.out.println("subclass method");
	}

	public static void main(String[] args) {
		Methodoverridingsub ref=new Methodoverridingsub();
		ref.methodoverriding(11);
	
	}

}
