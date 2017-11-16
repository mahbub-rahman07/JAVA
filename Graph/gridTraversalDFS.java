import java.util.*;

class Untitled {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int row,col;
		row = sc.nextInt();
		col = sc.nextInt();
		
		int[][] mat = new int[row][col];
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int res = getMaxRegio(mat);
		System.out.println(res);
		
		
	}
	
	public static int getMaxRegio(int[][] mat) {
		int maxReg = 0;
		
		for (int i = 0; i < mat.length ; i++) {
			for (int j = 0; j < mat[i].length ; j++) {
				int size = getMaxRegionResult(i, j , mat);
				maxReg = Math.max(size, maxReg);
				
			}
		}		
		
		return maxReg;
	}
	
	public static int getMaxRegionResult(int row,int col, int[][] mat) {
		
		if (row < 0 || row >= mat.length || col < 0 || col >= mat[row].length ) {
			return 0;
		}
		
		if (mat[row][col] == 0) {
			return 0;
		}
		
		mat[row][col] = 0;
		int size = 1;
		
		for (int i = row-1 ; i <= row+1 ; i++) {
			for (int j = col-1; j <= col+1; j++) {
				size += getMaxRegionResult(i, j, mat);
			}
		}
		return size;
	}
}