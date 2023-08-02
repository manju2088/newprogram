package program;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	/*int []a=new int[4];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	
	int[]b=new int[] {10,20,30,40,50};
	
	System.out.println(b.length);
	
	for(int i=0;i<4;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println(Arrays.toString(b));
	}*/
		int[][] x=new int[3][4];
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		x[1][0]=40;
		x[1][1]=50;
		x[1][2]=60;
		
		int[][]y =new int[][] {{5,15,20},{40,50,60}};
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.deepToString(y));
		
		
}

}	
	
