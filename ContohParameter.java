public class ContohParameter {
    public static int kalidua(int angka){
        return angka * 2;
    }
    public static double hitungLuasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hasilKaliDua = kalidua(5);
        System.out.println("5 x 2 = " + hasilKaliDua);

        double luasSegitiga = hitungLuasSegitiga(5, 2);
        System.out.println("Luas Segitiga = " + luasSegitiga);
    }

}