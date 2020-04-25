package tugaskreatif.perulangan;

public class For {
    public static void main(String[] args) {
        int SppPerBulan =875;
        int SppLunas = 3500;

        System.out.println("SPP Bulan Ini : Rp." + SppPerBulan);
        System.out.println("SPP LUNAS : Rp." + SppLunas);

        for(SppPerBulan = 875; SppPerBulan <= SppLunas ; SppPerBulan++){
            System.out.println("Masa Perkuliahan(nabung bayar spp) : Rp." + SppPerBulan);
        }
        System.out.println("Finale: Akhir Semester SPP LUNAS  : " +"Rp" + SppPerBulan);
    }
}

