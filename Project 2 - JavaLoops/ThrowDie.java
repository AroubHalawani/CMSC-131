package programs;
import java.util.Scanner;
import java.util.Random;
public class ThrowDie {
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		
		int die;
		int random;
		
		System.out.print("How many times to throw a die?: ");
		die=in.nextInt();
		
		Random rand = new Random(die);
		
		
		
		
		for(int n=1; n<=die; n++)
		{
			System.out.println("Throw #"+n);
			random=1+rand.nextInt(6);
		
			
			if(random==1)
			{
				System.out.println("...");
				System.out.println(" 0 ");
				System.out.println("...");
			}
			else if(random==2)
			{
				System.out.println("0..");
				System.out.println("...");
				System.out.println("..0");
			}
			else if(random==3)
			{
				System.out.println("0..");
				System.out.println(".0.");
				System.out.println("..0");
			}
			else if(random==4)
			{
				System.out.println("0.0");
				System.out.println("...");
				System.out.println("0.0");
			}
			else if(random==5)
			{
				System.out.println("0.0");
				System.out.println(".0.");
				System.out.println("0.0");
			}
			else if(random==6)
			{
				System.out.println("0.0");
				System.out.println("0.0");
				System.out.println("0.0");
			}
			
			
			
		}
		
		
	}

}
