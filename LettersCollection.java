class Solution {

  static List<Integer> matrixSum(
    int n,
    int m,
    int mat[][],
    int q,
    int queries[][]
  ) {
    // code here
    ArrayList<Integer> list = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < q; i++) {
      if (queries[i][0] == 1) {
        int r = queries[i][1];
        int c = queries[i][2];
        sum = 0;
        if (r - 1 >= 0 && c - 1 >= 0) sum += mat[r - 1][c - 1];
        if (r - 1 >= 0) sum += mat[r - 1][c];
        if (r - 1 >= 0 && c + 1 < m) sum += mat[r - 1][c + 1];
        if (c - 1 >= 0) sum += mat[r][c - 1];
        if (c + 1 < m) sum += mat[r][c + 1];
        if (r + 1 < n && c - 1 >= 0) sum += mat[r + 1][c - 1];
        if (r + 1 < n) sum += mat[r + 1][c];
        if (r + 1 < n && c + 1 < m) sum += mat[r + 1][c + 1];
        list.add(sum);
      } else if (queries[i][0] == 2) {
        int r = queries[i][1];
        int c = queries[i][2];
        sum = 0;
        if (r - 2 >= 0 && c - 2 >= 0) sum += mat[r - 2][c - 2];
        if (r - 2 >= 0 && c - 1 >= 0) sum += mat[r - 2][c - 1];
        if (r - 2 >= 0) sum += mat[r - 2][c];
        if (r - 2 >= 0 && c + 1 < m) sum += mat[r - 2][c + 1];
        if (r - 2 >= 0 && c + 2 < m) sum += mat[r - 2][c + 2];
        if (r - 1 >= 0 && c - 2 >= 0) sum += mat[r - 1][c - 2];
        if (r - 1 >= 0 && c + 2 < m) sum += mat[r - 1][c + 2];
        if (c - 2 >= 0) sum += mat[r][c - 2];
        if (c + 2 < m) sum += mat[r][c + 2];
        if (r + 1 < n && c - 2 >= 0) sum += mat[r + 1][c - 2];
        if (r + 1 < n && c + 2 < m) sum += mat[r + 1][c + 2];
        if (r + 2 < n && c - 2 >= 0) sum += mat[r + 2][c - 2];
        if (r + 2 < n && c - 1 >= 0) sum += mat[r + 2][c - 1];
        if (r + 2 < n) sum += mat[r + 2][c];
        if (r + 2 < n && c + 1 < m) sum += mat[r + 2][c + 1];
        if (r + 2 < n && c + 2 < m) sum += mat[r + 2][c + 2];
        list.add(sum);
      }
    }
    return list;
  }
}
