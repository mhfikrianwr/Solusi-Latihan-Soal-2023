//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class BilanganKeMN {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int awal = a, akhir = b;
        int z,q;
        z = (int)Math.pow(10, a);
        q = (int)Math.pow(10,a-1);
        a = angka % z;
        a = a / q;
        z = (int)Math.pow(10, b);
        q = (int)Math.pow(10, b-1);
        b = angka % z;
        b = b / q;
        if(awal > akhir){
            System.out.print(a + b);
        }else if(awal < akhir){
            System.out.print(a - b);
        }else{
            System.out.print(a * b);
        }
    }
} 