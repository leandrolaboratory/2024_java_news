package java11;

import java.util.stream.Stream;

public class StringMethodsNews {
    public static void main(String[] args) {

        "  hello  ".strip();        // "hello"
        "Java".repeat(3);     // "JavaJavaJava"
        "   ".isBlank();            // true

        var anyString = "linha1 \nlinha2";

        //lines() use to separate the lines in a list
        Stream<String> lines = anyString.lines();
        lines.forEach(System.out::println);
    }
}
