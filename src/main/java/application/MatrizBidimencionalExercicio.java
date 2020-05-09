package application;

import java.util.Scanner;

public class MatrizBidimencionalExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de M: ");
		int m = sc.nextInt();
		sc.nextLine();

		System.out.println("Informe o valor de N: ");
		int n = sc.nextInt();
		sc.nextLine();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Informe um valor inteiro: ");
				mat[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}

		System.out.println("Qual valor inteiro deseja procurar? ");
		int x = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + ',' + j);
					if (i > 0) {
						System.out.println("Posição acima: " + mat[i - 1][j]);
					}
					if (j > 0) {
						System.out.println("Posição esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Posição direita: " + mat[i][j + 1]);
					}
					if (i < mat.length-1) {
						System.out.println("Posição abaixo: " + mat[i + 1][j]);
					}
				}

			}
		}

		sc.close();
	}

}
