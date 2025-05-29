import java.util.Scanner;

public class SPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ulang = true;
        while (ulang){
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();

            switch(pilih){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    ulang = false;
            }
        } 
        System.out.println("\nTerimakasih!");
    }
}
