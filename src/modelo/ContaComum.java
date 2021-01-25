package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContaComum {

	protected long numeroConta;
	protected LocalDate aberturaConta;
	protected LocalDate fechamentoConta;
	protected int Situacaoconta;
	protected int senhaConta;
	protected double saldoConta;
	private ArrayList<Movimento> movimentosConta;
	
	public ContaComum() {
		movimentosConta = new ArrayList<Movimento>();
	}

	public ArrayList<Movimento> getMovimentosConta() {
		return movimentosConta;
	}

	public void setMovimentosConta(ArrayList<Movimento> movimentosConta) {
		this.movimentosConta = movimentosConta;
	}

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
