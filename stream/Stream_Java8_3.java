package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Stream_Java8_3 {
    public static void main(String[] args) {
//        Find the frequency of each character in a string using Java 8 streams
        String string = new String("DFGHJKLRTYUIOFGHJKLERTYUIOQWERTYUIOPASDFGHJKLZXCVBNM");
//        way to split a string into character
        List<Character> characterList = string.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        System.out.println(characterList);
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put(characterList.get(0), 1);
        for (int i = 1; i <= characterList.size() - 1; i++) {
            if (characterList.contains(characterList.get(i))) {
                characterIntegerMap.put(characterList.get(i), 2);
            } else {
                characterIntegerMap.put(characterList.get(i), 1);
            }
        }
        System.out.println("output :: " + characterIntegerMap);


        System.out.println("--------------------------------------------");

        Map<Character, Long> collect = characterList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        System.out.println("--------------------------------------------");

//        Find the frequency of each element in an array or a list

        List<String> stringList= List.of("Neha","Tiwari","Sakshi","Tiwari","Sanju","TIWARI");
        Map<String, Long> stringLongMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("stringLongMap :: "+stringLongMap);


        List<String> upperCase = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("upperCase : "+upperCase);





        int[] array = {1, 4, 5, 2, 5, 1, 2, 5};

        // Count occurrences of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Custom sorting based on frequency in descending order
//        Arrays.sort(array, (a, b) -> {
//            int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
//            return freqCompare != 0 ? freqCompare : Integer.compare((Integer) b,a);
//        });
//
//        // Print the sorted array
//        System.out.println(Arrays.toString(array));


//        int[] array = {1, 4, 5, 2, 5, 1, 2, 5};
        List<Integer> integers = List.of(1,4,5,2,5,1,2,5);

        Map<Integer, Long> sorted = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(sorted);

        List<Map.Entry<Integer, Long>>  entries = sorted.entrySet().stream().sorted((a,b) -> b.getKey()-a.getKey()).collect(Collectors.toList());

        for (Map.Entry<Integer, Long> entry : entries) {
            int frequency = entry.getKey();
            long count = entry.getValue();
            for (int i = 0; i <=count-1 ; i++) {
                System.out.print(frequency +" , ");
            }
//            System.out.println("Frequency " + frequency + " occurs " + count + " times.");
        }


    }
}
