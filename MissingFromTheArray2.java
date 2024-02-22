import java.util.Arrays;

public class MissingFromTheArray2 {
    public static int findMissingNumber2(int[] arr) {
        int missingNumber=-1;


        return missingNumber;
    }

    public static void main(String[] args) {
        Integer missingNo=findMissingNumber2(new int[]{3, 0, 1});
        System.out.println(missingNo==-1?"Nothing is missing": "Missing no is "+missingNo);
    }
}
