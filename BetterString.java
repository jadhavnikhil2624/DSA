//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
       

        int countSubsequence1= countSubsequences(str1);
        int countSubsequence2= countSubsequences(str2);
        
        return countSubsequence1>=countSubsequence2 ? str1 : str2;
    }
    
    public static int countSubsequences(String str){
        
        int n= str.length();
        int[] countSubsequence= new int[n+1];
        
        countSubsequence[0]=1;
        
        int[] lastOccurenceIdx= new int[26];
        
        for(int i=1;i<n+1;i++){
            
            char ch= str.charAt(i-1);
            countSubsequence[i]=2*countSubsequence[i-1];
            if(lastOccurenceIdx[ch-'a']>0)  countSubsequence[i] -= countSubsequence[lastOccurenceIdx[ch-'a']-1];
            lastOccurenceIdx[ch-'a']=i;
        }
        
        return countSubsequence[n];
        
    }
}