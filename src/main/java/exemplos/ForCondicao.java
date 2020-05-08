package exemplos;

import java.util.Scanner;

public class ForCondicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			soma += x;

		}
		System.out.println("Soma: " + soma);
		sc.close();

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}

		for (int i = 5; i >= 0; i--) {

			System.out.println("Valor de I: " + i);

		}
	}

}
