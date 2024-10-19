package pattern;

public class patern_ {

	public static void main(String[] args) {


		int row = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==2||i==4)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		
		for(int i = row-1; i>0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==4||i==2)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
