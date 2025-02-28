//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;
public class HubunganTigaAngka {
    public static void main(String[] args) {
        /* Tuliskan kode kalian di sini */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b){
            if(c>a){
                System.out.print(b + " < " + a + " < " + c);
            }else if(c==a){
                System.out.print(b + " < " + a + " = " + c);
            }else{
                if(c==b){
                    System.out.print(b + " = " + c + " < " + a);
                }else if(c>b){
                    System.out.print(b + " < " + c + " = " + a);
                }else{
                    System.out.print(c + " < " + b + " < " + a);
                }
            }
        }else if(a == b){
            if(c > a){
                System.out.print(b + " = " + a + " < " + c);
            }else if(c<a){
                System.out.print(c + " < " + a + " = " + b);
            }else{
                System.out.print(b + " = " + a + " = " + c);
            }
        }else{
            if(c > a){
                if(c > b){
                    System.out.print(a + " < " + b + " < " + c);
                }else if(c<b){
                    System.out.print(a + " < " + c + " < " + b);
                }else{
                    System.out.print(a + " < " + b + " = " + c);
                }
            }else if(c==a){
                System.out.print(c + " = " + a + " < " + b);
            }else{
                System.out.print(c + " < " + a +" < " + b);
            }
        }
    }
}