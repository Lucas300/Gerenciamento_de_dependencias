package one.digitalinnovation;

public class Conta {
	private String nuemroDaConta;
	private int Saldo;
	
	public Conta(String nuemroDaConta, int saldo) {
		this.nuemroDaConta = nuemroDaConta;
		Saldo = saldo;
	}

	public String getNuemroDaConta() {
		return nuemroDaConta;
	}

	public void setNuemroDaConta(String nuemroDaConta) {
		this.nuemroDaConta = nuemroDaConta;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	
	
	
}
