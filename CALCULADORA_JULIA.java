import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int adcao, subtracao, multiplicacao, resto;
        float divisão;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Qual o seu primeiro número? ");
        int num1 = userInput.nextInt();

        System.out.println("Qual o seu segundo número? ");
        int num2 = userInput.nextInt();

        userInput.close();

        adcao = (num1+num2);

        subtracao = (num1-num2);

        multiplicacao = (num1*num2);

        divisão = (num1/num2);

        resto = (num1%num2);

        System.out.println(String.format("A soma dos números digitados é: %d", soma));
        System.out.println(String.format("A subtração dos números digitados é: %d", diferenca));
        System.out.println(String.format("A multiplicação dos números digitados é: %d", multiplicacao));
        System.out.println(String.format("A divisão dos números digitados é: %.2f", divisão));
        System.out.println(String.format("O resto da divisão entre os números digitados é: %d", resto));
    }
}
            }
