//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class KalkulatorSimpel {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in =  new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.nextLine();
        String perintah = in.nextLine();
        if(perintah.equals("tambah")||perintah.equals("+")){
            System.out.printf("%.3f",a+b);
        }else if(perintah.equals("kurang")||perintah.equals("-")){
            System.out.printf("%.3f",a-b);
        }else if(perintah.equals("kali")||perintah.equals("*")){
            System.out.printf("%.3f",a*b);
        }else if(perintah.equals("bagi")||perintah.equals("/")){
            System.out.printf("%.3f",a/b);
        }else{
            double c = a %b;
            System.out.printf("%.3f",c);
        }
    }
}