public class KamarHotel {
    private String nomor_kamar;
    private String tipe_kamar;
    private int kapasitas_maksimal;
    private double harga_permalam;
    private boolean is_tersedia;

    public KamarHotel(String nomor, String tipe, int kapasitas) {
        this.nomor_kamar = nomor;
        setTipeKamar(tipe); 
        this.kapasitas_maksimal = kapasitas;
        this.harga_permalam = 0;
        this.is_tersedia = true;
    }

    public KamarHotel(String nomor, String tipe, int kapasitas, double harga) {
        this.nomor_kamar = nomor;
        setTipeKamar(tipe);
        this.kapasitas_maksimal = kapasitas;
        setHargaPerMalam(harga); 
        this.is_tersedia = true;
    }

    public String getNomorKamar() { return nomor_kamar; }
    public String getTipeKamar() { return tipe_kamar; }
    public int getKapasitasMaksimal() { return kapasitas_maksimal; }
    public double getHargaPerMalam() { return harga_permalam; }
    public boolean isTersedia() { return is_tersedia; }

    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || tipe.equalsIgnoreCase("Premium") || tipe.equalsIgnoreCase("Suite")) {
            this.tipe_kamar = tipe;
        } else {
            System.out.println("Peringatan: Tipe tidak valid! Otomatis diatur ke 'Reguler'."); 
            this.tipe_kamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) {
            System.out.println("Peringatan: Harga di bawah minimum! Otomatis diatur ke 50000."); 
            this.harga_permalam = 50000;
        } else {
            this.harga_permalam = harga;
        }
    }

    public void pesanKamar() {
        if (is_tersedia) {
            is_tersedia = false;
            System.out.println("Pemesanan berhasil untuk Kamar " + nomor_kamar); 
        } else {
            System.out.println("Peringatan: Kamar " + nomor_kamar + " sudah terisi!"); 
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!is_tersedia) {
            System.out.println("Peringatan: Kamar " + nomor_kamar + " sudah terisi!"); 
        } else if (jumlahTamu > kapasitas_maksimal) {
            System.out.println("Pesanan Ditolak: Jumlah tamu (" + jumlahTamu + ") melebihi kapasitas!"); 
        } else {
            is_tersedia = false;
            System.out.println("Pemesanan berhasil untuk " + jumlahTamu + " tamu di Kamar " + nomor_kamar); 
        }
    }

    public void batalPesan() {
        is_tersedia = true;
        System.out.println("Pemesanan Kamar " + nomor_kamar + " telah dibatalkan."); 
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return harga_permalam * jumlahMalam; 
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            System.out.println("Voucher Berhasil: Diskon 20% diterapkan."); 
            return total * 0.8;
        } else {
            System.out.println("Voucher Gagal: Syarat tidak terpenuhi atau kode salah. Menggunakan harga normal."); 
            return total;
        }
    }

    public void tampilkanInformasi() {
        System.out.println("=== Struk Informasi Kamar ==="); 
        System.out.println("Nomor Kamar   : " + nomor_kamar);
        System.out.println("Tipe Kamar    : " + tipe_kamar);
        System.out.println("Kapasitas Max : " + kapasitas_maksimal);
        System.out.println("Harga/Malam   : Rp " + harga_permalam);
        System.out.println("Status        : " + (is_tersedia ? "Tersedia" : "Dipesan"));
        System.out.println("-----------------------------");
    }
}