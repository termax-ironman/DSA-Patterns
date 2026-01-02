public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {23,1,35,21,4,67};
        int low = 0;
        int mid = arr.length/2;
        int high = arr.length-1;
        mergeArray(arr,low,mid);
        mergeArray(arr,mid+1,high);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    private static void mergeArray(int[] arr, int i, int high) {
        if(i >= high) {
            return;
        }
        int mid = (i+high)/2;
        mergeArray(arr,i,mid);
        mergeArray(arr,mid+1,high);
        mergeThis(arr,i,mid+1,high);
    }

    private static void mergeThis(int[] arr, int i, int mid, int high) {

    }
}
