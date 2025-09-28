package conta_bancaria.model;

public abstract class Conta {

	// Atributos da Classe

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Método construtor

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	/* this.nome - identifica atributo da classe
	 = nome - parâmetro do método */

	public Conta(){}
		
		
	// Métodos Get e Set

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.saldo < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;  // indica que operação de saque não deu certo
		}

		this.saldo = this.saldo - valor;
		return true; //indica que operação deu certo, saque foi efetuado
	}

	public void depositar(float valor) {  // é void pois depositar sempre da certo, não precisa fazer verificação e nem retornar algo na tela
		this.saldo = this.saldo + valor;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupança";
		default -> tipo = "Desconhecido";
		}

		System.out.println("\n********************************************");
		System.out.println("Dados da conta");
		System.out.println("**********************************************");
		System.out.printf("Numero da conta: %d%n", this.numero);
		System.out.printf("Numero da agencia: %d%n", this.agencia);
		System.out.printf("Tipo da conta: %s%n", tipo);
		System.out.printf("Titular da conta: %s%n", this.titular);
		System.out.printf("Saldo da conta: R$ %.2f%n", this.saldo);
	}

}
