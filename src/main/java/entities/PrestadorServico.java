package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelPrestador;

public class PrestadorServico {
	private String nome;
	private NivelPrestador nivel;
	private double salarioBase;
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat();

	public PrestadorServico() {
	}

	public PrestadorServico(String nome, NivelPrestador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelPrestador getNivel() {
		return nivel;
	}

	public void setNivel(NivelPrestador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContrato() {
		return contratos;
	}

	public void adicionaContrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

	public double salarioMensal(int mes, int ano) {
		Double salarioMensal = salarioBase;
		Calendar cal = Calendar.getInstance();
		Integer mesContrato;
		Integer anoContrato;

		//for (Contrato contrato : contratos) {
		//	cal.setTime(contrato.getDataContrato());
		//	mesContrato.parse(cal.);

		//}

		return salarioMensal;
	}

}
