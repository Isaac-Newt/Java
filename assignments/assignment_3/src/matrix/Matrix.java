// Matrix class for both problem number 11 and 12

package matrix;

public class Matrix {
	// Declare data members
	private int Rows;
	private int Columns;
	private int[][] elementsArray;
	
	// Constructor
	Matrix(int rows, int columns) {
		this.elementsArray = new int[rows][columns];
		this.Rows = rows;
		this.Columns = columns;
	}

	// Getters for rows and columns
	public int getRows() {
		return Rows;
	}

	public int getColumns() {
		return Columns;
	}
	
	// Set the value of a cell in the matrix
	public void setValue(int row, int column, int value) {
		this.elementsArray[row][column] = value;
	}
	
	// Add two matrices
	// TODO: figure out how the heck to do this???
	// If cannot add, display "Matrices cannot be added"
	
	// Multiply two matrices
	// TODO: figure out how the heck to do this???
}
