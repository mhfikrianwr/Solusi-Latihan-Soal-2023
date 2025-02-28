//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class BankDigital {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in =  new Scanner(System.in);
        int saldo = in.nextInt();
        in.nextLine();
        String fungsi = in.nextLine();
        int transaksi = in.nextInt();
        if(fungsi.equals("tabung")){
            System.out.println("Penabungan berhasil");
            System.out.println("Saldo : Rp. " + (saldo + transaksi));
        }else{
            if(transaksi <= saldo){
            System.out.println("Penarikan berhasil");
            System.out.println("Saldo : Rp. " + (saldo - transaksi));
            }else{
                System.out.println("Penarikan gagal, saldo tidak cukup");
                System.out.println("Saldo : Rp. " + saldo);
            }
        }
    }
}