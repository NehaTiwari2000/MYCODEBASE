public class SelectionSort {
    public static void main(String[] args) {
        int[] num= {-4,0,7,4,9,-5,-1,0,-7,-1};
        printArray(sortArr(num,0, num.length-1));
    }
    public static int[] sortArr(int[] arr,int low,int high){
        for (int i = 0; i <= arr.length-2 ; i++) {
//            assume the min is at i index for initially .
            int min=i;

            for (int j = i; j <= arr.length-1 ; j++) {
//                find the min
                if(arr[j]<arr[min]){min=j;}
            }

//            after the loop is completed swap the min. element with the i index
            swapElement(arr,i,min);
        }
        return arr;
    }

    public static void swapElement(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "  , ");
        }
    }
}
