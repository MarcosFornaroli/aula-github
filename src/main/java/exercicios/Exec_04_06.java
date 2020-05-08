package exercicios;

import java.util.Scanner;

/*
 Ler um número inteiro N e calcular todos os seus divisores.  
 */
public class Exec_04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();
	}

}
