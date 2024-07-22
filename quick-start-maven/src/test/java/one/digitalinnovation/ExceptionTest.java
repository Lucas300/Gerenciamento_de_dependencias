package one.digitalinnovation;

import org.junit.jupiter.api.*;

public class ExceptionTest {
	@Test
	void validarCenarioDeExcecaoNaTransferencia() {
		Conta origem = new Conta("12345",0);
		Conta destino = new Conta("456548",100);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->
			transferenciaEntreContas.transfere(origem, destino, 20));
	}
}
