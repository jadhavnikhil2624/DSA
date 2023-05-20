class Solution {
    int missingNumber(int arr[], int n) {
        // Your Code Here
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
}