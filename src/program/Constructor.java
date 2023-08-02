package program;

public class Constructor {
	
	Constructor()
	{
		System.out.println("execute non para constructor");
	}
	
	Constructor(String s,double i){
		System.out.println("para constructor");	
	}

	public static void main(String[] args) {
		Constructor c=new Constructor("acc",2.5555d);
		Constructor d=new Constructor();
		
	}

}
