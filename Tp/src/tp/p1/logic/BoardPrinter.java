package tp.p1.logic;

public abstract class BoardPrinter implements GamePrinter {
	
	private static int dimX; 
	private static int dimY;
	private String[][] board;
	private static String space = " ";
	
	public BoardPrinter (int dimX, int dimY, String[][] board, String space) {
		BoardPrinter.dimX = dimX;
		BoardPrinter.dimY = dimY;
		this.board = board;
		BoardPrinter.space = space;
		
	}
	
	
	
	
	
	public String toString() {

		int cellSize = 7;
		int marginSize = 2;
		String vDelimiter = "|";
		String hDelimiter = "-";
		
		String rowDelimiter = MyStringUtils.repeat(hDelimiter, (dimY * (cellSize + 1)) - 1);
		String margin = MyStringUtils.repeat(space, marginSize);
		String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);
		
		StringBuilder str = new StringBuilder();
		
		str.append(lineDelimiter);
		
		for(int i=0; i<dimX; i++) {
				str.append(margin).append(vDelimiter);
				for (int j=0; j<dimY; j++) {
					str.append( MyStringUtils.centre(board[i][j], cellSize)).append(vDelimiter);
				}
				str.append(lineDelimiter);
		}
		return str.toString();
	}
	public int getDimX() {
		return dimX;
	}

	}
	public int getDimY() {
		return dimY;
	}
	
	public String [][] getBoard() {
		return board;
	}
	public String getSpace() {
		return space;
	}

}
