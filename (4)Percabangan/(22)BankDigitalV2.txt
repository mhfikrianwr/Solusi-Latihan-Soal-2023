//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class BankDigitalV2 {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        long saldo = in.nextInt();
        in.nextLine();
        boolean fungsi = true;
        System.out.println("Halo " + nama +" - Saldo Rp. " + saldo);
        while(true){
            String tujuan;
            String perintah = in.next();
            if(perintah.equalsIgnoreCase("transfer")){
                int nominal = in.nextInt();
                tujuan = in.nextLine();
                if(nominal <= saldo){
                    saldo -= nominal;
                    System.out.println("Transfer Rp. "+nominal+" ke"+tujuan+" berhasil");
                }else{
                    System.out.println("Transfer Rp. "+nominal+" ke"+tujuan+" gagal");
                }
            }else if(perintah.equalsIgnoreCase("tarik")){
                int nominal = in.nextInt();
                if(nominal <= saldo){
                    saldo -= nominal;
                    System.out.println("Penarikan Rp. "+nominal+ " berhasil");
                }else{
                    System.out.println("Penarikan Rp. "+nominal+" gagal");
                }
            }else if(perintah.equalsIgnoreCase("tabung")){
                int nominal = in.nextInt();
                saldo += nominal;
                System.out.println("Penabungan Rp. "+nominal+ " berhasil");
            }else if(perintah.equalsIgnoreCase("cek")){
                System.out.println("Saldo Rp. " + saldo);
            }else{
                System.out.println("Transaksi selesai");
                break;
            }
        }
    }
} 