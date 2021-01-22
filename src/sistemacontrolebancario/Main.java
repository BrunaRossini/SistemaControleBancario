package sistemacontrolebancario;

import java.time.LocalDate;
import java.time.LocalDateTime;

import modelo.*;

public class Main {

	public static void main(String[] args) {
		
		 ContaComum cc1 = new ContaComum();
		 cc1.setNumeroConta(9887);
		 cc1.setFechamentoConta(null);
		 cc1.setAberturaConta(LocalDate.now());
		 cc1.setSaldoConta(0.0);
		 cc1.setSenhaConta(154);
		 cc1.setSituacaoconta(1);
		 
		 Movimento m1 = new Movimento();
		 m1.setTipoMovimento(1); //1 deposito 
		 m1.setDataHoraMovimento(LocalDateTime.now());
		 m1.setValorMovimento(1000.0);
		 m1.setContaMovimento(cc1);
		 
		 System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 
		 m1.efetivarMovimento();
		 
		 System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 
		 
		 Movimento m2 = new Movimento();
		 m2.setTipoMovimento(2); //2 saque
		 m2.setDataHoraMovimento(LocalDateTime.now());
		 m2.setValorMovimento(250.0);
		 m2.setContaMovimento(cc1);
		 
		 System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 
		 m2.efetivarMovimento();
		 
		 System.out.println("Saldo cc1: " + cc1.getSaldoConta());
		 

	}

}
