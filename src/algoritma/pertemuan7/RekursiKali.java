package algoritma.pertemuan7;

public class RekursiKali {
    public static void main(String[] args) {
        int hasilKali = 0;
        hasilKali = rekursifKali(5,3);
        System.out.println("total ="+hasilKali);

    }
    /*
    3-1 =2   t 5
    2-1 =1   t 5

    10
     */
    public static int rekursifKali(int a, int b){
        //logic / algoritma
        if(b == 0){
            return 0; // proses berhenti
        }else{
            // melakukan proses rekursi
            int hasilKali=(a + rekursifKali(a, b-1));
            System.out.println("hasil kali =" + a + "+"+ b + "= "+hasilKali);
            return hasilKali;
        }
    }

    public void iniMethhod(){

    }



    /*
    3 -1 == 2
    2 -1 = 1
    1-1= 0
     */
}
