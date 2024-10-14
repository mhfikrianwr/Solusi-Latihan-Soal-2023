//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class NilaiTempatBilangan {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        if(n < 10) System.out.print("Satuan");
        else if(n < 100) System.out.print("Puluhan");
        else if(n < 1000) System.out.print("Ratusan");
        else if(n < 10000) System.out.print("Ribuan");
        else if(n < 100000) System.out.print("Puluhan Ribu");
        else if(n < 1000000) System.out.print("Ratusan Ribu");
        else System.out.print("Jutaan");
    }
}