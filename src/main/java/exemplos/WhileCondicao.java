package exemplos;

import java.util.Scanner;

public class WhileCondicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		while (numero > 0) {
			System.out.println("Número = " + numero);
			numero = numero - 1;
		}

		sc.close();
	}

}
