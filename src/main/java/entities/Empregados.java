package entities;

public class Empregados {
	private int id;
	private String nome;
	private double salario;

	public Empregados(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentaSalario(double taxa) {
		this.salario += salario * taxa / 100;
	}

	public String toString() {
		return "Empregados [id=" + id + ", nome=" + nome + ", salario= " + String.format("%.2f%n", salario);
	}

}
