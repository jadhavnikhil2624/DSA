// 1 <= N <=105
// 1 <= numerator[i] <= denominator[i] <= 109

//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] numerator = IntArray.input(br, n);
            
            
            int[] denominator = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countFractions(n, numerator, denominator);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        int count = 0;
        HashMap<Double,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double t1 = (double)numerator[i]/denominator[i];
            double t2 = (double)(denominator[i] - numerator[i])/denominator[i];
            if(hmap.containsKey(t2))
            {
                count += hmap.get(t2);
            }
            hmap.put(t1,hmap.getOrDefault(t1,0)+1);
        }
        return count;
    }
}
        
