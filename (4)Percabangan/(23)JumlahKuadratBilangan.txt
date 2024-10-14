//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class JumlahKuadratBilangan {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        long a,b;
        a = in.nextInt();
        b = in.nextInt();
        long sum = 0;
        if(b <= a){
            long z = a;
            a = b;
            b = z;
        }
        for(long i=a; i<=b; i++){
            long z = i*i;
            sum += z;
        }
        System.out.print(sum);
    }
} 