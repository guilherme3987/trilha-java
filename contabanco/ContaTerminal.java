package contabanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in);

        Double saldo = 237.48;

        System.out.print("Por favor, digite o número da conta: ");
        int num_conta = entrada_dados.nextInt();

        System.out.print("Por favor, digite o número da Agência  ");
        String agencia = entrada_dados.next();

        System.out.print("Por favor, digite o Titular: ");
        String nome  = entrada_dados.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n",
        nome, agencia, num_conta, saldo);


        entrada_dados.close();
    }
    
}