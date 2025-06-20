
public class DataKendaraan {

    NodeKendaraan head;
    NodeKendaraan tail;
    int jml = 0;

    public DataKendaraan() {
        this.head = null;
        this.tail = null;
    }

    public boolean apaKosong() {
        return (head == null);
    }

    public String tambahKendaraan(Kendaraan kendaraan) {
        NodeKendaraan baru = new NodeKendaraan(kendaraan, null);
        NodeKendaraan sekarang = head;
        if (apaKosong()) {
            head = baru;
            jml++;
            return ">> Kendaraan masuk ke dalam antrian.";
        } else {
            while (sekarang.next != null) {
                sekarang = sekarang.next;
            }
            sekarang.next = baru;
            jml++;
            return ">> Kendaraan masuk ke dalam antrian.";
        }
    }

    public void tampilAntrian() {
        NodeKendaraan sekarang = head;

        if (sekarang == null) {
            System.out.println("Antrian kosong.");
        } else {
            while (sekarang != null) {
                sekarang.kendaraan.tampilkanInformasi();
                sekarang = sekarang.next;
            }
        }
    }

    public int getJumlah() {
        return jml;
    }

}
