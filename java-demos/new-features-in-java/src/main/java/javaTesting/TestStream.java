package javaTesting;

import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    static void takeWhile() {
        List.of(12,23,43, 61, 53, 23).stream().takeWhile( x -> x <60).forEach(System.out::println);
        System.out.println("----------");
        List.of(12,23,43, 61, 53, 23).stream().dropWhile( x -> x <60).forEach(System.out::println);

    }

    static void ofNull() {
        System.out.println("------------");
        System.out.println(Stream.ofNullable(null).count());
        System.out.println(Stream.of(null, null).count());
        System.out.println(Stream.ofNullable("aaa").count());
    }

    public static void main(String[] args) {
        takeWhile();
        ofNull();
    }
}
