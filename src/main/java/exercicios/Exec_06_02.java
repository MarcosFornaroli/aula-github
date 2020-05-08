package exercicios;

import java.util.Scanner;

import entities.Empregado;

public class Exec_06_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Empregado emp = new Empregado();

		System.out.println("Informe o nome do empregado: ");
		emp.nome = sc.next();
		sc.nextLine();
		System.out.println("Informe o seu salário: ");
		emp.salario = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe o valor do imposto: ");
		emp.imposto = sc.nextDouble();
		sc.nextLine();
		System.out.println("Empregado: " + emp);

		System.out.println("");
		System.out.println("Qual percentual de aumento salarial: ");
		double percentual = sc.nextDouble();
		emp.aumentoSalarial(percentual);

		System.out.printf("Salarial atualizado: " + emp);

		sc.close();
	}

}
