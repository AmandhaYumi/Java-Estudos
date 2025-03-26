import java.util.Scanner;

public class Ex1slide{

    //1-Ocasionalmente uma ONG parceira recebe doações em dólar e precisa saber qual é o valor
// em reais. Eles pediram para que você elabore um programa que permita que o usuário digite
// o valor da doação em dólares, converta esse valor para reais e exiba o resultado na tela
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor1;
        double dolar;
        double reais;

        System.out.println("Digite o valor em dólares: ");
        valor1 = entrada.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        dolar = entrada.nextDouble();

        reais = valor1 * dolar;

        System.out.println("O valor em reais é: "+ reais);
    }

}
