class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long totalNoOfCookies = 0;
        for(int I : arr) { totalNoOfCookies += I;}
        
        for(int d=N; d>1; d--)
        {
            if(totalNoOfCookies % d == 0) return d;
        }
        return 1;
    }
}
        
