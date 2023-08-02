package program;

public class Para {
	
	public void noparameter() {
		System.out.println();
	}
	
	public void singlepara(int a) {
		System.out.println("single parameter method");
	}
	
	public void doublepara(int a,int b) {
		System.out.println("Double parameter method");
	}

	public static void main(String[] args) {
		 
		Para a=new Para();
		a.singlepara(11);
		a.doublepara(22, 23);
		a.noparameter();
	 
	}

}
