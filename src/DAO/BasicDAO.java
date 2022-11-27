package DAO;

import java.sql.ResultSet;

/**
 * Classe para opera��es CRUD b�sicas para a DAO 
 */
public interface BasicDAO<T> {
	/**
	* Fun��o para inserir dados no banco
	*
	* @param t objeto que sera gravado no banco de dados
	* @return retorna true se conseguir inserir e false se n�o conseguir inserir
	*/
	public boolean inserir(T t);

	/**
	* Fun��o para consultar dados no banco
	*
	* @param t objeto que sera consultado no banco de dados
	* @param opcao opcao para consultar no banco, podendo ser todos da tabela ou um em espec�fico
	* @return retorna os dados do banco de dados consultados
	*/
	public ResultSet consultar(T t, int opcao);

	/**
	* Fun��o para alterar dados no banco
	*
	* @param Objeto que sera gravado no banco de dados
	* @return retorna true se conseguir alterar e false se n�o conseguir alterar
	*/
	public boolean alterar(T t);

	/**
	* Fun��o para deletar dados no banco
	*
	* @param Objeto que sera deletar no banco de dados
	* @return retorna true se conseguir deletar e false se n�o conseguir deletar
	*/
	public boolean deletar(T t);
}
