package java8stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class evenNo {
    public static void main(String[] args) {
        /*
         * Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
         * */

        List<Integer> numberList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        List<Integer> evenNumber = numberList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("even number list " + evenNumber);

        /*
         * 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
         * */
        List<Integer> startingWithOne = numberList.stream().filter(number -> number.toString().startsWith("1")).collect(Collectors.toList());
        List<String> collect = numberList.stream().map(num -> num.toString()).filter(num -> num.startsWith("1")).collect(Collectors.toList());
        System.out.println("startingWithOne " + collect);
        System.out.println("startingWithOne " + startingWithOne);


        /*
         * 3. How to find duplicate elements in a given integers list in java using Stream functions?
         * */
        List<Integer> numberList2 = List.of(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        List<Integer> collect1 = numberList2.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        System.out.println("collect1 " + collect1);
        /*
         * 4. Given the list of integers, find the first element of the list using Stream functions?
         * */
        Integer i = numberList2.stream().findFirst().get();
        System.out.println("i "+i);


    }
}
