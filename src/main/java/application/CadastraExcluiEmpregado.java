package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregados;

public class CadastraExcluiEmpregado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de empregados para cadastro: ");
		int qtdEmpregado = sc.nextInt();
		sc.nextLine();

		// Criar o arrayList de Empregado.
		List<Empregados> listaEmpregado = new ArrayList<>();

		for (int i = 0; i < qtdEmpregado; i++) {
			System.out.println("Informe o ID do empregado: ");
			int idEmpregado = sc.nextInt();
			sc.nextLine();

			// Valida se id ja existe;
			while (buscaEmpregado(listaEmpregado, idEmpregado) != null) {
				System.out.println("Empregado já existe no cadastro, informe um novo ID: ");
				idEmpregado = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Informe o nome do empregado: ");
			String nomeEmpregado = sc.nextLine().toUpperCase();

			System.out.println("Informe o salário do empregado: ");
			Double salarioEmpregado = sc.nextDouble();

			listaEmpregado.add(new Empregados(idEmpregado, nomeEmpregado, salarioEmpregado));
		}

		System.out.println("Informe do ID do empregado que terá aumento: ");
		int idEmpregado = sc.nextInt();
		sc.nextLine();

		Empregados empregadoAumento = buscaEmpregado(listaEmpregado, idEmpregado);
		if (empregadoAumento != null) {
			System.out.println("Informe o percentual de aumento do empregado id " + idEmpregado + ": ");
			empregadoAumento.aumentaSalario(sc.nextDouble());
		} else {
			System.out.println("ID informado não existe para efetuar aumento salarial.");
			System.out.println("");
		}

		System.out.println("Lista de Empregados cadastrados");
		System.out.println("-------------------------------");
		for (Empregados empregado : listaEmpregado) {
			System.out.println(empregado);
		}
		System.out.println("");
		System.out.println("Deseja excluir algum empregado da lista (S/N)? ");
		sc.nextLine();
		String excluiFuncionario = sc.next().toUpperCase();

		while (!excluiFuncionario.equals("S") && !excluiFuncionario.equals("N")) {
			System.out.println("Opção informado é inválida!!! (" + excluiFuncionario + ")");
			System.out.println("Deseja excluir algum empregado da lista (S/N)? ");
			excluiFuncionario = sc.next().toUpperCase();

		}

		if (excluiFuncionario.equals("S")) {
			System.out.println("Qual ID de empregado deseja excluir: ");
			int idExcluiEmpregado = sc.nextInt();
			sc.nextLine();

			while (buscaEmpregado(listaEmpregado, idExcluiEmpregado) == null) {
				System.out.println("ID informado para exclusão não existe no cadastro!");
				System.out.println("Qual ID de empregado deseja excluir: ");
				idExcluiEmpregado = sc.nextInt();
				sc.nextLine();

			}

			Empregados excluiEmpregado = buscaEmpregado(listaEmpregado, idExcluiEmpregado);
			//listaEmpregado.removeIf(x -> x.getId() == excluiEmpregado.getId());
			listaEmpregado.remove(buscaEmpregado(listaEmpregado, idExcluiEmpregado));

		}

		System.out.println("");
		System.err.println("Lista atualizada de empregados");
		System.out.println("------------------------------");

		for (Empregados listaEmp : listaEmpregado) {
			System.out.println(listaEmp);
		}

		sc.close();
	}

	private static Empregados buscaEmpregado(List<Empregados> listaEmpregado, int idEmpregado) {
		Empregados empregadoAumento = listaEmpregado.stream().filter(x -> x.getId() == idEmpregado).findFirst()
				.orElse(null);
		return empregadoAumento;
	}

}
