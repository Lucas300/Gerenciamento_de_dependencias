package one.digitalinnovation;

import org.junit.jupiter.api.*;

public class AssumptionsTest {
	@Test //Validando somente no Usuario Lucas	
	void validarAlgoSomenteNoUsuarioLucas() {
		Assumptions.assumeTrue("Lucas".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5+5);
	}
	
}
