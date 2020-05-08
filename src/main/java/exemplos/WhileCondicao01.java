package exemplos;

import java.util.Scanner;

public class WhileCondicao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int soma = 0;

		while (numero != 0) {

			soma += numero;
			numero = sc.nextInt();
		}

		System.out.println("Finalizou while!!!");
		System.out.println("Soma total: " + soma);
		sc.close();

	}

}
