package contohkasus.perulangan;

public class DoWhile {
    public static void main(String[] args) {
        int isiGelas = 200;
        int penuh = 225;

        System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        System.out.println("Isi gelas ketika penuh : " + penuh + "ml");

        do{
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        }while(isiGelas != penuh);
        System.out.println("Finale: Isi gelas sekarang : " + isiGelas + "ml");

    }
}