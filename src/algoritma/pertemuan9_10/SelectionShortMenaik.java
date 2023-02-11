package algoritma.pertemuan9_10;


class SelectionShortMenaik {
    private long [] data;
    private int jumItem;

    public SelectionShortMenaik(int max){
        data = new long[max];
        jumItem = 0;
    }

    public void tambah(long nilai){
        data[jumItem] = nilai;
        jumItem++;
    }

    public void cetak(){
        for (int j=0; j<jumItem; j++)
            System.out.print(data[j] + " ");
        System.out.println(" ");
    }

    public void selection_sort(){
        int i,j,pos;
        for(i=0;i<jumItem-1;i++){
            pos = i;

            for(j=i+1;j<jumItem;j++){
                if(data[j] < data[pos])
                    pos = j;
            }
            if(pos != i)
                tukar(pos,i);

            System.out.print("Hasil langkah ke " +(i+1)+ " :");
            cetak();
            System.out.println();
        }
    }

    private void tukar(int a, int b){
        long temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
    public static void main(String[] args){
        perulangan();
        int ukuran = 100;
        SelectionShortMenaik DeretAngka;
        DeretAngka = new SelectionShortMenaik(ukuran);
        DeretAngka.tambah(15);
        DeretAngka.tambah(16);
        DeretAngka.tambah(2);
        DeretAngka.tambah(9);
        DeretAngka.tambah(21);
        DeretAngka.tambah(40);
        //  2 ,9,15,16,21,40 :
        System.out.print("Data awal : ");
        DeretAngka.cetak();
        System.out.println();
        DeretAngka.selection_sort();
        System.out.print("Data akhir : ");
        DeretAngka.cetak();
        System.out.println();
    }

    public static void perulangan (){
//        for while do while
        // 1 sd 15
        for(int i=1; i<=15; i++ ){
            System.out.println("cetak ="+i);
        }
    }
}
