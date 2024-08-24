class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String agencia, String numero, Cliente cliente, double taxaRendimento) {
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Juros de R$" + rendimento + " aplicados na conta " + getNumero());
    }

    @Override
    public String toString() {
        return super.toString() + ", taxaRendimento=" + taxaRendimento + '}';
    }
}

