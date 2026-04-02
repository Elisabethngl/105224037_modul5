public class Main_pretest {
    public static void main(String[] args) {
        Rekening_bank akunSaya = new Rekening_bank("123456", 100000);

        akunSaya.set_saldo(150000); 

        akunSaya.set_saldo(-500); 

        System.out.println("Saldo akhir di akun " + akunSaya.getNomorRekening() + ": " + akunSaya.get_saldo());
    }
}