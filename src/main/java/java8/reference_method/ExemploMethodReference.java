package java8.reference_method;

import java.util.List;

public class ExemploMethodReference {
    public void exemplo1(){
        List<String> lista = List.of("A", "B", "C", "D");
        lista.forEach(System.out::print);
    }
    //use method reference when already exist some method
}
