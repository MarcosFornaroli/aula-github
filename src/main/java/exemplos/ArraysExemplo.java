package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ArraysExemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();
		double[] vect = new double[qtd];

		for (int i = 0; i < qtd; i++) {

			vect[i] = sc.nextDouble();

		}

		double soma = 0.0;
		for (int i = 0; i < qtd; i++) {
			soma += vect[i];
		}

		System.out.printf("Media: %.2f%n", soma / qtd);
		sc.close();
	}

}
