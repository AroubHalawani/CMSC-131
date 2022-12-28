package programs;

import java.util.Scanner;
public class Convert {
	public static void main (String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		int decimal;
		int answer=0;
		int remainder;
		int remOfDecimal;
		int n=1;
		
		
		

		System.out.print("Enter decimal number :");
		decimal = in.nextInt();
		
				
		remOfDecimal = decimal;

		
		while(remOfDecimal > 0)
		{
			
			remainder = remOfDecimal % 8;
			
			answer+=remainder*n;			
			
			n*=10;
			
			remOfDecimal/= 8;
			
			
			
		}
		
		System.out.println("Octal value : " + answer);
		 
		
		
	}

}

