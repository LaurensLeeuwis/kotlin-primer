package eu.leeuwis.kotlinprimer.part12;

public class Java {

    public String thisIsJava() {
        return "I am Java";
    }

    public static void main(String[] args) {
        String fromKotlin = UsedFromJavaKt.aFunction();
        System.out.println(fromKotlin);
    }

    public static String cyclic() {
        String fromKotlin = UsedFromJavaKt.aFunction();
        return "java says: '" + fromKotlin + "'";
    }

}
