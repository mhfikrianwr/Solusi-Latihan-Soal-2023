//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class TiketMasuk {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in =  new Scanner(System.in);
        int harga = in.nextInt();
        int saldo = in.nextInt();
        if(saldo>=harga) System.out.print("Selamat bermain");
        else System.out.print("Maaf, saldo tidak cukup");
    }
} 