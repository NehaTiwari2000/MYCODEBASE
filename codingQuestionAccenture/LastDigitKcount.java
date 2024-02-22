package codingQuestionAccenture;
//Find the number of integers in range [A, B] with last digit C.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastDigitKcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2=scanner.nextInt();
        int lastDigitShouldBe=scanner.nextInt();
        System.out.println("User Range from : "+num1 +" to "+num2+" with last digit as "+lastDigitShouldBe);
        List<Integer> applicableNumbers=new ArrayList<>();
        for (int i = num1; i <=num2 ; i++) {
            if(i%10==lastDigitShouldBe){
                applicableNumbers.add(i);
            }
        }
        System.out.println(applicableNumbers);
        System.out.println(applicableNumbers.size());
    }
}
