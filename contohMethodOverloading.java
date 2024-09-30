public class contohMethodOverloading {
    //method overloading digunakan untuk membuat method dengan nama yang sama
    //namun dengan fungsi yang berbeda, dengan prerequisite setiap method harus memiliki parameter yang berbeda

    public static double hitungLuas(double sisi){
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }
    public static double hitungLuas(double jariJari, boolean isLingkaran){
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println(luasPersegi);

        double luasPersegiPanjang = hitungLuas(4,6);
        System.out.println(luasPersegiPanjang);

        double luasLingkaran = hitungLuas(4,true);
        System.out.println(luasLingkaran);
    }
}