package system;



public class CombineTopBottom  implements Diagram {
	
	private char [][] board;
	
	private int animationType;
	
	public CombineTopBottom(Diagram top, Diagram bottom, int animationType)
	{
		
		if(top.getBoard().length!=bottom.getBoard().length)
		{
			throw new java.lang.IllegalArgumentException();
		}
		else
		{
			this.animationType=animationType;	
			board=TwoDimArrayUtil.appendTopBottom(top.getBoard(),bottom.getBoard());
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
