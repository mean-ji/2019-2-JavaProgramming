
public class CH07_Matrix {

	public static void makeMatrix(int[][] a) {
		// TODO Auto-generated method stub
		for (int row = 0 ; row < a.length ; row++)
			for (int column = 0 ; column < a[row].length ; column++) {
				a[row][column]=row+column;
			}
	}

	public static void printMatrix(int[][] b) {
		// TODO Auto-generated method stub
		for (int row = 0 ; row < b.length ; row++) {
			for (int column = 0 ; column < b[row].length ; column++) {
				System.out.print(b[row][column]+" ");
			}
			System.out.println();
		}
	}

}
