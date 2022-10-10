
public class Main {

	public static void main(String[] args) {
		Cliente helen = new Cliente();
		helen.setNome("Helen");
		
		Conta cc = new ContaCorrente(helen);
		Conta poupanca = new ContaPoupanca(helen);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}