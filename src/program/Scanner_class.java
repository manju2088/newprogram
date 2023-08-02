package program;

import java.util.Scanner;

public class Scanner_class {
	
	public void test1(int x,int y)
	{
		if(x>y)	
	    {
	    	System.out.println("x is grater than y");
		}
	    else if(y>x)
	    {
	    	System.out.println("x is smaller than y");
		}
	    else
	    {
	    	System.out.println("x is equal to y");
	    }
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);   //scanner class object create
		
		System.out.println("enter 1st no");
		a=sc.nextInt();
		
		System.out.println("enter 2st no");
		b=sc.nextInt();
		
		Scanner_class ac=new Scanner_class();
		ac.test1(a,b);
		
		
		
	}

}
