					// Left pascals triangle
package pattern;

public class Pattern_10 {

	public static void main(String[] args)  
	{  
	int i, j;
	int row = 9;
	        
	for (i= 1; i<= row ; i++)  
	{  
	for (j=i; j <row;j++)              
	{  
	System.out.print(" ");  
	}  
	for (j=1; j<=i;j++)   
	{  
	System.out.print("*");   
	}   
	System.out.println("");   
	}   
	for (i=row; i>=1; i--)  
	{  
	for(j=i; j<=row;j++)  
	{  
	System.out.print(" ");  
	}  
	for(j=1; j<i ;j++)   
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	
	}  
}
