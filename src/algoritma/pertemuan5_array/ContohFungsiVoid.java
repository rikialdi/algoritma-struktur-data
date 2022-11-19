package algoritma.pertemuan5_array;

public class ContohFungsiVoid {
    public static void main(String[] args) {
//        ucapkanSalam();
//        berlali();
//        panggilSemuaMethod();
        ucapkanSalam("selamat pagi");
        ucapkanSalam("selamat sore");
        ucapkanSalam("selamat malam");
        berlari("kucing persia","sore");
        berlari("kucing india","malam");
        berlari("kucing inonesia","pagi");
    }

    static  void ucapkanSalam(){
        System.out.println("selamat pagi");
    }

    static  void berlari(){
        System.out.println("kucing sedang berlari");
    }

    static  void panggilSemuaMethod(){
        ucapkanSalam();
        berlari();
    }

    // method dengan parameter
    static  void ucapkanSalam(String salam){
        System.out.println(salam);
    }

    static  void berlari(String namaKucing, String waktu){
        System.out.println("nama :"+namaKucing + " , waktu:"+waktu);
    }

}
