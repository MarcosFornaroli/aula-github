package exercicios;

import java.util.Scanner;

/*
 Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */
public class Exec_02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt() % 2;

		if (numero == 0) {
			System.out.println("N�mero par.");

		} else {
			System.out.println("N�mero impar.");
		}
		sc.close();
	}

}
