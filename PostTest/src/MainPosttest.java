public class MainPosttest{
    public static void main(String[] args) {
        Barang laptop = new Barang("EL001", "Laptop ASUS");
    
        laptop.set_harga_satuan(8000000);
        laptop.tambah_stok(15); 
        laptop.tampilkan_detail_barang();

        System.out.println("\n--- Simulasi Tes Keamanan (Error Check) ---");

        laptop.set_harga_satuan(-5000); 
        laptop.kurangi_stok(100); 
    }
}