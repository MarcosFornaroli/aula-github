package application;

import java.util.Scanner;

import entities.Inquilino;

public class CadastroAluguel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de quarto que serão alugados: ");
		int numQuartosAlugados = sc.nextInt();
		sc.nextLine();

		Inquilino[] locacao = new Inquilino[10];

		for (int i = 0; i < numQuartosAlugados; i++) {

			System.out.println("Informe o nome do inquilino: ");
			String nomeInquilino = sc.nextLine().toUpperCase();

			System.out.println("Informe o email do inquilino: ");
			String emailInquilino = sc.nextLine().toUpperCase();

			System.out.println("Informe o quarto alugado: ");
			Integer numQuarto = sc.nextInt();
			sc.nextLine();

			locacao[numQuarto] = new Inquilino(nomeInquilino, emailInquilino);

		}

		sc.nextLine();
		System.out.println("Quartos alugados");
		System.out.println("---------------------------------------");
		for (int i = 0; i < locacao.length; i++) {
			if (locacao[i] != null) {
				System.out.println(i + ": " + locacao[i]);
			}

		}

		sc.close();

	}

}
