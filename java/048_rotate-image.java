class Solution {
  public void rotate(int[][] matrix) {
      int adder = 0;
      if(matrix.length % 2 == 1)
          adder += 1;
      for(int i = 0; i < matrix.length / 2; i++) {
          for(int j = 0; j < matrix.length / 2 + adder; j++) {
              int curI = i, curJ = j, tempA = matrix[curI][curJ], tempB = 0;
              for(int q = 0; q < 4 ; q++) {
                  tempB = matrix[curJ][(matrix.length - 1) - curI];
                  matrix[curJ][(matrix.length - 1) - curI] = tempA;
                  tempA = tempB;
                  
                  int a = curI;
                  curI = curJ;
                  curJ = (matrix.length - 1) - a;
              }
          }
      }
  }
}