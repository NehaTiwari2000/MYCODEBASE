package java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface TestPrint {
    static String fun() {
        return ("STATIC METHOD......");
    }

    abstract void function1();

}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        TestPrint testPrint = () -> {
            System.out.println("hello neha");
        };

        System.out.println(testPrint);

        Runnable fun = TestPrint::fun;

        Consumer<TestPrint> function1 = TestPrint::function1;


        List<Integer> integers = List.of(1, 2, 3, 4, 4, 5);

        List<Integer> newList = List.of(2, 5, 8, 9, 0, 10);

//        add element in another list by method referencing
        newList.forEach(integers::add);
//        add element in another list by lambda expression.
        newList.forEach(num -> integers.add(num));


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        Map<String, Integer> collect1 = fruits.stream().collect(Collectors.toMap(Function.identity(), s -> s.length()));
        //CONVERT A LIST INTO HASHMAP  by method ref
        Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));

    }
}
