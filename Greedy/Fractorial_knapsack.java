import java.util.*;

public class Fractional_Knapsack_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int truck = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.print(maxunit(arr,truck));
    }
    public static int maxunit(int[][] arr, int truck){
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));
        int ans = 0;
        for(int[] a: arr){
            if(a[1] <= truck){
                ans += a[0]*a[1];
                truck -= a[0];
            }else{
                ans += truck*a[1];
                break;
            }
        }

        return ans;
    }
}
