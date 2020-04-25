package tugaskreatif.array;

public class ArrayMultidimensi {
    public static void main(String[] args) {

        String[][] meja = new String[2][3];

        meja[0][0] = "Maul    ";
        meja[0][1] = "Azizah  ";
        meja[0][2] = "Silvia  ";
        meja[1][0] = "Aliando ";
        meja[1][1] = "Syarief ";
        meja[1][2] = "Muhammad";

        System.out.println("+-------------------------------------------+");
        for(int mhs = 0; mhs < meja.length; mhs++){
            for(int i= 0;i<meja[mhs].length; i++){
                System.out.format("| %s  |\t", meja[mhs][i]);
            }
            System.out.println("");
        }
        System.out.println("+-------------------------------------------+");
    }
}