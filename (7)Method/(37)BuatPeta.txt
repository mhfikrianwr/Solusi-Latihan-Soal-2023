//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;

public class BuatPeta {

    public static void main(String[] args) {
        // Tuliskan kode kalian di sini dan menggunakan method kalian di bawah setidaknya 1 kali
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String y = in.next();
        printPeta(num1,num2,y);
    }
    
    public static String[][] buatPeta(int a,int c, String b) { // Boleh mengganti nama method
        String arr[][] = new String[a][c];
        for(int i=0; i<a; i++){
            for(int y=0; y<c; y++)
                arr[i][y]=b;
        }
        return arr;     
    }
    
    
    public static void printPeta(int a,int c, String b) { // Boleh mengganti nama method
        String z[][] = buatPeta(a,c,b);
    	for(int i=0; i<a; i++){
            for(int y=0; y<c; y++){
                System.out.print(z[i][y]);
            }
            System.out.println();
        }
}
} 