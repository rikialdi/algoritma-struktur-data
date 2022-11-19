package algoritma.pertemuan5_array;

public class ContohMethodReturn {

    public static void main(String[] args) {
        System.out.println("luas ="+luarPersegi(10));
        System.out.println("tambah ="+pertambahan(10,5));
        System.out.println("pengurangan ="+pengurangan(10,5));
        System.out.println(ucapSalam("Selamat datang"));
    }

    public static   int luarPersegi(int sisi){
        return sisi * sisi;
    }

    public static   int pertambahan(int a, int b){
        return a + b;
    }

    public static   int pengurangan(int a, int b){
        return a - b;
    }

    public static String ucapSalam(String value){
        return value;
    }
    /*
    diketahui:
    nama mahasiswa : arya, andini, gilang amsa,zuhdi,rohman

    1.buatlah nama tersebut ke dalam array 1 dimensi : dan cetak semua nilai dan index ke 4 ?

    2.buatlah nama2 tersbut ke dalam bentuk array 2 dimensi dengan ditambahkan umur(umur sembarang):
    contoh
    arya : 10
    gilang : 15

    note : buatlah dalam bentuk fungsi : (tidak dalam kelas main)
     */
}
