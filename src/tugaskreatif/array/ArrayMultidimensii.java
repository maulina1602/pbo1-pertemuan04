package tugaskreatif.array;

public class ArrayMultidimensii {
    public static void main (String[] args){
        String[][]noAntrian={{"ALPIAH","0012"},{"MAUL","0013"},{"YAYAH","0014"}};

        for(int i=0; i<noAntrian.length; i++) {
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Nama         : " + noAntrian[i][0]);
            System.out.println("No Antrian   : " + noAntrian[i][1]);
        }
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
