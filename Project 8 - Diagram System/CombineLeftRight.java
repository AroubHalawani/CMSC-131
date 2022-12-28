package system;


public class CombineLeftRight implements Diagram {	
	
	private char [][] board;
	
	private int animationType;
	
	public CombineLeftRight(Diagram left, Diagram right, int animationType)
	{
		if(left.getBoard().length !=right.getBoard().length)
		{
			throw new java.lang.IllegalArgumentException();
			
		}
		else
		{
			this.animationType=animationType;			
			board=TwoDimArrayUtil.appendLeftRight(left.getBoard(),right.getBoard());		
		}
		
	}
	
	public char[][] getBoard()
	{
		return board;
	}
	
	public int getNumberCols()
	{
		return board[0].length;
	}
	
	public int getNumberRows()
	{
		return board.length;
	}
	
	public char[][] nextAnimationStep()
	{
		if(animationType==1)
		{
			TwoDimArrayUtil.rotateLeftOneColumn(board);
		}
		else if(animationType==2)
		{
			TwoDimArrayUtil.rotateTopOneRow(board);
		}
		
		return board;
	}

}
