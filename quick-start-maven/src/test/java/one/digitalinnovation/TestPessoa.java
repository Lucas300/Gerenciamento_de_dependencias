package one.digitalinnovation;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPessoa {

	
	@Test //Anotação primordial para testar
	public void deveCalcularCorretamente() {
		Pessoa jessica = new Pessoa("João", 22);          // cria o Cenário para testar
		Assertions.assertEquals(22, jessica.getIdade());  // Executa as validações
	}

	@Test
	void deveRetornarSeehMaiorDeIdade() {
		Pessoa jessica = new Pessoa("João", 22); // cria o Cenário para testar
		Assertions.assertTrue(jessica.isMaiorDeIdade());// Executa as validações
		
		Pessoa joao = new Pessoa("João", 17); // cria o Cenário para testar
		Assertions.assertFalse(joao.isMaiorDeIdade());// Executa as validações
	}

}
