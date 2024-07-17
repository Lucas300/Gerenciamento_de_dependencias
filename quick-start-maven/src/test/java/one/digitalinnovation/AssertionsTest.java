package one.digitalinnovation;


import org.junit.jupiter.api.Test;

//podemos usar o static na importação para diminuir o comando na linha de codigo 
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
//ou podemos importar todos
import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTest {
	@Test
	void ValidarLancamentos() {
		int[] primeiroLancamento = {10,20,30,40,50};
		int[] segundoLancamento = {1,3,16,22,19};

		assertNotEquals(primeiroLancamento, segundoLancamento);;
	}
	
	@Test
	void ValidarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		
		assertNull(pessoa);
		
		Pessoa luciano = new Pessoa("Lucas",24);
		assertNotNull(luciano); 
		
	}
	
	@Test
	void ValidarNumeros() {
		int n1 = 10;
		int n2 = 20;
		
		assertNotEquals(n1, n2);	
	}
}
