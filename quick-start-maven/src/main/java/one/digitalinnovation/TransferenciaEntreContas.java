package one.digitalinnovation;

public class TransferenciaEntreContas {
	public void transfere(Conta corrente,Conta poupanca,int valor) {
		if(valor <= 0	) {
			
		}else {
			throw new IllegalArgumentException("Valor deve ser maior que 0");
		}
	}
}
