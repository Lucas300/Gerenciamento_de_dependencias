package one.digitalinnovation;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
	@Test
	@EnabledIfEnvironmentVariable(named="USER",matches = "Lucas")
	void validarAlgoSomenteNoUsuarioLucas() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
	
}
