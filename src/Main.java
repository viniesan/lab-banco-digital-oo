public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        GerenciadorDeClientes gerenciadorDeClientes = new GerenciadorDeClientes(banco);

        gerenciadorDeClientes.adicionarCliente("Venilton");
        gerenciadorDeClientes.adicionarCliente("Maria");
        gerenciadorDeClientes.adicionarCliente("Vinicius");
        
        Conta cc = new ContaCorrente(banco.getClientes().get(0));
        Conta poupanca = new ContaPoupanca(banco.getClientes().get(0));

        banco.getContas().add(cc);
        banco.getContas().add(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("");
        gerenciadorDeClientes.listarClientes();
    }
}
