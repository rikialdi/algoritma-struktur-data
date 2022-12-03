package algoritma.pertemuan7;

public class RekursiKali {
    public static void main(String[] args) {
        int hasilKali = 0;
        hasilKali = rekursifKali(10,3);
        System.out.println("total ="+hasilKali);

    }

    public static int rekursifKali(int a, int b){
        if(b == 0){
            return 0;
        }else{
            int hasilKali=(a + rekursifKali(a, b-1));
            System.out.println("hasil kali =" + a + "+"+ b + "= "+hasilKali);
            return hasilKali;
        }
    }
}
