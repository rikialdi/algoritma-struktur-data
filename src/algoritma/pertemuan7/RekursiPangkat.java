package algoritma.pertemuan7;

public class RekursiPangkat {
    public static void main(String[] args) {
        int hasilPangkat = 0;
        hasilPangkat = rekursifPangkat(2,4);
        System.out.println("total ="+hasilPangkat);

    }

    public static int rekursifPangkat(int a, int b){
        if(b == 0){
            return 1;
        }else{
            int hasilPangkat=(a * rekursifPangkat(a, b-1));
            System.out.println("hasil Pangkat =" + a + "*"+ b + "= "+hasilPangkat);
            return hasilPangkat;
        }
    }
}
