// Matrix class for both problem number 11 and 12

package matrix;

import java.util.Arrays;

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
	
	// Getter for array of elements
	public int[][] getElementsArray() {
		return this.elementsArray;
	}
	
	// Set the value of a cell in the matrix
	public void setValue(int row, int column, int value) {
		this.elementsArray[row][column] = value;
	}
	
	// Add two matrices
	// If cannot add, display "Matrices cannot be added"
	public Matrix addMatrices(Matrix matrix_1, Matrix matrix_2) {
		
		Matrix filler_matrix = new Matrix(0, 0);
		
		if (matrix_1.getRows() != matrix_2.getRows()) {
			System.out.println("Matrices cannot be added");
			return filler_matrix;
		}
		
		else if (matrix_1.getColumns() != matrix_2.getColumns()) {
			System.out.println("Matrices cannot be added");
			return filler_matrix;
		}
		
		else {
			Matrix newMatrix = new Matrix(matrix_1.getRows(), matrix_1.getColumns());
			
			for (int i = 0; i < this.Rows; i++) {
				for (int j = 0; j < this.Columns; j++) {
					newMatrix.setValue(i, j, matrix_1.elementsArray[i][j] + matrix_2.elementsArray[i][j]);
				}
			}
			return newMatrix;
		}
	}
	
	// Multiply two matrices
	public Matrix multiplyMatrices(Matrix matrix_1, Matrix matrix_2) {
		
		Matrix filler_matrix = new Matrix(0, 0);
		
		if (matrix_1.getRows() != matrix_2.getRows()) {
			System.out.println("Matrices cannot be multiplied");
			return filler_matrix;
		}
		
		else if (matrix_1.getColumns() != matrix_2.getColumns()) {
			System.out.println("Matrices cannot be multiplied");
			return filler_matrix;
		}
		
		else {
			Matrix newMatrix = new Matrix(matrix_1.getRows(), matrix_1.getColumns());
			
			for (int i = 0; i < this.Rows; i++) {
				for (int j = 0; j < this.Columns; j++) {
					newMatrix.setValue(i, j, matrix_1.elementsArray[i][j] * matrix_2.elementsArray[i][j]);
				}
			}
			return newMatrix;
		}
	}
}
