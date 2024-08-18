package contador;

import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2; // Inicializa com um valor que garante a entrada no loop
        
        do {
            // Definindo um array com um tamanho fixo para os parâmetros
            final int MAX_PARAMETROS = 10;
            int[] parametros = new int[MAX_PARAMETROS];
            int count = 0; // Contador de parâmetros válidos
            
            // Leitura de múltiplos parâmetros
            System.out.println("Digite até " + MAX_PARAMETROS + " parâmetros. Digite um valor inválido para parar:");
            for (int i = 0; i < MAX_PARAMETROS; i++) {
                System.out.println("Digite o parâmetro " + (i + 1) + ":");
                String input = scan.next();
                
                try {
                    int parametro = Integer.parseInt(input);
                    parametros[count++] = parametro; // Armazenando o parâmetro no array
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Parando a entrada de parâmetros.");
                    break;
                }
            }
            
            if (count < 2) {
                System.out.println("Você deve inserir pelo menos dois parâmetros.");
                continue;
            }

            // Determinar o menor e o maior valor dos parâmetros
            int parametroUm = Integer.MAX_VALUE;
            int parametroDois = Integer.MIN_VALUE;

            for (int i = 0; i < count; i++) {
                if (parametros[i] < parametroUm) {
                    parametroUm = parametros[i];
                }
                if (parametros[i] > parametroDois) {
                    parametroDois = parametros[i];
                }
            }

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\n\n\nDigite 1 se quiser repetir ou 2 para parar.");
            n = scan.nextInt();
        } while (n != 2);
        
        scan.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}