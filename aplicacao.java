import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora");

        while (true) {
            System.out.println("Digite o primeiro numero");
            float num1 = input.nextFloat();
            System.out.println("Digite o segundo numero");
            float num2 = input.nextFloat();
            float resultado = 0;
            String operacao;
            while (true) {
                System.out.println("Digite a operacao");
                operacao = input.next();
                if (operacao.equals("+")) {
                    resultado = num1 + num2;
                    break;
                } else if (operacao.equals("-")) {
                    resultado = num1 - num2;
                    break;
                } else if (operacao.equals("*")) {
                    resultado = num1 * num2;
                    break;
                } else if (operacao.equals("/")) {
                    resultado = num1 / num2;
                    break;
                } 
                else if(operacao.equals("sair")){
                    break;
                }else {
                    System.out.println("Operacao invalida. Tente novamente, ou digite 'sair' para sair");
                }
            }
            
            if(!operacao.equals("sair")){
                System.out.println("O resultado da operacao e: " + resultado);
            }
            System.out.println("Deseja continuar? (s/n)");
            String continuar = input.next();
            if (continuar.equals("n")) {
                System.out.println("Obrigado por usar a calculadora");
                break;
            }
        }
    }
}