public class DenganMethod {
    public static void main(String[] args) {
        int gajipokok = 5000000;
        int tunjanganTransport = 5000000;
        int tunjanganMakan = 3000000;
        int bonus = 10000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajipokok ,tunjanganTransport ,tunjanganMakan ,bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan ,pajak);

        tampilkanDetailGaji(gajipokok ,tunjanganTransport ,tunjanganMakan ,bonus ,pajak ,gajiBersih);
    }
    public static int hitungTotalPenghasilan(int gajipokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajipokok + tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;
    }
    public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak;
    }
    public static void tampilkanDetailGaji(int gajipokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
        System.out.println("Gaji pokok: " + gajipokok);
        System.out.println("Tunjangan Transport : " + tunjanganTransport);
        System.out.println("Tunjangan Makan : " + tunjanganMakan);
        System.out.println("Bonus : " + bonus);
        System.out.println("Pajak : " + pajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}