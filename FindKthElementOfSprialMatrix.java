//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int n, int m, int k)
    {
    // Your code here
        int rowstart=0,rowend=n;
        int columnstart=0,columnend=m;
        int count=0;
        while(rowstart<rowend && columnstart<columnend){
            
            for(int i=columnstart;i<columnend;i++){
                count++;
                if(count==k)return matrix[rowstart][i];
            }
            rowstart++;
            
            for(int i=rowstart;i<rowend;i++){
                count++;
                 if(count==k)return matrix[i][columnend-1];
            }
            columnend--;
            
            if(rowstart<rowend){
            for(int i=columnend-1;i>=columnstart;i--){
                 count++;
                 if(count==k)return matrix[rowend-1][i];
            }
            rowend--;
            }
            
            if(columnstart<columnend){
            for(int i=rowend-1;i>=rowstart;i--){
                  count++;
                 if(count==k)return matrix[i][columnstart];
            }
            columnstart++;
            }
        }
     return -1;
    }
}