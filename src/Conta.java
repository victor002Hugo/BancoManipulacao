public abstract class Conta {
    private Pessoa cliente;
    private String nroConta;
    private String agencia;
    private double saldo;
    private double chequeEspecial;

    public Conta(String nroConta, String agencia, Pessoa cliente, double chequeEspecial) {
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.chequeEspecial = chequeEspecial;
    }


    public String getNroConta() {
        return this.nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void extrato(){
        System.out.println("Nro Conta: "+this.nroConta+" - Saldo: "+ this.saldo);
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }


    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    //Depositar
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            return true;
        }else{
            System.out.println("Não foi possível realizar o deposito!");
            return false;
        }
    }

    public boolean transferir(double valor, Conta conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }else{
            System.out.println("Não foi possível realizar a transferencia!");
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor>0 && valor <= this.saldo+this.chequeEspecial){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }else{
            System.out.println("Não foi possível realizar o saque!");
            return false;
        }
    }



}