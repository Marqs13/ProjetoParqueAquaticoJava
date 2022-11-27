package CTR;

import java.sql.ResultSet;
import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import DTO.ClienteDTO;

/**
 * Classe para opera��es com a DAO oara cliente
 */
public class ClienteCTR implements BasicCTR<ClienteDTO> {
	private ClienteDAO clienteDAO = new ClienteDAO();

	/**
	* Fun��o para inserir dados no banco
	*
	* @param t objeto que sera gravado no banco de dados
	* @return retorna mensagem para mostrar ao usu�rio
	*/
	@Override
	public String inserir(ClienteDTO t) {
		try {
			if (clienteDAO.inserir(t)) {
				return "Cliente inserido";
			}
			return "Cliente n�o inserido";
		} catch (Exception err) {
			System.out.println("Erro ClienteCTR.inserir: " + err.getMessage());
			return "Cliente n�o inserido";
		}
	}

	/**
	* Fun��o para consultar dados no banco
	*
	* @param t objeto que sera consultado no banco de dados
	* @param opcao opcao para consultar no banco, podendo ser todos da tabela ou um em espec�fico
	* @return retorna os dados do banco de dados consultados
	*/
	@Override
	public ResultSet consultar(ClienteDTO t, int opcao) {
		ResultSet rs = clienteDAO.consultar(t, opcao);
		return rs;
	}

	/**
	* Fun��o para alterar dados no banco
	*
	* @param Objeto que sera gravado no banco de dados
	* @return retorna mensagem para mostrar ao usu�rio
	*/
	@Override
	public String alterar(ClienteDTO t) {
		try {
			if (clienteDAO.alterar(t)) {
				return "Cliente alterado";
			}
			return "Cliente n�o alterado";
		} catch (Exception err) {
			System.out.println("Erro ClienteCTR.inserir: " + err.getMessage());
			return "Cliente n�o alterado";
		}
	}

	/**
	* Fun��o para deletar dados no banco
	*
	* @param Objeto que sera deletar no banco de dados
	* @return retorna mensagem para mostrar ao usu�rio
	*/
	@Override
	public String deletar(ClienteDTO t) {
		try {
			if (clienteDAO.deletar(t)) {
				return "Cliente deletado";
			}
			return "Cliente n�o deletado";
		} catch (Exception err) {
			System.out.println("Erro ClienteCTR.inserir: " + err.getMessage());
			return "Cliente n�o deletado";
		}
	}

        /**
	* Fun��o para fechar comunica��o com banco de dados
	*/
        public void CloseDB() {
            ConexaoDAO.closeDb();
        }
        
}
