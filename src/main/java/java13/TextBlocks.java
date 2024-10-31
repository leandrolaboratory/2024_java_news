package java13;

public class TextBlocks {
    public static void main(String[] args) {
        //On TextBlock skip line automatically

        var bigText = """
                here inside
                you cant write
                anything that you want""";

        System.out.println(bigText);
    }
}
