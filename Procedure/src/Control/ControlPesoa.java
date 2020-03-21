package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Dao.DException;
import Dao.InPessoa;
import Dao.Pessoa_Dao;
import model.ModelPessoa;

public class ControlPesoa implements ActionListener 
{
	private JTextField cpf;
	private JTextField nome;
	
	public ControlPesoa(JTextField cpf, JTextField nome) 
	{
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			inserePessoa(cpf.getText(), nome.getText());
		} catch (DException | SQLException e1) 
		{
			JOptionPane.showMessageDialog(null, e1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void inserePessoa(String cpf, String nome) throws DException,SQLException 
	{
		ModelPessoa mp = new ModelPessoa(cpf, nome);
		InPessoa pd = new Pessoa_Dao();
		String ret = pd.inserePessoa(mp);
		JOptionPane.showMessageDialog(null, ret, "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
}
