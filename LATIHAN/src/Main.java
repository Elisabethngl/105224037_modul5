public class Main {
    public static void main(String[] args) {
        Karyawan kry = new Karyawan("12345", "Elisabeth");

        kry.departemen = "IT Support"; 

        System.out.println("Mencoba input gaji -5000...");
        kry.setGajiPokok(-5000);

        kry.setGajiPokok(5000000);

        kry.tampilkanDataKaryawan();
    }
}