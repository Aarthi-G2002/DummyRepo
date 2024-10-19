package pattern;

public class Pattern_13 {

	public static void main(String[] args)  
	{  
	int  rows=9;  
	for (int i=1; i<= rows ; i++)  
	{  
	for (int j = i; j <= rows ; j++)   
	{  
	System.out.print(" ");  
	}     
	for (int j = 1; j <= (2*i -1) ;j++)   
	{  
	if(j==1 || i == rows || j==(2*i-1))   
	{  
	System.out.print("*");  
	}  
	else   
	{  
	System.out.print(" ");  
	}  
	}  
	System.out.println("");  
	}  
	}  
}
