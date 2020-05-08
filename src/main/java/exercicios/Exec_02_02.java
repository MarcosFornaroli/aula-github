package exercicios;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exec_02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt() % 2;

		if (numero == 0) {
			System.out.println("Número par.");

		} else {
			System.out.println("Número impar.");
		}
		sc.close();
	}

}
