package system;

public class TwoDimArrayUtil {

	public static char [][] appendLeftRight (char[][] left, char[][] rigth)
	{
		
		char[][] answer= new char[left.length][left[0].length+rigth[0].length];
		
		for(int count1= 0; count1<left.length;count1++)
		{
			for(int count2=0; count2<left[count1].length;count2++)
			{
				answer[count1][count2]=left[count1][count2];
			}
			
			for(int count3=left[count1].length;count3<left[count1].length+rigth[count1].length;count3++)
			{
				answer[count1][count3]=rigth[count1][count3-left[count1].length];
			}
		}
		
		
		return answer;
	}
	
	public static char [][] appendTopBottom(char[][] top, char [][] bottom)
	{
				
		char[][] answer = new char[top.length + bottom.length][];
		
		
	    int index = 0;
	    
	    for (;index<top.length;index++)
	    {
	        answer[index] = top[index];
	    }
	    
	    
	    for (int count = 0;count<bottom.length;count++)
	    {
	        answer[index++] = bottom[count];
	    }
	    	    
	    return answer;
	}

	public static boolean isRagged(char[][] array)
	{
		boolean answer =false;
		
		for(char[] a: array)
		{
			if(a.length!= array[0].length)
				answer= true;
		}
		return answer;
	}
	
	public static void rotateTopOneRow(char[][] array)
	{
		if(array==null||isRagged(array)==true)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			char[][] answer= new char[array.length][array[0].length];
			
			for(int n=0; n<answer.length;n++)
			{
				for(int col=0; col<answer[0].length;col++)
				{
				if(n==0)
				{
					answer[answer.length-1][col]=array[n][col];
				}
				else
				{
					answer[n-1][col]=array[n][col];
				}
				}
				
			}
			for(int row=0; row<array.length; row++)
			{
				for(int col=0; col<array[0].length;col++)
				{
					array[row][col]=answer[row][col];
				}
				
			}
		}
					
				
	}
	public static void rotateLeftOneColumn(char [][] array)
	{
		if(array==null||isRagged(array)==true)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		
			for (int j = 0; j < array.length; j++)
			{
				TwoDimArrayUtil.rotate(array[j], true, 1);
			}
		}
		
	}
		
	public static void rotate(char[] array, boolean leftRotation, int positions)
	{
		char right;
		char left;

		if (array == null)
		{
			throw new IllegalArgumentException();
		} 
		else
		{
			if (leftRotation == true)
			{

				for (int count = 0; count < positions; count++) 
				{
					left = array[0];

					for (int j = 0; j < array.length - 1; j++)
					{
						array[j] = array[j + 1];
					}
					array[array.length - 1] = left;
				}
			}

			else if (leftRotation == false)
			{

				for (int count = 0; count < positions; count++)
				{

					right = array[array.length - 1];

					for (int j = array.length - 1; j > 0; j--)
					{
						array[j] = array[j - 1];
					}

					array[0] = right;
				}
			}
		}
	}	
}