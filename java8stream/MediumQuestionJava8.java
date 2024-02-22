package java8stream;


//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MediumQuestionJava8 {
    public static void main(String[] args) {

//      1.  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

        List<Integer> numIntegers = IntStream.rangeClosed(0, 10).boxed().toList();
        List<Integer> evenNumber = numIntegers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(numIntegers);
        System.out.println(evenNumber);

//        find even and odd both
        Map<Integer, List<Integer>> collect = numIntegers.stream().collect(Collectors.groupingBy(integer -> integer % 2));
        System.out.println(collect);
        Map<Boolean, List<Integer>> collect1 = numIntegers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        System.out.println(collect1);




//        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> startWithOne = IntStream.rangeClosed(0,100).boxed().toList().stream().filter(integer -> integer.toString().startsWith("1")).toList();
        System.out.println(startWithOne);

//        3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> list = List.of(1,2,3,1,2,3,5,10,0,1,1,1,1,2,2,2,5,1,0,8);
//        get all distinct elements or else we can even convert it into set .
        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.println(distinctList);
        System.out.println("-------------------------");

//        find duplicate only
        Set<Integer> integers = new HashSet<>();
        List<Integer> duplicateList = List.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34).stream().filter(integer -> !integers.add(integer)).collect(Collectors.toList());
        System.out.println(duplicateList);

//    find frequency of the elements

        Map<Integer, Long> integerLongMap = List.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(integerLongMap);
// find duplicate element
        List<Integer> duplicateElement = integerLongMap.entrySet().stream().filter(ele -> ele.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(duplicateElement);
// find duplicate elememt by frequency method.
        List<Integer> numberList = List.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        List<Integer> collect2 = numberList.stream().filter(integer -> Collections.frequency(numberList, integer) > 1).collect(Collectors.toList());
        System.out.println(collect2);
        Set<Integer> collect3 = collect2.stream().collect(Collectors.toSet());
        System.out.println(collect3);


//        Flattening Nested Collections in Java

        List<Integer> integers1 = List.of(1,2,3);
//        integers1.addAll(List.of(10,10,20));  // this is a unsupported Operation as the above list is immutable.
        System.out.println(integers1);

        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allproducts = new ArrayList<List<String>>();
//adding elements to the list
        allproducts.add(productlist1);
        allproducts.add(productlist2);
        allproducts.add(productlist3);
        allproducts.add(productlist4);
        System.out.println("##################################################################");
        System.out.println(allproducts);   //nested List of string
        List<String> stringList = allproducts.stream().flatMap(Collection::stream).toList();
        System.out.println(stringList);

        List<List<Integer>> listOfListOfInt= new ArrayList<>();
        listOfListOfInt.add(List.of(1,2,3,4));
        listOfListOfInt.add(List.of(5,6,7,8));
        System.out.println(listOfListOfInt);



    }
}
