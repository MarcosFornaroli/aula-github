package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Exec_06_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante aluno = new Estudante();

		System.out.println("Nome do aluno: ");
		aluno.nome = sc.next();
		sc.nextLine();

		System.out.println("Informe a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Informe a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Informe a terceira nota: ");
		aluno.nota3 = sc.nextDouble();

		System.out.println("");
		aluno.notaFinal();

		sc.close();
	}

}
