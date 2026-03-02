import java.util.ArrayList;

public class Defected {
    public static int defected(char[] arr){
        for(int i=0;i<arr.length;i++){
            if (arr[i]== 'F') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char [] chararr = {'P','P','P','P','P','P','F'};
        System.out.println(defected(chararr));
    }
}

public static void stackSort(int[] arr){
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {

        if(!stack.isEmpty() && arr[i]>stack.peek()) list.add(stack.pop());
        
        else stack.push(arr[i]);  

    }

    while(!stack.isEmpty()){
        list.add(stack.pop());
    }

    System.out.println(list);

}
