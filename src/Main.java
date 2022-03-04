
public class Main {

	public static void main(String[] args) {
		Cliente danilo = new Cliente();
		danilo.setNome("Danilo");
		
		Conta cc = new ContaCorrente(danilo);
		Conta poupanca = new ContaPoupanca(danilo);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprmirExtrato();
		poupanca.imprmirExtrato();
		
		

	}

}
