			// 11. Sandglass Star Pattern
package pattern;

public class Pattern_11 {

	public static void main (String[] args)
	{
		int row = 8;
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
  			}
			
			System.out.println();
		}
		
		for(int i=2; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
  			}
			
			System.out.println();
		}	
	}
}
