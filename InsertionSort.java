public class InsertionSort {
    public static void main(String[] args) {
        printArray(insertionSort(new int[]{4,6,2,4,5,7,9,-1,3}));
    }
    public static void printArray(int[] arr){
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+"  , ");
        }
    }

    public static int[] insertionSort(int[] arr){
        int j =0;

        for (int i = 0; i <=arr.length-1 ; i++) {
            j=i;
            while (j>0 && arr[j-1]>arr[j]){
//                swap the two
                swapElement(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }

    public static void swapElement(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
