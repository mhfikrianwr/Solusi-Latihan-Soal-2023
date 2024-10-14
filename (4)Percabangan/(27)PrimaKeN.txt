//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class PrimaKeN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
        int p = 2;
        while(i!=n){
            boolean prime = true;
            if(p==2){
                i++;
    
            }else{
                for(int y=2; y*y<=p; y++){
                    if(p%y==0){
                        prime = false;
                        break;
                    }
                }
                if(prime==true){
                    i++;
                }
                
            }
            if(i==n)System.out.println(p);
            p++;
        }
    }
} 