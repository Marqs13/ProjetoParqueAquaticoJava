package CTR;

import java.sql.*;

/**
 * Classe para opera��es CRUD b�sicas para CTR
 */
public interface BasicCTR<T> {

    /**
     * Fun��o para inserir dados no banco
     *
     * @param t objeto que sera gravado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    public String inserir(T t);

    /**
     * Fun��o para consultar dados no banco
     *
     * @param t objeto que sera consultado no banco de dados
     * @param opcao opcao para consultar no banco, podendo ser todos da tabela
     * ou um em espec�fico
     * @return retorna os dados do banco de dados consultados
     */
    public ResultSet consultar(T t, int opcao);

    /**
     * Fun��o para alterar dados no banco
     *
     * @param Objeto que sera gravado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    public String alterar(T t);

    /**
     * Fun��o para deletar dados no banco
     *
     * @param Objeto que sera deletado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    public String deletar(T t);

    /**
     * Fun��o para fechar comunica��o com banco de dados
     */
    public void CloseDB();
}
