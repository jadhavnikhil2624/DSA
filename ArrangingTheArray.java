class Solution {

  public void Rearrange(int a[], int n) {
    // Your code goes here
    int arr[] = new int[a.length];
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) {
        arr[j++] = a[i];
      }
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] >= 0) {
        arr[j++] = a[i];
      }
    }

    for (int i = 0; i < n; i++) {
      a[i] = arr[i];
    }
  }
}
