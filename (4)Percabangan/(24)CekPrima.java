//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class CekPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean prime = true;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        if(n==2) prime = true;
        if(n<=1) prime = false;
        if(prime)System.out.println("Prima");
        else System.out.println("Bukan prima");
    }
}