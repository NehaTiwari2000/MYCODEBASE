package stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Java8_1 {
    public static void main(String[] args) {
//        List<Integer> numberList= List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);    old way of creating a list of int
        List<Integer> integerList = IntStream.range(0, 100).boxed().collect(Collectors.toList());
//        List<Integer> integerList1 = IntStream.rangeClosed(0, 100).mapToObj(i -> i).collect(Collectors.toList());   this is another way of creating list of int
//        ArrayList<Object> collect = IntStream.rangeClosed(0, 100).collect(ArrayList::new, List::add, List::addAll);


//        Separate odd and even numbers in a list of integers
        List<Integer> evenNoList = integerList.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNoList = integerList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println(evenNoList);
        System.out.println(oddNoList);

        Map<Boolean, List<Integer>> partitionedNumbers = integerList.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("----------------------------------------------------");
        // Get even and odd lists from the map
        List<Integer> evenNumbers = partitionedNumbers.get(true);
        List<Integer> oddNumbers = partitionedNumbers.get(false);

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

        Map<Boolean, List<Integer>> partitionedNumbers2 = integerList.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0));
        System.out.println("----------------------------------------------------");
        // Get even and odd lists from the map
        List<Integer> evenNumbers2 = partitionedNumbers2.get(true);
        List<Integer> oddNumbers2 = partitionedNumbers2.get(false);

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

        List<Integer> integerList1 = evenNumbers2.stream().filter(e -> e.equals(10)).collect(Collectors.toList());



        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        // Adding mappings to above HashMap
        // using put() method

        hm.put("GeeksforGeeks", 54);
        hm.put("A computer portal", 80);
        hm.put("For geeks", 82);

        System.out.println(hm);

        Iterator<Map.Entry<String, Integer>> iterator = hm.entrySet().iterator();

        iterator.forEachRemaining(e->System.out.println(e.getKey()+"--->"+e.getValue()));
        System.out.println("--------------------------------------------");



    }
}
