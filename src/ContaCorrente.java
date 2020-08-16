
public class ContaCorrente extends Conta{

    public ContaCorrente(String nroConta, String agencia, PessoaFisica cliente) {
        super(nroConta, agencia, cliente, 0.0);
    }

    @Override
    public void setCliente(Pessoa cliente) {
        if(cliente.getClass().equals(PessoaFisica.class)){
            super.setCliente(cliente);
        }
    }

    @Override
    public void setChequeEspecial(double chequeEspecial) {}

}