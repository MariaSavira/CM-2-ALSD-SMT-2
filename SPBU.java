import java.util.Scanner;

public class SPBU {
    public static void main(String[] args) {
        DataKendaraan data = new DataKendaraan();
        queuekendaraan queue = new queuekendaraan(100);
        Scanner sc = new Scanner(System.in);

        boolean ulang = true;
        while (ulang) {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Plat Nomor : ");
                    String platNomor = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan : ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Merk : ");
                    String merk = sc.nextLine();
                    Kendaraan kendaraan = new Kendaraan(platNomor, jenis, merk);
                    data.tambahKendaraan(kendaraan);
                    break;
                case 2:
                    System.out.println("");
                    data.tampilAntrian();
                    break;
                case 3:
                    System.out.println("\nAntrian saat ini : " + data.getJumlah());
                    break;
                case 4:
                    if (data.apaKosong()) {
                        System.out.println("\nTidak ada kendaraan dalam antrian.");
                    } else {

                        Kendaraan kendaraanDiproses = data.head.kendaraan;
                        System.out.println("\nPetugas melayani kendaraan " + kendaraanDiproses.platNomor);

                        System.out.print("Masukkan Jenis BBM (Pertalite, Pertamax, Solar): ");
                        String jenisBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per Liter: Rp ");
                        double hargaPerLiter = sc.nextDouble();
                        System.out.print("Masukkan Jumlah Liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine();

                        BBM bbm = new BBM(jenisBBM, hargaPerLiter);
                        TransaksiPengisian transaksi = new TransaksiPengisian(kendaraanDiproses, bbm, liter);

                        queue.enqueue(transaksi);
                        data.head = data.head.next;
                        data.jml--;

                        System.out.println("\nTransaksi berhasil dicatat.");
                    }
                    break;
                case 5:
                    queue.tampilkanriwayat();
                    System.out.println("\nTotal BBM yang sudah dibeli (liter) :");
                    System.out.println("Pertalite : " + queue.pertalite);
                    System.out.println("Pertamax : " + queue.pertamax);
                    System.out.println("Solar : " + queue.solar);
                    break;
                case 0:
                    ulang = false;
                default:
                    System.out.println("\nTolong pilih yang benar.");
            }
        }
        System.out.println("\nTerimakasih!");
    }
}
