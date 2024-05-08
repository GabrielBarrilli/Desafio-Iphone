import java.io.IOException;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop;
        int versao;

        System.out.println("Qual a versão do seu Iphone?");
        versao = scanner.nextInt();

        if (versao < 10) {
            System.out.println("Seu Iphone é de botão! Funções inválidas!");
        } else {
            System.out.println("Seu Iphone não é de botão! Funções válidas!");
            do {

                System.out.println("Digite uma opção:");

                System.out.println("1 - Aparelho Telefônico");
                System.out.println("2 - Navegador na Internet");
                System.out.println("3 - Reprodutor Musical");
                System.out.println("0 - Sair");

                loop = scanner.nextInt();

                switch (loop) {
                    case 0:
                        System.out.println("Saindo do Programa!");
                        scanner.nextLine();
                        break;

                    case 1:
                        AparelhoTelefonico.Ligacao();
                        scanner.nextLine();
                        break;

                    case 2:
                        NavegadorNaInternet.Conectar();
                        scanner.nextLine();
                        break;

                    case 3:
                        ReprodutorMusical.Reproduzir();
                        scanner.nextLine();
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        scanner.nextLine();
                        break;

                }
            }
            while (loop != 0);
        }
        System.out.println("Programa encerrado!");
    }
}