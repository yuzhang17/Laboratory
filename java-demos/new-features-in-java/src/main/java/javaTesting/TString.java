package javaTesting;

public class TString {
    public static void testNewString() {
        System.out.println(" ".isBlank());
        System.out.println( " JavaStack ".strip());
        System.out.println( " JavaStack ".stripTrailing());
        System.out.println( " JavaStack ".stripLeading());
        System.out.println( " JavaStack ".repeat(3));
        System.out.println( " A\nB\nC".lines().count());



        System.out.println("======test java 12 transform======");
        var result = "foo"
                .transform(input -> input + " bar")
                .transform(String::toUpperCase);
        System.out.println(result);
        System.out.println("======test java 12 indent======");

        System.out.println("Java\n Python\nC++".indent(3));
    }

    public static void main(String[] args) {
        testNewString();
    }
}
