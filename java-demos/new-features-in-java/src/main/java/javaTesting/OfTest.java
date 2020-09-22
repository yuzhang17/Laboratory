package javaTesting;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfTest {
    void TestOf() {
        Map<Integer, Integer> integerIntegerMap = Map.of(1, 2, 3, 4);
        List<Integer> integers1 = List.of(1, 2);
        Set<Integer> integers = Set.of(3, 4);
    }
}
