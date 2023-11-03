class Solution {
    public void rotate(int[][] matrix) {
        
        //Transpose of matrix
        for (int i =0; i < matrix.length;i++){
            for (int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // after transpose we rotate the each row
        for (int i = 0; i<matrix.length; i++){
            int x = 0;
            int y = matrix[i].length-1;
            while (x<y){
            matrix[i][x] =  matrix[i][x] + matrix[i][y];
            matrix[i][y] = matrix[i][x] - matrix[i][y];
            matrix[i][x] = matrix[i][x] - matrix[i][y];
            x++;
            y--;
            }
        }
    }
}