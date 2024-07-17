class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        int col0 = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(j == 0){
                        col0 = 0;
                    }else{
                        matrix[0][j] = 0;
                    }
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = m - 1; i > 0; i--){
            for(int j = n-1; j > 0; j--){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = n-1; i > 0; i--){
            if(matrix[0][i] == 0 || matrix[0][0] == 0){
                matrix[0][i] = 0;
            }
        }
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0 || col0 == 0){
                matrix[i][0] = 0;
            }
        }  
    }
}