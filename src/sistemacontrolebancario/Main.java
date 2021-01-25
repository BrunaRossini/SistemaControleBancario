package sistemacontrolebancario;

import java.time.LocalDate;
import java.time.LocalDateTime;

import modelo.ContaComum;
import modelo.Movimento;
import modelo.repositorio.*;

public class Main {

	public static void main(String[] args) {

		// Instancia objetos repositorios
		ContaComumDAO ccDao = new ContaComumDAO();
		MovimentoDAO mvDao = new MovimentoDAO();

		// Numero da conta a ser persistida
		long numeroContaExemplo = 2316;

		// Cria e persite um objeto cc1 do tipo ContaComum com saldo 0.0
		ContaComum cc3 = new ContaComum();
		cc3.setNumeroConta(numeroContaExemplo);
		cc3.setAberturaConta(LocalDate.now());
		cc3.setFechamentoConta(null);
		cc3.setSituacaoconta(1);
		cc3.setSenhaConta(1239);
		cc3.setSaldoConta(0.0);

		ccDao.criarContaComum(cc3);

		// Cria e persite um movimento m1 da conta cc1 - Depósito de 1000
		Movimento m1 = new Movimento();

		m1.setContaMovimento(cc3);
		m1.registrarMovimento(1, 1000.0); // 1 = Deposito

		if (m1.getIdMovimento() > 0) {
			System.out.println(
					"MV ID " + m1.getIdMovimento() + ": Depósito de " + m1.getValorMovimento() + " realizado!\n");
		}

		// Cria e persite um movimento m2 da conta cc1 - Saque de 250
		Movimento m2 = new Movimento();

		m2.setContaMovimento(cc3);
		m2.registrarMovimento(2, 250.0); // 2 = Saque

		if (m2.getIdMovimento() > 0) {
			System.out
					.println("MV ID " + m2.getIdMovimento() + ": Saque de " + m2.getValorMovimento() + " realizado!\n");
		}


		// Fecha as conexões utilizadas
		ccDao.fecharConexao();
		mvDao.fecharConexao();

		/*
		 * ContaComum cc1 = new ContaComum(); cc1.setNumeroConta(9887);
		 * cc1.setFechamentoConta(null); cc1.setAberturaConta(LocalDate.now());
		 * cc1.setSaldoConta(0.0); cc1.setSenhaConta(154); cc1.setSituacaoconta(1);
		 * 
		 * Movimento m1 = new Movimento(); m1.setTipoMovimento(1); // 1 deposito
		 * m1.setDataHoraMovimento(LocalDateTime.now()); m1.setValorMovimento(1350.0);
		 * m1.setContaMovimento(cc1);
		 * 
		 * MovimentoDAO mDAO = new MovimentoDAO();
		 * 
		 * m1.setId(mDAO.criarMovimento(m1));
		 * System.out.println("id do movimento inserido: " + m1.getId());
		 * m1.efetivarMovimento(); System.out.println("Saldo cc1: " +
		 * cc1.getSaldoConta()); mDAO.fecharConexao();
		 * 
		 * ContaComumDAO ccDAO = new ContaComumDAO(); ccDAO.atualizarContaComum(cc1);
		 * ccDAO.fecharConexao();
		 */

		// MovimentoDAO mDAO = new MovimentoDAO();

		// m1.setId(mDAO.criarMovimento(m1));
		// System.out.println("id do movimento inserido: " + m1.getId());

		// System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		// mDAO.fecharConexao();

		/*
		 * ContaComumDAO ccDAO = new ContaComumDAO(); ccDAO.criarContaComum(cc1);
		 * ccDAO.fecharConexao();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Movimento m2 = new Movimento(); m2.setTipoMovimento(2); //2 saque
		 * m2.setDataHoraMovimento(LocalDateTime.now()); m2.setValorMovimento(250.0);
		 * m2.setContaMovimento(cc1);
		 * 
		 * //System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 * 
		 * //m2.efetivarMovimento();
		 * 
		 * //System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 * 
		 * FabricaConexao fconexao = new FabricaConexao();
		 * 
		 * fconexao.fecharConexao();
		 */

	}

}
