class DFS_GRID_TRAVERS {
	public static int getRegionSize(int[][] matrix , int r,int c){
		if(r < 0 || c < 0 || r >= matrix.length() || c >= matrix[r].length()){
			return 0;
		}
		if(matrix[r][c] == 0){
			return 0;
		}
		matrix[r][c] = 0;
		int size =1;
		
		for(int i = r-1  ; i <= r+1 ; i++){
			for (int j = c-1; j <= c+1 ; j++){
				if(i != r || j != c){
					size += getRegionSize(matrix, i, j);
				}
				
			}
		}
		return size;
	}
	
	public static int getSol(int[][] matrix){
		int MaxRegion = 0;
		
		for(int i = 0; i < matrix.length() ; i++){
			for(int j = 0; j < matrix[i].length() ; j++){
				if(matrix[i][j] == 1){
					int size = getRegionSize(matrix,i,j); // call dfs
					MaxRegion = Math.max(size, MaxRegion); 
				}
			}
		}
		return MaxRegion;
	}
	
	public static void main(String[] args) {
		
	}
}