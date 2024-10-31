package java8.streams_api;

import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStreams {

    public static void main(String[] args) {
        List<String> lista = List.of("A", "B", "C", "D", "");

        // Foreach
        lista.forEach(item -> System.out.println(item));

        //Filter and Reduce for one result
        String ab = lista.stream().filter(String::isBlank).reduce((a, b) -> "").orElse("");

        //map
        lista.stream().map(String::toUpperCase).forEach(System.out::println);

        //AnyMatch
        boolean algumVazio = lista.stream().anyMatch(String::isBlank);
        System.out.println(algumVazio);




    }
}
