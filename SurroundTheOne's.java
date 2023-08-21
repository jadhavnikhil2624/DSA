//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] a)
    {
        int ans=0;         
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
               if(a[i][j]==1)
               {
                    int val=check(a,i,j);
                   // System.out.println(val);
                    if(val%2==0 && val!=0)
                    {
                        ans++;
                    }
               }
            }
            
        }
       return ans;
	}
	private static int check(int a[][],int i,int j)
	{
	    int count = 0;
	    int n=a.length;
	    int m=a[0].length;
	    if(j+1<m && a[i][j+1]==0)
	    {
	       count++; 
	    }
	    if(i+1<n && a[i+1][j]==0){
	        count++;
	    }
	    if(i-1>=0 && a[i-1][j]==0)
	    {
	        count++;
	    }
	    if(j-1>=0 && a[i][j-1]==0)
	    {
	        count++;
	    }
	    // diagonals lower 
	    if(i+1<n && j+1<m && a[i+1][j+1]==0)
	    {
	        count++;
	    }
	    //upper diagonals
	    if(i-1>=0 && j-1>=0 && a[i-1][j-1]==0)
	    {
	        count++;
	    }
	    //left diagonals lower
	    if(i+1<n && j-1>=0 && a[i+1][j-1]==0)
	    {
	        count++;
	    }
	    //right upper diagonals
	    if(i-1>=0 && j+1<m && a[i-1][j+1]==0)
	    {
	        count++;
	    }
	    return count;
	} // code here
    
}