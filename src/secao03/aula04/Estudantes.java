package secao03.aula04;

import java.util.HashSet;

public class Estudantes {
    public static void main(String[] args) {
        HashSet<String> estudantes = new HashSet<>();
        estudantes.add("João");
        estudantes.add("Maria");
        System.out.println(estudantes);
        estudantes.remove("João");
        System.out.println(estudantes);
        System.out.println(estudantes.size());
        System.out.println(estudantes.contains("Maria"));
    }
}
