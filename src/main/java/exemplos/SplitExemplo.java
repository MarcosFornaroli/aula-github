package exemplos;

/*
 * Esta classe demonstra o uso do split
 */
public class SplitExemplo {

	public static void main(String[] args) {

		String s = "DIA TARDE NOITE";

		String[] vetor = s.split(" ");

		String word1 = vetor[0];
		String word2 = vetor[1];
		String word3 = vetor[2];

		System.out.println("Primeira palavra: " + word1);
		System.out.println("Primeira palavra: " + word2);
		System.out.println("Primeira palavra: " + word3);
		System.err.println("----------------");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);

	}

}
