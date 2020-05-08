package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec_01_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod1, qtd1, cod2, qtd2;
		double vlrUni1, vlrUni2, vlrTotal;

		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vlrUni1 = sc.nextDouble();

		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vlrUni2 = sc.nextDouble();

		vlrTotal = qtd1 * vlrUni1 + qtd2 * vlrUni2;

		System.out.printf("VALOR A PAGAR: " + "%.2f%n", vlrTotal);

		sc.close();

	}

}
