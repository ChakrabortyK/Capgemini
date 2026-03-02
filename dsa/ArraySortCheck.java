public class ArraySortCheck {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for (int idx = 0; idx < arr.length-1; idx++) {
            if(arr[idx]>arr[idx+1]){
                System.out.println("Unsorted Array");
                return;
            }
        }

        System.out.println("Sorted array");
    }
}
