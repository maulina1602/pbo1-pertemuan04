package contohkasus.perulangan;

public class For {
    public static void main(String[] args) {
        int isiGelas =0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        System.out.println("Isi gelas ketika penuh : " + penuh + "ml");

        for(isiGelas = 0; isiGelas <= penuh ; isiGelas++){
            System.out.println("Sedang megisi gelas..");
            System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        }
        System.out.println("Finale: Isi gelas sekarang : " + isiGelas + "ml");
    }
}
