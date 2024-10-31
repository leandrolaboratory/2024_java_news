package java16;

public class InstanceOf {
    public static void main(String[] args) {
        testInstanceOf("   TEXT   ");
    }

    //you can also declare the variable inside of if parameter
    public static void testInstanceOf(Object text){
        if(text instanceof String textString)
            System.out.println( (textString).strip() );
    }
}
