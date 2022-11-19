package algoritma.pertemuan5_array;

public class ArrayDuaDimensi {
	public static void main(String[] args) {
		int sizeBaris = 4;
		int sizeKolom = 2;
		String[][] sekatKontrakan = new String[sizeBaris][sizeKolom];

		sekatKontrakan[0][0] ="Andi";
		sekatKontrakan[0][1] ="Teman Andi";
		sekatKontrakan[1][0] ="Zaka";
		sekatKontrakan[1][1] ="Teman Zaka";
		sekatKontrakan[2][0] ="Bagas";
		sekatKontrakan[2][1] ="Teman Bagas";
		sekatKontrakan[3][0] ="Putra";
		sekatKontrakan[3][1] ="Teman Putra";
		
		System.out.println(sekatKontrakan[1][0]);
		
		for (int baris = 0; baris < sizeBaris; baris++) {
			for (int kolom = 0; kolom < sizeKolom; kolom++) {
				System.out.print(sekatKontrakan[baris][kolom]+ "|");				
			}
			System.out.println();
		}
		
	}

}
