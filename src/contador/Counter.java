package contador;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametroInvalidoException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametroInvalidoException {
        int contagem = parametroDois - parametroUm;
        if (contagem > 0) for (int i = 1; i <= contagem; i++) System.out.printf("Imprimindo o número %d\n", i);
        else throw new ParametroInvalidoException();
    }
}