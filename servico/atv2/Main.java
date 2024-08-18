package servico.atv2;

/*
Entrada	Saída
movel,banda larga,tv	Combo Completo
movel,tv	Combo Incompleto
banda larga,tv,movel	Combo Completo
 */
import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itera sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Remove espaços em branco antes e depois do nome do serviço
            String servicoTrimmed = servico.trim();
            
            // Define as variáveis booleanas com base no serviço contratado
            if (servicoTrimmed.equals("movel")) {
                movelContratado = true;
            } else if (servicoTrimmed.equals("banda larga")) {
                bandaLargaContratada = true;
            } else if (servicoTrimmed.equals("tv")) {
                tvContratada = true;
            }
        }

        // Verifica se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}