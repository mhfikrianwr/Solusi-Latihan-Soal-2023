//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;

public class PakBom {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=1; i<=n; i++){
            if(i%a==0&&i%b==0) System.out.println("PakBom");
            else if(i%a!=0&&i%b==0) System.out.println("Bom");
            else if(i%a==0&&i%b!=0) System.out.println("Pak");
            else System.out.println(i);
        }
    }
} 