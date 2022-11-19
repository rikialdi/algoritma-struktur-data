package algoritma.pertemuan5_array;

public class ArrayCopy {
	public static void main(String[] args) {
		String[] arrayStr = new String[3];
		arrayStr[0] = "400";
		arrayStr[1] = "500";
		arrayStr[2] = "600";
		
		String[] arrayStrBaru = new String[3];
		
		arrayStrBaru[0]=arrayStr[0];	
		arrayStrBaru[1]=arrayStr[1];
		arrayStrBaru[2]=arrayStr[2];
	
		for (int i = 0; i < arrayStrBaru.length; i++) {
			System.out.println(arrayStrBaru[i]);
			System.out.println(i);
		}
	}
}
