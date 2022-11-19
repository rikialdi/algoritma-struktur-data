package algoritma.pertemuan5_array;

import java.util.ArrayList;

public class ArrayListDasar {

	public static void main(String[] args) {
		ArrayList<String> java = new ArrayList<String>();
		java.add("Spring");
		java.add("Struct");
		java.add("Grails");
		
		ArrayList<String> php = new ArrayList<String>();
		php.add("Code Igniter");
		php.add("Laravel");
		php.add("Cake");

		ArrayList<String> cSharp = new ArrayList<String>();
		cSharp.add("ASP MVC");
		cSharp.add("WebForm");
		cSharp.add("NetCore");
		/* cSharp.remove("Contoh Remove"); */

		ArrayList<ArrayList<String>> twoArrList = new ArrayList<ArrayList<String>>();
		twoArrList.add(java);
		twoArrList.add(php);
		twoArrList.add(cSharp);
		
		
		for (int j = 0; j < twoArrList.size(); j++) {
			System.out.println(twoArrList.get(j));
		} // all masih array
		
		System.out.println();
		
		for (int i = 0; i < twoArrList.size(); i++) {
			for (int j = 0; j <twoArrList.size(); j++) {
				System.out.println(twoArrList.get(i).get(j)+", ");
			}
			System.out.println();
		}

	}

}
