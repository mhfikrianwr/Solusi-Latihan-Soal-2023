//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class BesarKecil {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);;
        String y = in.nextLine();
        String perintah = in.nextLine();
        if(perintah.equalsIgnoreCase("besar")){
            y = y.toUpperCase();
            System.out.print(y);
        }else if(perintah.equalsIgnoreCase("kecil")){
            y = y.toLowerCase();
            System.out.print(y);
        }else System.out.println("Input perintah salah");
    }
}