package sysImplementation;

public class Utilities {

	public static int[] filter(int[] array, int lowerLimit, int upperLimit)
	{

		if (array == null || lowerLimit > upperLimit) 
		{
			throw new IllegalArgumentException();
			
		} 
		else 
		{
			int index = 0;

			for (int count = 0; count < array.length; count++) 
			{
				if (array[count] >= lowerLimit && array[count] <= upperLimit)
				{
					index++;
				}
			}

			int[] answer = new int[index];
			
			int newArray = 0;
			
			for (int count = 0; count < array.length; count++)
			{
				if (array[count] >= lowerLimit && array[count] <= upperLimit)
				{

					answer[newArray] = array[count];
					
					newArray++;
				}
			}
			
			return answer;
		}

	}
	// ------------------------------------------------------------------------

	// ------------------------------------------------------------------------
	public static String getArrayString(int[] array, char separator)
	{
		String answer = "";
		
		if (array == null) 
		{
			throw new IllegalArgumentException();
			
		} 
		else if (array.length == 0)
		{
			answer = "";
		}
		else
		{

			for (int count = 0; count < array.length; count++)
			{

				if (count == array.length - 1) 
				{
					answer += "" + array[count];
				} 
				else 
				{
					answer += "" + array[count] + separator;
				}

			}
		}

		return answer;
	}
	// ------------------------------------------------------------------------

	// ------------------------------------------------------------------------
	public static StringBuffer[] getArrayStringsLongerThan(StringBuffer[] array, int length)
	{

		StringBuffer[] answer;

		int size = 0;

		if (array == null)

		{
			throw new IllegalArgumentException();

		}
		else 
		{
			for (int count = 0; count < array.length; count++)
			{
				if (array[count].length() > length)
				{
					size++;
				}
			}

			answer = new StringBuffer[size];
			
			int count = 0;
			
			for (int index = 0; index < array.length; index++)
			{
				if (array[index].length() > length)
				{
					answer[count] = array[index];
					
					count++;
				}
			}

			return answer;
		}

	}

	// ------------------------------------------------------------------------

	// ------------------------------------------------------------------------

	public static int getInstances(int[] array, int lowerLimit, int upperLimit)
	{

		int answer = 0;

		if (array == null)
		{
			throw new IllegalArgumentException();
		} 
		else 
		{
			for (int count = 0; count < array.length; count++) 
			{
				if (array[count] >= lowerLimit && array[count] <= upperLimit)
				{
					answer++;
				}
			}
		}

		return answer;
	}
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------

	public static void rotate(int[] array, boolean leftRotation, int positions)
	{
		int right;
		int left;

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