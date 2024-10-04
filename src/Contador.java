import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibe a mensagem da exceção customizada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo e lança a exceção customizada
        if (parametroUm > parametroDois) {
           
        }

        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realiza o for para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
    public class ParametrosInvalidosException extends Exception {

        // Construtor sem parâmetros
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    
        // Construtor que permite passar uma mensagem customizada
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
