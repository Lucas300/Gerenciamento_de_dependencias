package one.digitalinnovation;

import org.junit.jupiter.api.*;

public class ConsutarDadosDePessoa {
	@BeforeAll  //Execução unica no inicio do test
	static void configuraConexao() {
		BancoDeDados.IniciarConexao();
	}

	@BeforeEach //toda vez que um teste rodar
	void insereDadosParaTeste() {
		BancoDeDados.inserirDados(new Pessoa("Lucas",24));
	}
	
	
	//O BeforeEach e o AfterEach rodam com base em quantos Test tem
	@AfterEach 
	void removeDadosParaTeste() {
		BancoDeDados.removerDados(new Pessoa("Lucas",24));
	}
	
	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	
	@AfterAll //Execução unica no Final do test
	static void finalizaConexao() {
		BancoDeDados.FinalizaConexao();
	}
}
