public class ContaPoupanca extends ContaCorrente{
    public ContaPoupanca(String nroConta, String agencia, PessoaFisica cliente) {
        super(nroConta, agencia, cliente);
    }

    public void render(){
        Double saldo = super.getSaldo();
        super.setSaldo(saldo * 1.005);
    }

}