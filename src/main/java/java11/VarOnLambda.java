package java11;

import java.util.List;

public class VarOnLambda {

    public static void main(String[] args) {
        List<String> lista = List.of("A", "B", "C", "D", "");

        lista.forEach((String l)->System.out.println(l));

        //use VAR on lambda parameters now.
        lista.forEach((var l)->System.out.println(l));
    }
}
