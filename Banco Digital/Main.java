import java.time.LocalDate;

/*
 * “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”
 */

 public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Gui", "Santos", "Rua X", LocalDate.of(1995, 5, 20), "Dev");
        Cliente cliente2 = new Cliente("Ana", "Silva", "Rua Y", LocalDate.of(1988, 2, 10), "Engenheira");

        // Criando contas
        Conta contaCorrente = new ContaCorrente("001", "12345", cliente1, 1000.0);
        Conta contaPoupanca = new ContaPoupanca("001", "67890", cliente2, 0.02);

        // Criando banco e adicionando contas
        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Operações
        contaCorrente.depositar(500.0);
        contaPoupanca.depositar(1000.0);

        contaCorrente.sacar(200.0);
        contaPoupanca.sacar(50.0);

        contaCorrente.transferir(100.0, contaPoupanca);

        ((ContaPoupanca) contaPoupanca).renderJuros();

        // Listando contas
        banco.listarContas();
    }
}