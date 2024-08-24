class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String agencia, String numero, Cliente cliente, double limiteChequeEspecial) {
        super(agencia, numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        if (valor > 0 && saldoDisponivel >= valor) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo < 0) {
                limiteChequeEspecial += novoSaldo; // Subtrai o valor negativo do limite
                novoSaldo = 0;
            }
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta " + getNumero());
        } else {
            System.out.println("Saldo e limite insuficientes ou valor de saque inválido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", limiteChequeEspecial=" + limiteChequeEspecial + '}';
    }
}
