class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr[n-1]);
        int maxi = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= maxi){
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}