public class ContohVarArgs {
    //kumpulanAngka disebut sebagai variable argumen
    //digunakan pada saat kita tidak mengetahui banyak suatu parameter
    // atau kita menginginkan parameter yang jumlahnya flexible
    public static int jumlahkan(int...kumpulanAngka){
        int total = 0;
        for (int nilai : kumpulanAngka){
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        int hasil1 = jumlahkan(10,20,50,20);
        System.out.println(hasil1);
    }
}