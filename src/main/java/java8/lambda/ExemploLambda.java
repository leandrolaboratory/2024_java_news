package java8.lambda;

import java.util.List;

public class ExemploLambda {
    public void exemplo1(){
        List<String> lista = List.of("A", "B", "C", "D");
        lista.forEach(item -> System.out.println(item));
    }

    // use lambda when have not a method that does what you need
}
