package exercicios;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
 */
public class Exec_02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}

}
