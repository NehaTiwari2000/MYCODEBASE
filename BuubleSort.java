public class BuubleSort {
    public static void main(String[] args) {
//        -4,0,7,4,9,-5,-1,0,-7,-1
        int[] num = {1, 2, 3, 4};
        printArray(sortArrByBuubleSort(num));
    }

    public static int[] sortArrByBuubleSort(int[] arr) {
        boolean flag = false;
        for (int i = arr.length - 1; i >= 1; i--) {

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElement(arr, j, j + 1);
                    flag=true;
                }
            }

            if (flag == false) {
                System.out.println("array is sorted");
                break;
            }
        }


        return arr;
    }

    public static void swapElement(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "  , ");
        }
    }
}
