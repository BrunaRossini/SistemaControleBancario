package modelo;

import java.time.LocalDateTime;

public class Movimento {

	private int id;
	private int tipoMovimento;
	private LocalDateTime dataHoraMovimento;
	private double valorMovimento;
	private ContaComum contaMovimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(int tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public LocalDateTime getDataHoraMovimento() {
		return dataHoraMovimento;
	}

	public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}

	public double getValorMovimento() {
		return valorMovimento;
	}

	public void setValorMovimento(double valorMovimento) {
		this.valorMovimento = valorMovimento;
	}

	public ContaComum getContaMovimento() {
		return contaMovimento;
	}

	public void setContaMovimento(ContaComum contaMovimento) {
		this.contaMovimento = contaMovimento;
	}

	public void efetivarMovimento() {
		if (this.contaMovimento != null) {
			// deposito
			if (this.tipoMovimento == 1) {
				this.contaMovimento.setSaldoConta(this.contaMovimento.getSaldoConta() + this.valorMovimento);
				System.out.println("Deposito efetuado com sucesso");
			}
			// saque
			else if (this.tipoMovimento == 2) {
				if (this.contaMovimento.getSaldoConta() >= this.valorMovimento) {
					this.contaMovimento.setSaldoConta(this.contaMovimento.getSaldoConta() - this.valorMovimento);
					System.out.println("Saque efetuado com sucesso");
				} else {
					System.out.println("Movimento não efetivado por falta de saldo");
				}
			}

		}

	}
}
