package Dao;

import java.sql.SQLException;
import model.ModelPessoa;

public interface InPessoa{
	public String inserePessoa(ModelPessoa p) throws DException, SQLException;
}