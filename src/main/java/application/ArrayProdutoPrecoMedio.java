package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ArrayProdutoPrecoMedio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos: ");
		int qtdProdutos = sc.nextInt();
		sc.nextLine();

		Produto[] listaProdutos = new Produto[qtdProdutos];

		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("Informe o produto: ");
			String produto = sc.next().toUpperCase();
			System.out.println("Informe o preço: ");
			Double preco = sc.nextDouble();

			listaProdutos[i] = new Produto(produto, preco);
		}

		sc.nextLine();
		System.out.println("Lista de produtos");
		System.out.println("----------------------------");
		double precoMedio = 0;

		for (int i = 0; i < listaProdutos.length; i++) {
			System.out.println(listaProdutos[i]);
			precoMedio += listaProdutos[i].getValor();
		}

		System.out.println("");
		System.out.println("Preço médio dos produtos é de R$ " + String.format("%.2f%n", (double) precoMedio / qtdProdutos));
		sc.close();

	}

}
