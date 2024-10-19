package pattern;

public class Pattern_8 {


	public static void main(String[] args)  
	{  
	int  rows = 8;  
	  
	for (int i= 1;  i<= rows;i++)  
	{  
	for (int j=1; j<=i;  j++)   
	{  
	System.out.print("*"+ " ");  
	}   
	System.out.println();   
	}   
	for (int i=rows-1; i>=0; i--)  
	{  
	for(int j=1; j <= i;j++)  
	{  
	System.out.print("*"+ " ");  
	}  
	System.out.println();  
	}  
	}  
}


