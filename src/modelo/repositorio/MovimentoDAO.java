package modelo.repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Movimento;

public class MovimentoDAO extends FabricaConexao {

	public int criarMovimento(Movimento movimento) {

		int id = 0;

		try {

			String stmtSql = "insert into movimentos (tipomovimento, datahora , valormovimento ,  numerocontacomum) "
					+ "values (?,?,?,?) returning id";

			PreparedStatement pStmt = conexao.prepareStatement(stmtSql);
			pStmt.setInt(1, movimento.getTipoMovimento());
			pStmt.setObject(2, movimento.getDataHoraMovimento());
			pStmt.setDouble(3, movimento.getValorMovimento());
			pStmt.setLong(4, movimento.getContaMovimento().getNumeroConta());

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				id = rs.getInt(1);
			}

		} catch (Exception e) {
			System.out.println("Erro ao realizar movimento na conta!" + e.getMessage());

		}

		return id;
	}
}
