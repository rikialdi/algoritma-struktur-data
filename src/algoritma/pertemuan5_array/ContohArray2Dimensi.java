package algoritma.pertemuan5_array;

public class ContohArray2Dimensi {
    public static void main(String[] args) {
        // iniaisl dan isi array
        // punya teman -> ada HP
        /*
        "tomi", 09123
        "tono",09124
        "andi",09125
        "gias",09126
        "ikbal"09127
        "aldi"09128
         */
        String kontakTeman[][] ={
                {"tomi","09123"},//0
                {"tono","09124"},//1
                {"andi","09125"},//2
                {"gias","09126"},//3
                {"ikbal","09127"},//4
                {"aldi","09128"}// 5
                // 0      1
        };

        System.out.println(kontakTeman[3][1]); // ? cetak : 09126
        System.out.println(kontakTeman[4][0]); // ? cetak : ikbal
        System.out.println(kontakTeman[2][1]); // ? cetak :  09125
        System.out.println(kontakTeman[0][0]); // ? cetak :  tomi
        System.out.println(kontakTeman[0][1]); // ? cetak :  09123

        // cetak array dengan perulangan
        for(int i=0; i<kontakTeman.length; i++){
            System.out.println("nama ="+kontakTeman[i][0] + " HP  ="+kontakTeman[i][1]);
        }

    }
}
