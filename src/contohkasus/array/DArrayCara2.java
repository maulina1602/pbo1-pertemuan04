package contohkasus.array;

public class DArrayCara2 {
    public static void main(String[] args) {
        String mataKuliah[];
        mataKuliah = new String [10];

        mataKuliah[0]="Pemrograman Berbasis Objek 1";
        mataKuliah[1]="Visual 2";
        mataKuliah[2]="Rekayasa Perangkat Lunak";
        mataKuliah[3]="Organisasi Komputer";
        mataKuliah[4]="Pemrograman Web 2";


        for (int i=0; i<5;i++){
            System.out.println(mataKuliah[i]);
        }

    }
}
