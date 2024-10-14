//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.*;
public class WaktuRental {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int mulai = in.nextInt();
        int selesai = in.nextInt();
        int harga = in.nextInt();
        System.out.println("Halo " + name);
        System.out.println("Anda merental Game Corner pada jam " + mulai + " - " + selesai);
        int lama;
        if(selesai < mulai){
            lama =  24 - mulai + selesai;
        } else{
            lama = selesai - mulai;
        }
        System.out.println("Total durasi " + lama +" jam");
        System.out.println("Harga rental Rp" + lama * harga);
    }
}