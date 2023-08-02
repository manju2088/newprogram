package program;

public class Method_constructor {    
	int ID;            //instance varible or non static
	String NAME;           //COSTRUCTOR
	String CITY;
	
	Method_constructor(int id,String name,String city){    //  constructor object creation  constru intialise hoil tya through instance varible
		
		this.ID=id;    //id and name is variable
		this.NAME=name;
		this.CITY=city;
		
		System.out.println(ID);
		System.out.println(NAME);
		System.out.println(CITY);
	}
	
	
	
	/*public void emplpoyee1()    //by using method
	
	{
		ID=101;
		name="manu";
		System.out.println(ID);
		System.out.println(name);
	}
	
	public void emplpoyee2()
	{
		ID=102;
		name="mano";
		System.out.println(ID);
		System.out.println(name);
	} */


	public static void main(String[] args) {
		Method_constructor ref=new Method_constructor(11,"monika","pune");
		Method_constructor ref1=new Method_constructor(12,"mona","mumbai");
		Method_constructor ref2=new Method_constructor(12,"mona","nanded");
		//ref.emplpoyee1();
		//ref.emplpoyee2();
		
	}

}
