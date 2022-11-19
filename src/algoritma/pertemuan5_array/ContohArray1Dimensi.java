package algoritma.pertemuan5_array;

public class ContohArray1Dimensi {
    public static void main(String[] args) {
        String nama[] = {"tomi","tono","andi","gias","ikbal","aldi"};
        String buah[] = new String[5];

        buah[0] = "apel";
        buah[1] = "pepaya";
        buah[2] = "anggur";
        buah[3] = "rambutan";
        buah[4] = "durian";
//        buah[5] = "durian";

        // 2. mengambil isi dari array dengan manual
        System.out.println(buah[1]);

        System.out.println(nama[5]);

        System.out.println(nama[3]);

        //3. mengambil isi array dengan perulangan
        for(int i=0; i< nama.length; i=i+1){
            System.out.println("indek ke-"+i +" value="+nama[i]);
        }
        System.out.println("===========");
        //4. mengambil isi array dengan perulangan : buah
        for(int i=0; i< buah.length; i=i+1){
            System.out.println("buah ke-"+i +" value="+buah[i]);
        }

    }
}
