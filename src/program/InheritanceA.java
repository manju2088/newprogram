package program;

public class InheritanceA extends InheritanceB {
	public void tiger() {
		System.out.println("harr");
	}
	
	public static void main(String[] args) {
		InheritanceA ref=new InheritanceA();
		ref.cat();   //sbuclass
		ref.dog();  //superclass
		ref.tiger(); //superclass
}	
	

}
