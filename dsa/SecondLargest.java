public class SecondLargest {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,6,8,3};
        int h = Integer.MIN_VALUE ,sh = Integer.MIN_VALUE;

        for (int idx = 0; idx < arr.length; idx++) {
             if (arr[idx]> h) {
                sh = h;
                h= arr[idx];                
             }
            
        }

        System.out.println(" Highest: "+ h);
        System.out.println("Second Highest: "+ sh);
    }
}
