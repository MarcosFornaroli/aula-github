package entities;

public class Empregado {
	public String nome;
	public double salario;
	public double imposto;

	public double aumentoSalarial(double percentual) {
		return salario += salario * percentual / 100;
	}

	public double salarioLiquido() {
		return salario - imposto;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f%n", salarioLiquido());
	}
	
	

}
