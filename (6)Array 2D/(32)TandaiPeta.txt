//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
import java.util.Scanner;

public class TandaiPeta {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyak1 = in.nextInt();
        int banyak2 = in.nextInt();
        char matriks[][] = new char[banyak1][banyak2];
        int tc = in.nextInt();
        int a ,b;
        for(int i=0; i<tc; i++){
            a = in.nextInt();
            b = in.nextInt();
            matriks[a][b] = '*';
        }
        for(int i=0; i<banyak1; i++){
            for(int y=0; y<banyak2; y++){
                if(matriks[i][y]!='*'){
                    System.out.print(".");
                }else System.out.print("x");
            }
            System.out.println();
        }
    }
}