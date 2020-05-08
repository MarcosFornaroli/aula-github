package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregados;

public class ExemploEmpregados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qtd de empregados: ");
		int qtdEmp = sc.nextInt();
		sc.nextLine();

		List<Empregados> listaEmp = new ArrayList<>();

		for (int i = 0; i < qtdEmp; i++) {

			System.out.println("Informe id: ");
			int id = sc.nextInt();
			sc.nextLine();

			while (buscaFuncionario(listaEmp, id) != null) {
				System.out.println("Funcionario já cadastrado!");

				id = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Informe nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe salário: ");
			double salario = sc.nextDouble();

			Empregados empregados = new Empregados(id, nome, salario);
			listaEmp.add(empregados);
		}

		System.out.println("Informe id com aumento salarial: ");
		int idFunc = sc.nextInt();
		sc.nextLine();
		Empregados empAumento = buscaFuncionario(listaEmp, idFunc);

		if (empAumento == null) {
			System.out.println("Funcionario nao existe para efetuar aumento.");
		} else {
			System.out.println("Informe o percentual de aumento: ");
			double aumento = sc.nextDouble();

			empAumento.aumentaSalario(aumento);
		}

		System.out.println("");
		for (Empregados empr : listaEmp) {

			System.out.println(empr);
		}

		sc.close();
	}

	private static Empregados buscaFuncionario(List<Empregados> listaEmp, int idFunc) {
		Empregados empAumento = listaEmp.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		return empAumento;
	}

}
