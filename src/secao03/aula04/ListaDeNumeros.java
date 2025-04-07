package secao03.aula04;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(2);
        numeros.add(1);
        numeros.add(9);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
