package algoritma.pertemuan_3;

public class ContohIFAndCase {
    public static void main(String[] args) {
        methodCase();
    }

    public static void methodIF() {
        int a = 5, b = 7;
        if (a < b) {
            System.out.println("jakarta");
        }
        System.out.println("bandung");
    }

    public static void methodIFELSE() {
        int a = 5, b = 7;
        if (a < b) {
            System.out.println("jakarta");
        } else {
            System.out.println("bandung");
        }
        System.out.println("Surabaya");

    }

    public static void methodIFELSEIFELSE() {
        int umur = 44;
        if (umur <= 10) {
            System.out.println("Anak -anak");
        } else if (umur <= 18) {
            System.out.println("Remaja");
        } else if (umur <= 35) {
            System.out.println("Dewasa");
        } else if (umur <= 65) {
            System.out.println("Parubaya");
        } else {
            System.out.println("Tua");
        }
    }

    public static void methodCase() {
        int nilai1 = 44;
        int nilai2 = 44;
        String operator = "+";// + - / *
        switch (operator) {
            case "+" -> {
                System.out.println("Tambah=" + (nilai1 + nilai2));
            }
            case "-" -> {
                System.out.println("Kurang=" + (nilai1 - nilai2));
            }
            case "/" -> {
                System.out.println("Bagi=" + (nilai1 / nilai2));
            }
            case "*", "bintang" -> {
                System.out.println("Kali=" + (nilai1 * nilai2));
            }
            default -> {
                System.out.println("tidak di eksekusi");
            }
        }
    }
}