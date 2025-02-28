//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;

public class SimbolDiagonal {

    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("%"+i+"s\n",c);
        }
    }
}