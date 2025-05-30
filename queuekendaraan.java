public class queuekendaraan {
    public TransaksiPengisian[] data;
    public int front;
    public int rear;
    public int size;
    public int capacity;

    public queuekendaraan(int capacity) {
        this.capacity = capacity;
        this.data = new TransaksiPengisian[capacity];
        this.front = 0;
        this.rear = -1; 
        this.size = 0;
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
        size++;
    }
    public TransaksiPengisian dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada transaksi untuk diambil.");
            return null;
        }
        TransaksiPengisian transaksi = data[front];
        front = (front + 1) % capacity;
        size--;
        return transaksi;
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
