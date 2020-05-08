package exercicios;

import java.util.Scanner;

public class Exec_01_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Soma: " + (a+b));
		
		sc.close();

	}

}
