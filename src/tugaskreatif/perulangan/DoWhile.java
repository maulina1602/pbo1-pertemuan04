package tugaskreatif.perulangan;

public class DoWhile {
    public static void main(String[] args) {
        int SppPerBULAN = 875;
        int SppLunas = 3500;

        System.out.println("SPP Bulan Ini : Rp." + SppPerBULAN);
        System.out.println("SPP LUNAS : Rp." + SppLunas);

        do{
            SppPerBULAN++;
            System.out.println("Masa Perkuliahan(nabung bayar spp) : Rp." + SppPerBULAN);
        }while (SppPerBULAN !=SppLunas);
        System.out.println("Finale: Akhir Semester SPP LUNAS : Rp." + SppPerBULAN);

    }
}

