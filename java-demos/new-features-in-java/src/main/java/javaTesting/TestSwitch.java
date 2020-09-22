package javaTesting;

public class TestSwitch {
    static void previousVersion() {
        int numberOfLetters;

        Fruit fruit = Fruit.APPLE;
        switch (fruit) {
            case PEAR:
                numberOfLetters = 4;
                break;
            case APPLE:
            case GRAPE:
            case MANGO:
                numberOfLetters = 5;
                break;
            case ORANGE:
            case PAPAYA:
                numberOfLetters = 6;
                break;
            default:
                throw new IllegalStateException("No Such Fruit:" + fruit);
        }
        System.out.println(numberOfLetters);
    }

    static void currrentVersion() {
        Fruit fruit = Fruit.GRAPE;
        int numberOfLetters = switch (fruit) {
            case PEAR -> 4;
            case APPLE, MANGO, GRAPE -> 5;
            case ORANGE, PAPAYA -> 6;
            default -> throw new IllegalStateException("No Such Fruit:" + fruit);
        };
        System.out.println(numberOfLetters);
    }

    public static void testSwitchYield() {
        String x = "3";
        int i = switch (x) {
            case "1":
                int a = 1 +2;
                yield 1+2;
            case "2":
                yield 2;
            default:
                yield 3;
        };
        System.out.println(i);
    }

    public static void main(String[] args) {
        previousVersion();
        currrentVersion();
        testSwitchYield();
        var s = """
                       "line1"
                line2
                line3
                """;
        System.out.println(s);
    }


}

enum Fruit {
    PEAR, APPLE, GRAPE, MANGO, ORANGE, PAPAYA;
}
