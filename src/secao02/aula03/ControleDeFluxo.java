package secao02.aula03;

public class ControleDeFluxo {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("Número positivo.");
        } else if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número zero.");
        }
    }
}
