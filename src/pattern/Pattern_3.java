package pattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int row;
		System.out.println("Enter a number for rows :");
		row = input.nextInt();
		
		for(int i=1; i<=row; i++)
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
