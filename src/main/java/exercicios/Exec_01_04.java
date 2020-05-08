package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec_01_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numero, horas;
		double valorHora, salario;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = horas * valorHora;

		System.out.println("NUMBER: " + numero);
		System.out.printf("SALARY: " + "U$ %.2f%n", salario);

		sc.close();

	}

}
