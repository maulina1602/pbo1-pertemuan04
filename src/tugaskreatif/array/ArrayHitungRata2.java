package tugaskreatif.array;
import java.util.Scanner;
public class ArrayHitungRata2 {
    public static void main(String[] args){

        int Latihan[], n;
        Latihan = new int[100];
        float rata, total=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa kali latihan : ");
        n = scan.nextInt();

        for(int i = 1; i <=n; i++){
            System.out.print("Nilai Latihan Ke- "+ i +" : ");
            Latihan[i] = scan.nextInt();
            total = total + Latihan[i];
        }

        rata = total/n;
        System.out.println("Total Nilai: " + total);
        System.out.println("Nilai Rata-rata : " + rata);
    }
}
