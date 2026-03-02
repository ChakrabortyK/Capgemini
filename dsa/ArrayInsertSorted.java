public class ArrayInsertSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,10,54,88};
        insertSorted(55,arr);

    }

    public static void insertSorted(int n, int[] arr){
        int result[] = new int[arr.length+1];
        int incr = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]>n){
                incr++;
                result[idx] = n;
            }

            result[idx+incr] = arr[idx];
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
