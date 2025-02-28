//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class JumlahNBilanganPertama {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum =0;
        for(int i=1; i<=n; i++)sum+=i;
        System.out.print(sum);
    }
} 