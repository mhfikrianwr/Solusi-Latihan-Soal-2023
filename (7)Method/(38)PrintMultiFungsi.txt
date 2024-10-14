//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;

public class PrintMultifungsi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0; i<n; i++){
            String x,y;
            x = in.nextLine();
            String arr1[] = x.split(" ");
            y = in.nextLine();
            String arr2[] = y.split(" ");
            printMultifungsi(arr1,arr2);
        }
    }   
    public static void printMultifungsi(String a[],String b[]) { // Boleh mengganti nama method dan return type
    	int i=0,y=0;
        System.out.print(b[y]);
        y++;
        while(i<a.length){
            if(i==a.length-1){
                System.out.print(a[i]);
                i++;
            }else{
                System.out.print(a[i]+b[y]);
                i++;
            }
        }
        y++;
        System.out.println(b[y]);
    }
}