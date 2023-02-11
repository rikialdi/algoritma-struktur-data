package algoritma.pertemuan9_10;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort2Menurun {
    // Method menampilkan data
    public static void showData(int tab[], int batas) {
        // Deklarasi variabel method
        int i;

        for (i = 0; i < batas; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();
    }

    // Bagian program utama
    public static void main(String[] args) {
//        // Deklarasi variabel utama dan sekaligus memberi nilai pada data
//        int i;
//        int j;
//        int sisip;
//        int[] data = {6,1,2,3,4,5}; // silahkan di ganti untuk valuenya sesuai kebutuhan
//        int batas;
//
//        // Memberi masukan ke dalam variabel batas
//        batas = data.length;
//
//        // Menampilkan data yang belum terurut
//        showData(data, batas);
//
//        // Proses pengurutan metode penyisipan
//        for (i = 0; i < batas; i++) {
//            // Mengisi nilai sisipan dengan data[i]
//            sisip = data[i];
//
//            // Mengisi nlai indeks j
//            j = i - 1;
//
//            // Pengurutan menaik diganti dengan (<), jika shoritng menurun (>)
//            while ((j >= 0) && (sisip > data[j])) {
//                // Proses pertukaran/pergeseran data
//                data[j + 1] = data[j];
//                j = j - 1;
//            }
//
//            // Proses penyisipan data sisip
//            data[j + 1] = sisip;
//        }
//
//        // Menampilkan data yang sudah terurut
//        showData(data, batas);

        urutMenurun();
    }

    // ini logic bawaan library java :
    public static void urutMenurun(){
        Integer[] data = {6,1,2,3,4,5};

        Arrays.sort(data, Collections.reverseOrder()); // shoritng Menurun : descending
        for(int i =0; i<data.length; i++){
            System.out.println(data[i]);
        }
    }
}
