package pattern;

public class Pattern_12 {

	public static void main(String[] args)  
	{  
	int row = 8; 
	 
	for (int i = 0; i<=row ; i++)   
	{  
	
	for (int j = 0; j<= row  / 2; j++)   
	{  
	 
	if ((j == 0 || j == row  / 2) && i != 0 ||  
	
	i == 0  && j != row  / 2 ||   
	
	i == row / 2)   
	System.out.print("*");  
	else  
	System.out.print(" ");  
	}  
	System.out.println();  
	}  
	}  
}
