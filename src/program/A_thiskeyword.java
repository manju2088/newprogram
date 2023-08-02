package program;

public class A_thiskeyword extends B_superkeyword{
	A_thiskeyword()
	{
		this(5);
		System.out.println("no argument");
	}
	A_thiskeyword(int i)
	{  
		super();
		System.out.println("parameter");
	}
	

	public static void main(String[] args) {
		A_thiskeyword c=new A_thiskeyword();
	
	}

}
