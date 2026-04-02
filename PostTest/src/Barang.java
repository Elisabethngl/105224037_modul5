public class Barang {
    private String id_barang;
    private String nama_barang;
    private int stok;
    private double harga_satuan;

    protected String kategori;
    public Barang(String id_barang, String nama_barang) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.stok = 0;
        this.harga_satuan = 0;
    }

    public void set_harga_satuan(double harga) {
        if (harga > 0) {
            this.harga_satuan = harga;
        } else {
            System.out.println("Error: Harga satuan nya tidak boleh <= 0!");
        }
    }

    public void tambah_stok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    public void kurangi_stok(int jumlah) {
        if (jumlah > 0 && this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Error: Stok tidak cukup atau jumlah tidak valid!");
        }
    }

    public void tampilkan_detail_barang() {
        System.out.println("ID Barang     : " + id_barang);
        System.out.println("Nama Barang   : " + nama_barang);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Stock Barang  : " + stok);
        System.out.println("Harga Satuan  : " + harga_satuan);
    }

    public int getStok() { return stok; }
    public double get_harga_satuan() { return harga_satuan; }
}