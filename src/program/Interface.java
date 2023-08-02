package program;

public class Interface implements New_interface,Old_interface{
	public void method1()
	{
		System.out.println("implements subclass method");
	}
  public static void main(String[] args) {
	  Interface ref=new Interface();
	  ref.method1();
			  
  }
}
