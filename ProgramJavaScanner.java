import java.util.Scanner;

public class ProgramJavaScanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Tanggal lahir  : ");
        String tanggal = sc.next(), bulan = sc.next(), tahun = sc.next();
        System.out.println(tanggal + " " + bulan + " " + tahun);

        System.out.print("Tempat tinggal : ");
       String alamat = sc.next();
        System.out.println(alamat);
    }
}
