package javaTesting;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
    public static void arrayOf() {
        var integers = List.of(3, 4);
        var integers1 = List.copyOf(integers);

        System.out.println(integers == integers1);

        var list = new ArrayList<>();
        var objects = List.copyOf(list);

        System.out.println(list == objects);

    }

    public static void main(String[] args) {
        arrayOf();
    }
}
