public class ContaEspecial extends Conta{

    public ContaEspecial(String nroConta, String agencia, PessoaFisica cliente, double chequeEspecial) {
        super(nroConta, agencia, cliente, chequeEspecial);
    }

    @Override
    public void setCliente(Pessoa cliente) {
        if(cliente.getClass().equals(PessoaFisica.class)){
            super.setCliente(cliente);
        }
    }

}