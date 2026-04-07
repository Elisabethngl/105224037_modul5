public class MainTHT {
    public static void main(String[] args) {
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 2, -10000);
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2, 200000);

        System.out.println("\n--- Simulasi Kamar 1 ---");
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Tagihan Kamar 1: Rp " + tagihan1);

        System.out.println("\n--- Simulasi Kamar 2 ---");
        kamar2.pesanKamar(4); 
        kamar2.pesanKamar(2); 
        kamar2.pesanKamar(); 

        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Tagihan Kamar 2 (Diskon 20%): Rp " + tagihan2);

        System.out.println("\n--- Hasil Akhir Kondisi Kamar ---");
        kamar1.tampilkanInformasi(); 
        kamar2.tampilkanInformasi(); 

    }
}