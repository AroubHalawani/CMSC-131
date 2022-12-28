package system;

import app.DrawingApp;
import gui.BoardCell;
public class VerticalBars  implements Diagram {
	

	private char [][] board;
	
	private int animationType;
		
	
	public VerticalBars( int maxRows, int maxCols, int bars, char color1, char color2, char color3, int animationType)
	{
		this.animationType=animationType;
		
		this.board=BoardCell.getCharArray(DrawingApp.getVerticalBars(maxRows, maxCols, bars, color1, color2, color3));
		
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
		
		return board;
	}

}
