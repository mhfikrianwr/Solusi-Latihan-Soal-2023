//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class KalkulatorKompleks {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int i=1; i<=tc; i++){
            String y;
            double a,b;
            y = in.next();
            a = in.nextDouble();
            b = in.nextDouble();
            if(y.equals("tambah")){
                System.out.printf("%.0f %c %.0f %s%.2f\n",a,'+',b,"= ",(a+b));
            }else if(y.equals("kurang")){
                System.out.printf("%.0f %c %.0f %s%.2f\n",a,'-',b,"= ",(a-b));
            }else if(y.equals("kali")){
                System.out.printf("%.0f %c %.0f %s%.2f\n",a,'*',b,"= ",(a*b));
            }else if(y.equals("bagi")){
                System.out.printf("%.0f %c %.0f %s%.2f\n",a,'/',b,"= ",(a/b));
            }else{
                System.out.printf("%.0f %c %.0f %s%.2f\n",a,'%',b,"= ",(a%b));
            }
        }
    }
}