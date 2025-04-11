package secao03.aula04.APIStream.buscarElementos;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static Collection<Automovel> obterAutomoveis() {
        return List.of(
                new Automovel("ABC123", "Modelo A", 2015),
                new Automovel("DEF456", "Modelo A", 2016),
                new Automovel("GHI789", "Modelo B", 2015),
                new Automovel("JKL012", "Modelo A", 2018),
                new Automovel("MNO345", "Modelo A", 2017)
        );
    }

    public static Automovel obterAutomovel(String chassi) {
        return obterAutomoveis().stream()
                .filter(auto -> auto.getChassi().equals(chassi))
                .findFirst()
                .orElse(null);
    }

    public static Collection<String> obterChassis() {
        return List.of("ABC123", "MNO345");
    }

    public static void main(String[] args) {
        Collection<Automovel> automoveis = obterAutomoveis();

        List<String> paraRecall = automoveis.stream()
                .filter(e -> "Modelo A".equals(e.getModelo()))
                .filter(e -> e.getAnoFabricacao() >= 2015 && e.getAnoFabricacao() <= 2017)
                .map(Automovel::getChassi)
                .toList();

        System.out.println("Chassis para recall:");
        paraRecall.forEach(System.out::println);

        Collection<String> chassis = obterChassis();

        List<Automovel> automoveisDetalhados = chassis.stream()
                .map(Application::obterAutomovel)
                .filter(Objects::nonNull)
                .toList();

        System.out.println("\nDetalhes dos automóveis pelos chassis:");
        automoveisDetalhados.forEach(System.out::println);
    }
}
