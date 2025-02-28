//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        // Tuliskan kode kalian di sini
        Scanner in = new Scanner(System.in);
        String arr[][] = new String[3][3];
        for(int i=0; i<3; i++){
            for(int y=0; y<3; y++){
                String z =in.next();
                arr[i][y] = z;
            }
        }
        //hor
        if(arr[0][0].equals(arr[0][1])&&arr[0][1].equals(arr[0][2])){
            if(arr[0][0].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[1][0].equals(arr[1][1])&&arr[1][1].equals(arr[1][2])){
            if(arr[1][0].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[2][0].equals(arr[2][1])&&arr[2][1].equals(arr[2][2])){
            if(arr[2][0].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[0][0].equals(arr[1][0])&&arr[2][0].equals(arr[1][0])){
            if(arr[0][0].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[0][1].equals(arr[1][1])&&arr[2][1].equals(arr[1][1])){
            if(arr[0][1].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[0][2].equals(arr[1][2])&&arr[2][2].equals(arr[1][2])){
            if(arr[0][2].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[0][0].equals(arr[1][1])&&arr[1][1].equals(arr[2][2])){
            if(arr[0][0].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else if(arr[0][2].equals(arr[1][1])&&arr[1][1].equals(arr[2][0])){
            if(arr[0][2].equals("X")){
                System.out.println("X Menang");
            }else{
                System.out.println("O Menang");
            }
        }else{
            System.out.println("Draw");
        }
    }
}