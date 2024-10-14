//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class ReverseInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyak = in.nextInt();
        in.nextLine();
        String arr[] = new String[banyak];
        for(int i=0; i<banyak; i++) {
            arr[i] = in.nextLine();
        }
        for(int i=banyak-1; i>=0; i--) System.out.println(arr[i]);
    }
}