import java.util.*;
class Solution {
    public static long findMaxSubsetSum(int n, int[] arr) {
        long[] dp=new long[n+1];
        Arrays.fill(dp,-1);
        return maxSum(arr,0,dp);
    }
    public static long maxSum(int[] arr,int index,long[] dp){
        if(index>=arr.length){
            return 0;
        }
        
        if(dp[index]!=-1) return dp[index];
        long notTake=arr[index]+maxSum(arr,index+1,dp);
        long take=0;
        if((index+1)<arr.length){
            take=arr[index+1]+maxSum(arr,index+2,dp);
        }
        return dp[index]=Math.max(notTake,take);
    }
}