//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int banyak = 0,tengah;
        for(int i=1; i<=n/2; i++){
            tengah = banyak + i;
            for(int y=1; y<= (n - tengah)/2; y++) System.out.print(" ");
            for(int y=tengah; y>= 1; y--){
                if(y%2==1){
                    System.out.print("*");
                    
                }else System.out.print(" ");
            }
            System.out.println();
            banyak++;
        }
        for(int i=1; i<=n; i++){
            if(i%2==1) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
            for(int i=n/2; i>=1; i--){
            tengah = banyak + i;
            for(int y=(n - tengah)/2; y>= 1; y--) System.out.print(" ");
            for(int y=tengah; y>=1; y--){
                if(y%2==1){
                    System.out.print("*");
                    
                }else System.out.print(" ");
            }
            System.out.println();
            banyak--;
        }
    }
}