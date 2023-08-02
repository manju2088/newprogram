package program;

public class Encapsulation 
	{
	private int empid;
	
	public void setEmpID(int eid)
	{
		empid=eid;
	}
	
	
public int getEmpID()
{
	return empid;
}

public static void main(String[] args) {
	Encapsulation r= new Encapsulation();
	r.setEmpID(101);
	System.out.println(r.getEmpID());
	
	}

}
