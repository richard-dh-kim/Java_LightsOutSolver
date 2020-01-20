
/**
* The class <b>GameModel</b> is used
* to store and access the board of the lightsout game.
* This class has 1 constructor, and 6 methods: 
* getHeight, getWidth, isON, reset, set, and toString.
*
**/
public class GameModel {

	// the gameboard
	private boolean [][] board;
	// width of the game
	private int width;
	// height of the game
	private int height;

	/**
	* Constructor. Creates an instance of GameModel for a board
	* size <b>width*height</b>.
	* @param width
	* 	the width of the board
	* @param height
	* 	the height of the board
	*
	**/
	public GameModel (int width, int height) {
		this.width = width;
		this.height = height;
		board = new boolean[height][width];
	}

	/**
	* return <b>height</b> of the board as an int.
	*
	* @return 
	* 	returns the <b>height</b> of the board as an int.
	**/
	public int getHeight () {
		return height;
	}

	/**
	* return <b>width</b> of the board as an int.
	*
	* @return 
	* 	returns the <b>width</b> of the board as an int.
	**/
	public int getWidth () {
		return width;
	}

	/**
	* return <b>true</b> if the light is <b>ON</b> at the selected location on the board.
	*
	* @param i
	* 	width entered
	* @param j
	* 	height entered
	* @return 
	* 	returns <b>true</b> if the light is <b>ON</b> at the selected location on the board.
	**/
	public boolean isON (int i, int j) {
		if (board[i][j] == true) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	*
	* Turns <b>OFF</b> all the lights on the board.
	* In other words, set all boolean values as <b>false</b>.
	*
	**/
	public void reset() {
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				board[i][j] = false;
			}
		}
	}

	/**
	* Sets the selected value on the selected location of the board.
	*
	* @param i
	* 	width entered
	* @param j
	* 	height entered
	* @param value 
	* 	returns <b>true</b> if the light is <b>ON</b> at the selected location on the board.
	**/
	public void set(int i, int j, boolean value) {
		board[j][i] = value;
	}

	/**
	* returns the string representation of the gameboard
	*
	* @return
	* 	String representation of the gameboard
	**/
	public String toString() {
		StringBuffer out = new StringBuffer();
        for(int i = 0; i < height; i++){
            out.append("[");
            for(int j = 0; j < width ; j++) {
                if (j>0) {
                    out.append(",");
                }
                out.append(board[i][j]);
            }
            out.append((i < height -1 ? "]\n" :"]"));
        }
        return out.toString();
	}
}
