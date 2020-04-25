package tugaskreatif.array;

public class DArrayCara2 {
    public static void main(String[] args) {
        String mataKuliah[];
        mataKuliah = new String [10];

        mataKuliah[0]="TUGAS Pemrograman Berbasis Objek 1";
        mataKuliah[1]="TUGAS Visual 2";
        mataKuliah[2]="TUGAS SIG";
        mataKuliah[3]="TUGAS SISTER";
        mataKuliah[4]="TUGAS Pemrograman Web 2";
        mataKuliah[5]="TUGAS JARKOM 2";
        mataKuliah[6]="TUGAS PDBASE";
        mataKuliah[7]="TUGAS SOSBUD";
        mataKuliah[8]="TUGAS FILSAFAT";
        mataKuliah[9]="TUGAS TAUHID";


        for (int i=0; i<10;i++){
            System.out.println("Matkul Ke- "+i+" "+mataKuliah[i]);
        }
        System.out.println("JANGAN BANYAK NGELUH, KERJAIN AJA BIAR PINTER :)");
    }
}
