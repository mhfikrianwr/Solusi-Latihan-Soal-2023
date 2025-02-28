//Solution Were Made By Fikri TIF C 
//Kindly follow my insta @mhfikrianwr :D 
public class IndeksKeI {
    public static void main(String[] args) {
        // Tuliskan kode kalian di sini
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String a[] = new String[size];
        for(int i=0; i<size; i++){
            String y = in.nextLine();
            a[i] = y;
        }
        int cari = in.nextInt();
        System.out.println(a[cari]);
    }
}