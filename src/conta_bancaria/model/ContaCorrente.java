package conta_bancaria.model;


public class ContaCorrente extends Conta{ 
	//informa que classe ContaCorrente é herdada da classe Conta

	private float limite;
	
	public ContaCorrente (int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}


	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	
	@Override //informa/indica que este metodo foi sobreescrito da superclasse, foi criado para atender a uma especificidade da classe atual, ContaCorrente
	public void visualizar() {
		super.visualizar();
		System.out.printf("Limite da Conta: R$ %.2f%n", this.limite);
	}
	
	
}
