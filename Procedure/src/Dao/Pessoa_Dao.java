package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import model.ModelPessoa;

public class Pessoa_Dao implements InPessoa
{
	private Connection conexao;
	public Pessoa_Dao() throws DException,SQLException 
	{
		DaoConect dao = new DaoGenereco();
		conexao = dao.getConnection();
	}
	public String inserePessoa(ModelPessoa p) throws DException,SQLException 
	{
		String sql = "{CALL sp_inserePessoa(?,?,?)}";
		CallableStatement chamada = conexao.prepareCall(sql);
		chamada.setString(1, p.getCpf());
		chamada.setString(2, p.getNome());
		chamada.registerOutParameter(3, Types.VARCHAR);
		chamada.execute();
		String retorno = chamada.getString(3);
		return retorno;
	}
	
}
