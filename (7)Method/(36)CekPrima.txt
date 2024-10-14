//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class CekPrima {
    public static void main(String[] args) {
        // Tuliskan kode kalian di sini dan menggunakan method kalian di bawah setidaknya 1 kali
        cekPrima();
    } 
    public static void cekPrima() { // Boleh mengganti nama method, return type, dan parameter
    	// Tuliskan kode kalian di sini
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int b = in.nextInt();
            if(b<=1) System.out.println(b + " = Bukan prima");
            else if(b==2) System.out.println(b+ " = Prima");
           else{
            boolean prime = true;
            for(int y=2; y*y<=b; y++){
                if(b%y==0){
                    prime = false;
                    break;
                }
            }
            if(!prime)System.out.println(b + " = Bukan prima");
            else System.out.println(b + " = Prima");
        }
        }
        
    }
}