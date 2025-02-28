//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D
import java.util.Scanner;
public class BajakLaut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String arr[][] = new String[x][y];
        for(int i=0; i<x; i++){
            for(int z=0; z<y; z++)
                arr[i][z] = ".";
        }
        int hartax = in.nextInt();
        int hartay = in.nextInt();
        arr[hartax][hartay] = "X";
        int jebakan = in.nextInt();
        for(int i=0; i<jebakan; i++){
            int jebakanx = in.nextInt();
            int jebakany = in.nextInt();
            arr[jebakanx][jebakany] = "#";
        }
        arr[0][0] = "P";
        in.nextLine();
        String p = in.nextLine();
        String perintah[] = p.split(" ");
        int nowx = 0, nowy = 0;
        for(String pisah : perintah){
            if(pisah.equals("atas")){
                if(!arr[nowx-1][nowy].equals("#")){
                    arr[nowx][nowy] = ".";
                    nowx--;
                    if(arr[nowx][nowy].equals("X")){
                    System.out.println("Pemain menemukan harta karun pada koordinat (" + (nowx) + "," + (nowy) + ")");
                    }
                    arr[nowx][nowy] = "P";
                }else{
                    System.out.println("Pemain tidak bisa melewati koordinat (" + (nowx-1) + "," + (nowy) + ")");
                }
            }else if(pisah.equals("bawah")){
                    if(!arr[nowx+1][nowy].equals("#")){
                    arr[nowx][nowy] = ".";
                    nowx++;
                    if(arr[nowx][nowy].equals("X")){
                    System.out.println("Pemain menemukan harta karun pada koordinat (" + (nowx) + "," + (nowy) + ")");
                    }
                    arr[nowx][nowy] = "P";
                }else{
                    System.out.println("Pemain tidak bisa melewati koordinat (" + (nowx+1) + "," + (nowy) + ")");
                }
            }else if(pisah.equals("kanan")){
                    if(!arr[nowx][nowy+1].equals("#")){
                    arr[nowx][nowy] = ".";
                    nowy++;
                    if(arr[nowx][nowy].equals("X")){
                    System.out.println("Pemain menemukan harta karun pada koordinat (" + (nowx) + "," + (nowy) + ")");
                    }
                    arr[nowx][nowy] = "P";
                }else{
                    System.out.println("Pemain tidak bisa melewati koordinat (" + (nowx) + "," + (nowy+1) + ")");
                }
            }else{
                    if(!arr[nowx][nowy-1].equals("#")){
                    arr[nowx][nowy] = ".";
                    nowy--;
                    if(arr[nowx][nowy].equals("X")){
                    System.out.println("Pemain menemukan harta karun pada koordinat (" + (nowx) + "," + (nowy) + ")");
                    }
                    arr[nowx][nowy] = "P";
                }else{
                    System.out.println("Pemain tidak bisa melewati koordinat (" + (nowx) + "," + (nowy-1) + ")");
                }
            }
        }
        for(int i=0; i<x; i++){
            for(int z=0; z<y; z++){
                System.out.print(arr[i][z]);
            }
            System.out.println();
        }
    }
}