package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_Java8_2 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 11, 1, 1, 0, 0, 0, 0, 0, 11, 11, 100, 11);
        List<Integer> distinctList = numberList.stream().distinct().collect(Collectors.toList());
        Set<Integer> distinctList2 = numberList.stream().collect(Collectors.toSet());
        System.out.println(distinctList);
        System.out.println(distinctList2);

//

    }
}
