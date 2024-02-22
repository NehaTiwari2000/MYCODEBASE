package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Java_8_4 {
    public static void main(String[] args) {
        //        Sort a given list of decimals in reverse order
        System.out.println("dfghjkl");
        List<Integer> doubleList = IntStream.of(100, -1, 0, 1, 2, 3, -100).boxed().collect(Collectors.toList());
        List<Integer> doubleList1 = doubleList.stream().sorted().collect(Collectors.toList());

        List<Integer> reverseOrder = doubleList.stream().sorted((num1, num2) -> num1 > num2 ? -1 : 1).collect(Collectors.toList());
        List<Integer> reverseOrder2 = doubleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("unsorted : doubleList" + doubleList);
        System.out.println("sorted : doubleList1" + doubleList1);
        System.out.println("reverseOrder : reverseOrder" + reverseOrder);
        System.out.println("reverseOrder2 : reverseOrder2" + reverseOrder2);

    }
}
