package exercicios;

import java.util.Scanner;

public class Exec_02_03 {

	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
	 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Os números a=" + a + " e b=" + b + " são múltiplos.");
		} else {
			System.out.println("Os números a=" + a + " e b=" + b + " não são múltiplos.");
		}

		sc.close();

	}

}
