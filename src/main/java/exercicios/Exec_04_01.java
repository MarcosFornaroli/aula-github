package exercicios;

import java.util.Scanner;

/*
 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.  
 */
public class Exec_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
