package algoritma.pertemuan7;

public class RekursiFactorial {
    public static void main(String[] args) {
        int hasilFactorial = 0;
        hasilFactorial = rekursifFactorial(6);
        System.out.println("total ="+hasilFactorial);

    }

    public static int rekursifFactorial(int a){
        if(a == 0){
            return 1;
        }else{
            int hasilFactorial=(a * rekursifFactorial(a-1));
            System.out.println("hasil Factorial =" + a +"= "+hasilFactorial);
            return hasilFactorial;
        }
    }
}
