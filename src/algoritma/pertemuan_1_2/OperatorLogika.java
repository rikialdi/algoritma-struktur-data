package algoritma.pertemuan_1_2;

public class OperatorLogika {
    /*
    && dan
    || atau
    ! NOT

     */
// menjalankans sebuah instruksi
    public static void main(String[] args) {
        int a  = 50;
        int b = 5;
        System.out.println("&&"+((a>b) && (b<a)));
        System.out.println("||"+((a>b) || (b<a)));
        System.out.println("!"+(a != 5));
    }
}
