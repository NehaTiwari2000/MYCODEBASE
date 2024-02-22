import java.util.Arrays;

public class MissingFromTheArray {

    public static int findMissingNumber(int[] arr) {
        int missingNumber=-1;
        arr= Arrays.stream(arr).sorted().toArray();

        for (int i = 0; i <=arr.length-1 ; i++) {
            if(arr[i]!=i){missingNumber=i;}
        }
        return missingNumber;
    }

    public static void main(String[] args) {
        Integer missingNo=findMissingNumber(new int[]{3, 0, 1});
        System.out.println(missingNo==-1?"Nothing is missing": "Missing no is "+missingNo);
    }
}
