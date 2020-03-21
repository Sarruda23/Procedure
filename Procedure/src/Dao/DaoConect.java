package Dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoConect 
{
	public Connection getConnection() throws  DException,SQLException;
}
