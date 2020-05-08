package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ArrayListProdutoPrecoMedio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos: ");
		int qtdProdutos = sc.nextInt();
		sc.nextLine();

		List<Produto> listaProdutos = new ArrayList<>();
		double somaPrecoProduto = 0;

		for (int i = 0; i < qtdProdutos; i++) {

			System.out.println("Informe o produto desejado: ");
			String nomeProduto = sc.next();

			System.out.println("Informe o preço do produto: ");
			Double precoProduto = sc.nextDouble();

			listaProdutos.add(new Produto(nomeProduto, precoProduto));

			somaPrecoProduto += precoProduto;
		}

		sc.nextLine();
		System.out.println("Lista de produtos selecionados");
		System.out.println("------------------------------");

		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}

		sc.nextLine();
		System.out.println("Preço médio dos produtos: " + String.format("%.2f%n", somaPrecoProduto / qtdProdutos));
		sc.close();

	}

}
