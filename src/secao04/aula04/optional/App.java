package secao04.aula04.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bob");
        Optional<Pessoa> optional = Optional.ofNullable(pessoa);

        if (optional.isPresent()) {
            System.out.println("Pessoa existe");
            System.out.println(optional.get().getNome());
        } else {
            System.out.println("Pessoa não existe");
        }
    }
}
