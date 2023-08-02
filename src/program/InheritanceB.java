package program;

public class InheritanceB {  
	
	int i=10;
	static int j=20;
		
	
	//single level inheritance
	public void dog(){
		System.out.println("bark");
		
	}
	public void cat() {
		System.out.println("mauu");
	}

	public static void main(String[] args) {
		
		InheritanceB ref=new InheritanceB();
		ref.dog();
		ref.cat();
		System.out.println(ref.i);
		System.out.println(j);
	} 

}
