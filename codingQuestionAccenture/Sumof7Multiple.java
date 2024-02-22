package codingQuestionAccenture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumof7Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("User Input : "+num1 +" and "+num2);
        List<Integer> divisibleBy7= new ArrayList<>();
        for (int i = num1; i <=num2 ; i++) {
            if(i%7==0){
                divisibleBy7.add(i);
            }
        }

        Integer sumOfAll = divisibleBy7.stream().reduce(0, (n, n1) -> n + n1);

        System.out.println(divisibleBy7);
        System.out.println(sumOfAll);
    }
}
