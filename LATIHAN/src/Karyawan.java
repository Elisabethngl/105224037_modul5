public class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok;

    protected String departemen;

    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getNama() {
         return nama; 
        }
    public void setNama(String nama) { 
        this.nama = nama;
     }

    public void setGajiPokok(double gaji) {
        if (gaji >= 0) {
            this.gajiPokok = gaji;
        } else {
            System.out.println("Teguran: Nominal gaji tidak boleh kurang dari nol!");
        }
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public void tampilkanDataKaryawan() {
        System.out.println("\n=== DATA KARYAWAN ===");
        System.out.println("ID         : " + idKaryawan);
        System.out.println("Nama       : " + nama);
        System.out.println("Departemen : " + departemen);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}