public class QuickSortAlgo2 {
    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "  , ");
        }
    }

    public static int[] quickSortFunction2(int[] arr, int low, int high) {

        if (low < high) {
            int pIndex = findPivot(arr, low, high);
            quickSortFunction2(arr, low, pIndex - 1);
            quickSortFunction2(arr, pIndex + 1, high);
        }

        return arr;
    }

    private static int findPivot(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = low;


        while (i < j) {
            while (arr[i] <= arr[pivot] && i <=high - 1) {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low+1 ) {
                j--;
            }
            if (i < j) {
                swapElement2(arr, i, j);
            }
        }
        swapElement2(arr, pivot, j);
        return j;
    }

    private static void swapElement2(int[] arr, int pivot, int j) {
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
    }

    public static void main(String[] args) {
        System.out.println("dfghjkl");
        int[] num= {-4,0,7,4,9,-5,-1,0,-7,-1};
        printArray(quickSortFunction2(num,0, num.length-1));
    }
}


