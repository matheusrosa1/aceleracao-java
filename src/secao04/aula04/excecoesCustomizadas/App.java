package secao04.aula04.excecoesCustomizadas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Para finalizar essa compra, é necessário ser maior de idade. Informe sua idade:");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        try {
            ehMaiorDeIdade(idade);
            System.out.println("Compra finalizada com sucesso!");
        } catch (MenorDeIdadeException e) {
            System.out.println("Você não pode finalizar a compra, pois é menor de idade.");
        } finally {
            entrada.close();
        }
    }

    private static boolean ehMaiorDeIdade(int idade) throws MenorDeIdadeException {
        if (idade < 18) {
            throw new MenorDeIdadeException();
        }
        return true;
    }
}
