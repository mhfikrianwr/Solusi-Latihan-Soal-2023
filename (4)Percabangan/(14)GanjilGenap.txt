//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if(y<=0) y*=-1;
        if(y%2==1)System.out.println("Ganjil");
        else if(y%2==0) System.out.println("Genap");
    }
}