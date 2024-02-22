package stream;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Java_8_5 {
    public static void main(String[] args) {
//        Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
        List<String> stringList= List.of("Neha","Tiwari","Sakshi","Tiwari","Sanju","TIWARI");
        String collect = stringList.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(collect);

//        Print the numbers from a given list of integers that are multiples of 5
        List<Integer> numberList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        List<Integer> divisiblityOf5 = numberList.stream().filter(integer -> integer % 5 == 0).collect(Collectors.toList());
        System.out.println(divisiblityOf5);

//        Find the maximum and minimum of a list of integers
        Integer min = numberList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min "+min);

        Integer max = numberList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max "+max);

        int min1 = numberList.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max1 = numberList.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("------------------------------------------------------------");
        System.out.println("min1 "+min1);
        System.out.println("max1 "+max1);

//        Merge two unsorted arrays into a single sorted array using Java 8 streams
        List<Integer> numberList2= List.of(100,-2,3,-4,5,6,-7,8,-9,-10,11,12,13);
        List<Integer> numberList3= List.of(1,100,-2,3,-4,5,6,-7,8,-9,-10,11,12000,13);

    }
}
