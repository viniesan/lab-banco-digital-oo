public class GerenciadorDeClientes {

    private Banco banco;

    public GerenciadorDeClientes(Banco banco) {
        this.banco = banco;
    }

    public void adicionarCliente(String nome) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        banco.adicionarCliente(cliente);
    }

    public void listarClientes() {
        banco.listarClientes();
    }
}
