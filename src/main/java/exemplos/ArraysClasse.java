package exemplos;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ArraysClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();

		Produto[] prod = new Produto[qtd];

		for (int i = 0; i < prod.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();

			prod[i] = new Produto(nome, preco);

		}

		double soma = 0.0;
		for (int i = 0; i < prod.length; i++) {
			soma += prod[i].getValor();
		}

		System.out.printf("Media de valor: %.2f%n ", soma / qtd);
		sc.close();

	}

}
