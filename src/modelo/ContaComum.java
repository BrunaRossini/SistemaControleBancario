package modelo;

import java.time.LocalDate;

public class ContaComum {

	protected long numeroConta;
	protected LocalDate aberturaConta;
	protected LocalDate fechamentoConta;
	protected int Situacaoconta;
	protected int senhaConta;
	protected double saldoConta;

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public LocalDate getAberturaConta() {
		return aberturaConta;
	}

	public void setAberturaConta(LocalDate aberturaConta) {
		this.aberturaConta = aberturaConta;
	}

	public LocalDate getFechamentoConta() {
		return fechamentoConta;
	}

	public void setFechamentoConta(LocalDate fechamentoConta) {
		this.fechamentoConta = fechamentoConta;
	}

	public int getSituacaoconta() {
		return Situacaoconta;
	}

	public void setSituacaoconta(int situacaoconta) {
		Situacaoconta = situacaoconta;
	}

	public int getSenhaConta() {
		return senhaConta;
	}

	public void setSenhaConta(int senhaConta) {
		this.senhaConta = senhaConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

}
