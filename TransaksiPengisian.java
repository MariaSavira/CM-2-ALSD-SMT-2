public class TransaksiPengisian {

    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanTransaksi() {
        System.out.println("Plat Nomor: " + kendaraan.platNomor);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
