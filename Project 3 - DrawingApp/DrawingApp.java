package app;

import java.util.Random;

public class DrawingApp {
	public static void main (String arg[])
	{
		
		System.out.print(DrawingApp.getFlag(2, 'R', '.', 'Y'));
						
	}
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
		
	private static boolean isValidColor(char color)
	{
		
		
		if(color=='R'||color=='G'||color=='B'||color=='Y'||color=='*'||color=='.')
			
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
	public static String getRectangle(int maxRows, int maxCols, char symbol)
	{
		String answer="";
		
		if(maxRows<1||maxCols<1)
		{
			answer=null;
		}
		else
		{
			for(int n=1; n<=maxRows; n++)
			{
				for(int m=1; m<=maxCols; m++)
				{
					answer+=symbol;
				
				}
				if(n==maxRows)
				{
					answer+="";
				}
				else
				{
				answer+="\n";
				}
						
			}
		}
		return answer;
	}
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
	public static char getRandomColor(Random random)
	{
		char answer;
		int a=random.nextInt(6);
		if(a==0)
		{
			answer='R';
		}
		else if(a==1)
		{
			answer='G';
		}
		else if(a==2)
		{
			answer='B';
		}
		else if(a==3)
		{
			answer='Y';
		}
		else if(a==4)
		{
			answer='*';
		}
		else if(a==5)
		{
			answer='.';
		}
		else
		{
			answer=' ';
		}
		
		
		return answer;
		
		
	}
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
	public static String getHorizontalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3)
	{
		String answer="";
		
		
		if(maxRows<1||maxCols<1||bars<1)
		{
			answer=null;
		}
		else
		{
			for(int n=1; n<=maxRows-(maxRows%bars);)
			{
				
				for(int c1=1; c1<=maxRows/bars&&n<=maxRows-(maxRows%bars);c1++,n++)
				{
					for(int m=1; m<=maxCols; m++)
					{
						answer+=color1;
					}
					
					if(n==maxRows-(maxRows%bars))
					{
						answer+="";
					}
					else
					{
				
						answer+="\n";
					}
					
				
				}
				for(int c2=1; c2<=maxRows/bars&&n<=maxRows-(maxRows%bars);c2++,n++)
				{
					for(int m=1; m<=maxCols; m++)
					{
						answer+=color2;
					}
					
				
					if(n==maxRows-(maxRows%bars))
					{
						answer+="";
					}
					else
					{
				
						answer+="\n";
					}
					
												
				}
				for(int c3=1; c3<=maxRows/bars&&n<=maxRows-(maxRows%bars);c3++,n++)
				{
					for(int m=1; m<=maxCols; m++)
					{
						answer+=color3;
					}
					if(n==maxRows-(maxRows%bars))
					{
						answer+="";
					}
					else
					{
				
						answer+="\n";
					}
						
				}			
				
			}
		}
		
		
		return answer;
	}

	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
		
	public static String getVerticalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3)
	{
		String answer="";		
		
		if(maxRows<1||maxCols<1||bars<1)
		{
			answer=null;
		}
		else
		{
			for(int n=1; n<=maxRows;n++)
			{
				for(int p=1; p<maxCols-(maxCols%bars);)
				{
					for(int m=1 ; m<=maxCols/bars&&p<=maxCols-(maxCols%bars);m++,p++)
					{
						answer+=color1;
					}
					for(int m=1; m<=maxCols/bars&&p<=maxCols-(maxCols%bars);m++,p++)
					{
						answer+=color2;
					}
					for(int m=1 ; m<=maxCols/bars&&p<=maxCols-(maxCols%bars);m++,p++)
					{
						answer+=color3;
					}
				}
							
				if(n==maxRows)
				{
					answer+="";
				}
				else
				{
					answer+="\n";
				}			
				
			}
		}
		
			return answer;
		}
	
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
	public static String getFlag(int size, char color1, char color2, char color3)
	{
		String answer="";
		
		if(size<3)
		{
			answer=null;
		}
		else
		{
			for(int rows=1; rows<=size;rows++)
			{
				for(int m=1; m<=rows;m++)
				{
					answer+=color1;
				}
				if(rows==1||rows==size)
				{
					for(int v=1; v<=size*5-rows;v++)
					{
						answer+=color2;
					}
				}
				else
				{
					for(int u=1; u<=size*5-rows;u++)
					{
						answer+=color3;
					}
				}
				answer+="\n";
			}
			//-----------------------------------------------
			
			for(int rows=size; rows>=1;rows--)
			{
				for(int m=1; m<=rows;m++)
				{
					answer+=color1;
				}
				if(rows==1||rows==size)
				{
					for(int v=1; v<=size*5-rows;v++)
					{
						answer+=color2;
					}
				}
				else
				{
					for(int u=1; u<=size*5-rows;u++)
					{
						answer+=color3;
					}
				}
				
				if(rows==1)
				{
					answer+="";
				}
				else
				{
					answer+="\n";
					
				}			
				
			}
		}
					
		return answer;
	}

	
}