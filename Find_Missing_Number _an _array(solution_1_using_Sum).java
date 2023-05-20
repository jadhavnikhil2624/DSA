class Solution {
    int missingNumber(int arr[], int n) {
        // Your Code Here
        int sum = n*(n+1)/2;
        int sum2 =0;
        
        for(int i=0;i<arr.length;i++){
            sum2 += arr[i];
        }
        
        return sum-sum2;
    }
}