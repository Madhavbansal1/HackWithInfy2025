import java.util.Scanner;

public class Minimum_Number_of_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int[] arr = { 1,2,5,10,20,50,100};
        int count = 0;
        for(int i=6; i>=0; i--){
            while(coin >= arr[i]){
                coin -= arr[i];
                count++;
            }
        }

        System.out.print(count);

    }
}
