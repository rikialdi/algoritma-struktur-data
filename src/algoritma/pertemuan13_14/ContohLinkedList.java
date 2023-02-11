package algoritma.pertemuan13_14;

public class ContohLinkedList {
    public static void main (String[] args){

        //---membuat head
        Node head = new Node();
        head.next = null;

        //---membuat elemen linked list a
        Node a = new Node();
        a.data = 10;
        a.next = null;

        //---menghubungkan head dengan elemen a
        head.next = a;

        //---MENAMBAH ELEMEN LINKED LIST DI AKHIR LIST---
        //---menambah elemen linked list b setelah a
        Node b = new Node();
        b.data = 20;
        b.next = null;
//---menghubungkan elemen a dengan elemen b
        a.next = b;

        //---menambah elemen linked list c setelah b
        Node c = new Node();
        c.data = 30;
        c.next = null;

        //---menghubungkan b dengan elemen c
        b.next = c;

        //---MENAMPILKAN ELEMEN LINKED LIST---
        System.out.println("MENAMBAH ELEMEN DI AKHIR LINKED LIST");
        Node t = new Node();
        t = head.next;
        if (t==null)
            System.out.println("Tidak Ada Elemen Linked List...");
        else
            System.out.print("Elemen Linked List = ");
        while (t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();

        //---MENAMBAH ELEMEN LIST DI AWAL LINKED LIST---
        Node d = new Node();
        d.data = 50;
        d.next = a;
        head.next = d;

        //---MENAMPILKAN ELEMEN LINKED LIST---
        System.out.println("MENAMBAH ELEMEN DI AWAL LINKED LIST");
        t = head.next;
        if (t==null)
            System.out.println("Tidak Ada Elemen Linked List...");
        else
            System.out.print("Elemen Linked List = ");
        while (t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();

        //---MENGHAPUS ELEMEN DI AKHIR LINKED LIST---
        t = head;
        if (t.next == null)
            System.out.println ("Tidak Ada Elemen Linked List...");
        else
            while (t.next.next != null)
                t = t.next;
        t.next = null;

        //---MENAMPILKAN ELEMEN LINKED LIST---
        System.out.println("MENGHAPUS ELEMEN DI AKHIR LINKED LIST");
        t = head.next;
        if (t==null)
            System.out.println("Tidak Ada Elemen Linked List...");
        else
            System.out.print("Elemen Linked List = ");
        while (t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();

        //---MENGHAPUS ELEMEN DI AWAL LINKED LIST---
        t = head;
        if (t.next == null)
            System.out.println ("Tidak Ada Elemen Linked List...");
        else
            t.next = t.next.next;

        //---MENAMPILKAN ELEMEN LINKED LIST---
        System.out.println("MENGHAPUS ELEMEN DI AWAL LINKED LIST");
        t = head.next;
        if (t==null)
            System.out.println("Tidak Ada Elemen Linked List...");
        else
            System.out.print("Elemen Linked List = ");
        while (t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
    }
}

