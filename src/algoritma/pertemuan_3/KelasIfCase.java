package algoritma.pertemuan_3;

public class KelasIfCase {

    static String namaVariable = "";
    static String namaVariable2 = null;
    static  String namaVariable3;

    // menjalankan program harus di dalam method main
    public static void main(String[] args) {
//        methodIf();
        methodCase();
    }

    //method create
    public static void methodIf(){
        int a =10;
        int b= 9;
        // tidak di eksekusi ketika kondisi tidak memenuhi
        if(a< b){
            System.out.println("Jakarta");
        }
        System.out.println("Bandung");
        namaVariable2 ="";
    }
    public static  void mehtodIfElse(){
        int a =7;
        int b= 9;
        // tidak di eksekusi ketika kondisi tidak memenuhi
        if(a< b){
            System.out.println("Jakarta");
        }else{
            System.out.println("Bandung");
        }
        System.out.println("Surabaya");
    }

    public static void methodIFELSEIFELSE() {
        int umur = 44;
        if (umur <= 10) {
            System.out.println("Anak -anak");
        } else if (umur <= 18) {
            System.out.println("Remaja");
        } else if (umur <= 35) {
            System.out.println("Dewasa");
        } else if (umur >=36 && umur <= 65) {
            System.out.println("Parubaya");
        } else {
            System.out.println("Tua");
        }
    }
    public static void methodCase(){
        int nilai1 =  7;
        int nilai2 = 9;

//        mebuat kalkulatoir operator +_*/
        String chekType ="*";

        switch (chekType){
            case "+" ->{
                System.out.println("Tambah=" + (nilai1 + nilai2));
            }
            case "-" ->{
                System.out.println("Kurang=" + (nilai1 - nilai2));
            }
            case "*" , "kali"->{
                System.out.println("Kali=" + (nilai1 * nilai2));
            }
            case "/","bagi" ->{
                System.out.println("Bagi=" + (nilai1 / nilai2));
            }
            default -> {
                System.out.println("eksekusi default jika variabel null : tidak ada isi");
            }
        }

    }

    public static  void StringEx(){
        namaVariable3 = "isikan dari sini";
//        String namaVariable2 = null;
    }
}
