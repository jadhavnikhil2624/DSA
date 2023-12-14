class Solution {

  public int[][] onesMinusZeros(int[][] grid) {
    int[] sumCols = new int[grid[0].length];
    int[] sumRows = new int[grid.length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0) {
          sumRows[i] += -1;
          sumCols[j] += -1;
        } else {
          sumRows[i] += 1;
          sumCols[j] += 1;
        }
      }
    }

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        grid[i][j] = sumRows[i] + sumCols[j];
      }
    }
    sumCols = null;
    sumRows = null;
    return grid;
  }
}
