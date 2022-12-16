package algoritma.pertemuan7;

public class RekursiPangkat {
    public static void main(String[] args) {
        int hasilPangkat = 0;
        hasilPangkat = rekursifPangkat(2,10);
        System.out.println("total ="+hasilPangkat);

    }
/*
4,3,2,1
4,3,2
4,3
 */
    public static int rekursifPangkat(int a, int b){
        if(b == 0){
            return 1;//proses stop
        }else{
            // proses rekursi
            int hasilPangkat=(a * rekursifPangkat(a, b-1));
            System.out.println("hasil Pangkat =" + a + "*"+ b + "= "+hasilPangkat);
            return hasilPangkat;
        }
    }
}
