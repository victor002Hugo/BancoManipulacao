public class ContaEmpresarial extends Conta{

    public ContaEmpresarial(String nroConta, String agencia, PessoaJuridica cliente, double chequeEspecial) {
        super(nroConta, agencia, cliente, chequeEspecial);
    }


    @Override
    public void setCliente(Pessoa cliente) {
        if(cliente.getClass().equals(PessoaJuridica.class)){
            super.setCliente(cliente);
        }
    }



}