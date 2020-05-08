package entities;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public void notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;

		if (notaFinal >= 60) {
			System.out.println(nome);
			System.out.printf("Nota final: " + "%.2f%n", notaFinal);
			System.out.println("APROVADO");
		} else {
			System.out.println(nome);
			System.out.println("REPROVADO");
			System.out.printf("Pontos que faltaram %.2f%n", 60 - notaFinal);
		}

	}
}
