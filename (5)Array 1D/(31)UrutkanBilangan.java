//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
import java.util.Arrays;
public class UrutkanBilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyak = in.nextInt();
        int arr[] = new int[banyak];
        for(int i=0; i<banyak; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<banyak; i++){
            System.out.print(arr[i] + " ");
        }
    }
}