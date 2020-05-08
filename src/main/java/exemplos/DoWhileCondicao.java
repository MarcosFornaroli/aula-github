package exemplos;

import java.util.Scanner;

public class DoWhileCondicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char resp;

		do {

			System.out.println("Digite a temperatura em C: ");
			double c = sc.nextDouble();
			double f = c/5 + 32;
			System.out.println("Temperatura em F: " + f);

			System.out.println("Deseja continuar? ");
			resp = sc.next().charAt(0);

		} while (resp == 'S');

		sc.close();

	}

}
