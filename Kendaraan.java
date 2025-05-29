public class Kendaraan{
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi(){
        System.out.printf("Plat Nomor : " + platNomor +" | \tJenis Kendaraan : " + tipe + " | \tMerk : " + merk);
    }
}