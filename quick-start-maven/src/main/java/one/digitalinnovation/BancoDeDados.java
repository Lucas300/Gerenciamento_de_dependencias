package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {
	public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void IniciarConexao() {
	//fez algo
		LOGGER.info("Iniciou Conexão");
	}
	public static void FinalizaConexao() {
		//fez algo
			LOGGER.info("Finalizou Conexão");
	}
	public static void inserirDados(Pessoa pessoa) {
		LOGGER.info("Inseriu Dados");
	} 
	public static void removerDados(Pessoa pessoa) {
		LOGGER.info("Removeu dados");
	}

}
