import java.util.Scanner;

public class WSB {

	public static void main(String[] args) {
		// Zadanie 1
		System.out.println("--- ZADANIE 1 ---");

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " foo\n");
			} else if (i % 5 == 0) {
				System.out.print(i + " bar\n");
			} else if (i % 7 == 0) {
				System.out.print(i + " baz\n");
			} else if (i <= 50) {
				System.out.print(i + "\n");
			}

		}
		System.out.println();

		// Zadanie 2
		System.out.println("--- ZADANIE 2 ---");

		Scanner input = new Scanner(System.in);

		System.out.println("Wprowadz ci�g 1, kt�ry b�dzie szukany w ci�gu 2: ");
		String ciag1 = input.nextLine();
		System.out.println("Wprowadzono: " + ciag1);

		System.out.println("Wprowadz ci�g 2, w kt�rym b�dzie szukany w ci�g 1: ");
		String ciag2 = input.nextLine();
		System.out.println("Wprowadzono: " + ciag2);
		System.out.println();
		isSubString(ciag1, ciag2);

		// for (int k = 0; k < ciag1.length(); k++) {
		// System.out.println(ciag1.charAt(k));

		// for (int l = 0; l < ciag2.length(); l++) {
		// System.out.print(ciag2.charAt(l));

	}

	private static void isSubString(String input1, String input2) {

		if (input2.contains(input1) == true) {
			System.out.println("Ci�g 1 zawiera si� w ci�gu 2.");
			if (input1.charAt(0) == input2.charAt(0)) {
				System.out.println("Pierwsze znaki ci�g�w s� tej samej wielko�ci.");
				if (input1.charAt(input1.length()) == input2.charAt(input2.length())){
					System.out.println("Ostatnie znaki ci�g�w si� zgadzaj�");
				} else {
					System.out.println("Ostatnie znaki ci�g�w si� nie zgadzaj�.");
				}
			} else {
				System.out.println("Pierwsze znaki ci�g�w si� nie zgadzaj�.");
			}
		} else {
			System.out.println("Ci�g 1 NIE zawiera si� w ci�gu 2.");
		}

	}

}
