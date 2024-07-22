package one.digitalinnovation;

import org.junit.jupiter.api.*;
//Podemos colocar uma ordem nos testes, ordem numerica , ordem alfabetica , ordem de display....
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoOrdemTest {
	@Order(4)
	@Test
	void validarFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@Order(3)
	@Test
	void validarFluxoB() {
		Assertions.assertTrue(true);
	}
	
	@Order(2)
	@Test
	void validarFluxoC() {
		Assertions.assertTrue(true);
	}
	
	@Order(1)
	@Test
	void validarFluxoD() {
		Assertions.assertTrue(true);
	}
	
}
