package java12;

public class SwitchCase {
    public static void main(String[] args) {
        var age = 18;

        switch (age) {
            case 17, 16, 15 -> System.out.println("faixa de idade 1 ");
            case 18 -> System.out.println("faixa de idade 2 ");
            case 19 -> {
                //logic
                System.out.println("faixa de idade 3 ");
            }
            case 20 -> System.out.println("faixa de idade 4 ");
        }


        var yearsPlus = switch (age) {
            case 17, 16, 15 -> 1;
            case 18 -> 2;
            case 19 -> 3;
            default -> 0;
        };
        System.out.println(yearsPlus);


    }
}
