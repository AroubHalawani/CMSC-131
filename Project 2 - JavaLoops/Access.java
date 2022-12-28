package programs;
import java.util.Scanner;

public class Access {
	
	public static void main (String arg[])
	{
		Scanner in= new Scanner(System.in);
		
		
		String password;
		String number = "";
		int n=1;
		
		
		do
		{
			System.out.print("Enter password: ");
			password=in.nextLine();
			
			if((!password.equals("quit")))
			{
				System.out.print("Enter number: ");
				number=in.nextLine();
			
				if((password.equals("terps"))&&(number.equals("1847")))
				{
					System.out.println("Access Granted");
				}
				else
				{
					System.out.println("Wrong credentials");
					n++;
									
				}
			}
			
						
			if(n==4||password.equals("quit"))
			{
				
				System.out.println("Access Denied");
			}
			
			
		} while((((!(password.equals("terps"))||!(number.equals("1847")))) && n<=3)&&(!password.equals("quit")));
		
		
		
		
		
		
		
	}
	
	

}
