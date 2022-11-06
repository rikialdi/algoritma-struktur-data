package algoritma.pertemuan_3;

public class KelasPerulangan {
    public static void main(String[] args) {
//        forLoop();
        forLoopMenurun();
//        whileLoop();
    }


    public  static  void whileLoop(){
//        while (true){
//            System.out.println("do loop");
//        }


        int chekNilai = 0; // 0 + 1 + 1 +
        int pembandingNilai = 10;
        while (chekNilai <= pembandingNilai){
            System.out.println("do loop-"+chekNilai);
//            chekNilai++;
            chekNilai = chekNilai + 3;
        }

    }

    public static void forLoop() {
        // loncat 1 nilai
//        for (int start = 0; start <= 10; start++) {
//            System.out.println("perulangan ke-" + start);
//        }
        // loncat 2 nilai
        for (int start = 0; start <= 10; start = start + 2) {
            System.out.println("perulangan ke-" + start);
        }
    }

    public static void forLoopMenurun() {
//        for (int start = 20; start >= 10; start--) {
//            System.out.println("perulangan menurun ke-" + start);
//        }

//        for (int start = 20; start >= 10; start = start -2) {
//            System.out.println("perulangan menurun ke-" + start);
//        }

        //return, break, continue
        //break : berhenti dari perulangan
        // continuo : di lewatin , nilai tertntu tidak di eksekusi

        for (int start = 0; start <= 10; start = start + 1) {
           if(start == 6){
               continue;
           }

            if(start == 8){
                break; // proses berhenti
            }
            System.out.println("cetak angka ="+start);
        }
    }


}

