import java.util.*;
public class kashif {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] = {1,4,5,4,5};
        System.out.println(kashif(n, arr));
    }

    public static int kashif(int n, int arr[]){
        int sum=0;

       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    int [] count = new int[]{1};
                    arr[i] = arr[i]+count[0];
                }
            }
        }

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
