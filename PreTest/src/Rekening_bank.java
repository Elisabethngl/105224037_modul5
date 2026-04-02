public class Rekening_bank {
    private String nomor_rekening;
    private double saldo;

    public Rekening_bank(String nomor_rekening, double saldo_awal) {
        this.nomor_rekening = nomor_rekening;
        set_saldo(saldo_awal);
    }

    public double get_saldo() {
        return saldo;
    }

    public void set_saldo(double saldo_baru) {
        if (saldo_baru >= 0) {
            this.saldo = saldo_baru;
            System.out.println("Saldo berhasil diperbarui menjadi: " + this.saldo);
        } else {
            System.out.println("Error: Saldo nya tidak boleh negatif!");
        }
    }

    public String getNomorRekening() {
        return nomor_rekening;
    }
}