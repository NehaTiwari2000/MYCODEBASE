package codingQuestionAccenture;

import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("User Input : "+num1 +" and "+num2);

        int powerAns = (int) Math.pow(num1, num2);
        System.out.println(powerAns);
        System.out.println(powerAns%10);
    }
}
