public class queuekendaraan {
    public TransaksiPengisian[] data;
    public int front;
    public int rear;
    public int size;
    public int capacity;
    public int pertalite;
    public int solar;
    public int pertamax;

    public queuekendaraan(int capacity) {
        this.capacity = capacity;
        this.data = new TransaksiPengisian[capacity];
        this.front = 0;
        this.rear = -1; 
        this.size = 0;
        this.pertalite = 0;
        this.solar = 0;
        this.pertamax = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public void enqueue(TransaksiPengisian transaksi) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan transaksi.");
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = transaksi;
                if (data[rear].bbm.namaBBM.equalsIgnoreCase("Pertalite")){
            pertalite += data[rear].liter;
        } else if (data[rear].bbm.namaBBM.equalsIgnoreCase("Solar")){
            solar += data[rear].liter;
        } else if (data[rear].bbm.namaBBM.equalsIgnoreCase("Pertamax")){
            pertamax += data[rear].liter;
        }
        size++;
    }
   
    public void tampilkanriwayat() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada riwayat transaksi.");
            return;
        }
        System.out.println("Riwayat Transaksi Pengisian BBM:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            data[index].tampilkanTransaksi();
        }
    }
}
