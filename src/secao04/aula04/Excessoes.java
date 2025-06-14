package secao04.aula04;

import java.util.Scanner;

public class Excessoes {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    Scanner entrada = new Scanner(System.in);
    try {
      System.out.println("Digite um número de índice que voce quer acessar: ");
      int indice = entrada.nextInt();

      numeros[indice] = 10;

      numeros[indice] = 2 / 0;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Índice inválido!");
    } catch (ArithmeticException e) {
      System.out.println("Ops! Não é possível realizar a divisão por 0");
    }
    entrada.close();
    System.out.println("Programa finalizado com sucesso!");
  }

}