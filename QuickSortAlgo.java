import java.util.Arrays;

public class QuickSortAlgo {
    public static int[] quickSortFunction(int[] arr,int low,int high) {
      if(low<high){
          int pIndex=findPartitionIndex(arr,low,high);
          quickSortFunction(arr,low,pIndex-1);
          quickSortFunction(arr,pIndex+1,high);
      }
        return arr;
    }

    public static int findPartitionIndex(int[] arr, int low, int high){
        int i=low;
        int j = high;
        int pivot =low;

        while (i<j){
            while (arr[i]<=arr[pivot] && i<=high){i++;}
            while (arr[j]>arr[pivot] && j>=low){j--;}
            if(i<j){swapElement(arr,i,j);}
        }

        swapElement(arr,pivot,j);

        return j;
    }

    public static void swapElement(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+"  , ");
        }
    }

    public static void main(String[] args) {
        printArray(quickSortFunction(new int[]{4,6,2,4,5,7,9,-1,3},0,8));
    }
}
