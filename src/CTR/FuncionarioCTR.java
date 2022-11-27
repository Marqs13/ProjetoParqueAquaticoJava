package CTR;

import DAO.ConexaoDAO;
import java.sql.ResultSet;
import DTO.FuncionarioDTO;
import DAO.FuncionarioDAO;

/**
 * Classe para opera��es com a DAO oara funcionarios
 */
public class FuncionarioCTR implements BasicCTR<FuncionarioDTO> {

    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    /**
     * Fun��o para inserir dados no banco
     *
     * @param t objeto que sera gravado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    @Override
    public String inserir(FuncionarioDTO t) {
        try {
            if (funcionarioDAO.inserir(t)) {
                return "Funcionario cadastrado";
            }
            return "Funcionario n�o cadastrado";
        } catch (Exception err) {
            System.out.println("Erro FuncionarioCTR.inserir: " + err.getMessage());
            return "Funcionario n�o cadastrado";
        }
    }

    /**
     * Fun��o para consultar dados no banco
     *
     * @param t objeto que sera consultado no banco de dados
     * @param opcao opcao para consultar no banco, podendo ser todos da tabela
     * ou um em espec�fico
     * @return retorna os dados do banco de dados consultados
     */
    @Override
    public ResultSet consultar(FuncionarioDTO t, int opcao) {
        ResultSet rs = funcionarioDAO.consultar(t, opcao);
        return rs;
    }

    /**
     * Fun��o para alterar dados no banco
     *
     * @param Objeto que sera gravado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    @Override
    public String alterar(FuncionarioDTO t) {
        try {
            if (funcionarioDAO.alterar(t)) {
                return "Funcionario alterado";
            }
            return "Funcionario n�o alterado";
        } catch (Exception err) {
            System.out.println("Erro FuncionarioCTR.inserir: " + err.getMessage());
            return "Funcionario n�o alterado";
        }
    }

    /**
     * Fun��o para deletar dados no banco
     *
     * @param Objeto que sera deletado no banco de dados
     * @return retorna mensagem para mostrar ao usu�rio
     */
    @Override
    public String deletar(FuncionarioDTO t) {
        try {
            if (funcionarioDAO.deletar(t)) {
                return "Funcionario deletado";
            }
            return "Funcionario n�o deletado";
        } catch (Exception err) {
            System.out.println("Erro FuncionarioCTR.inserir: " + err.getMessage());
            return "Funcionario n�o deletado";
        }
    }

    /**
     * Fun��o para login do Funcionario
     *
     * @param Objeto com os dados do funcionario para autenticas
     * @return retorna o id_funcionario se conseguir
     */
    public int loginFuncionario(FuncionarioDTO t) {
        return funcionarioDAO.loginFuncionario(t);
    }

    /**
     * Fun��o para fechar comunica��o com banco de dados
     */
    public void CloseDB() {
        ConexaoDAO.closeDb();
    }

}
