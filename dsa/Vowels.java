
import java.util.HashMap;
import java.util.Set;

class Vowels {
    public String reverseVowels(String s) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        // String vowels = "AEIUOaeiou";
        HashMap<Integer,Character> map = new HashMap<>();

        char [] arr = s.toCharArray();
        char [] result = new char[arr.length];


        int left =0, right = arr.length-1;

        while(left <right){
                // if(vowelSet.contains(arr[left]) && vowelSet.contains(arr[right])){
                if(!vowelSet.contains(arr[left])){
                    left++;
                }else if(!vowelSet.contains(arr[right])){
                    right--;
                }else{
                    char t = arr[left]; 
                    arr[left++] = arr[right];
                    arr[right--] = t;
                    
                }
            }


        return new String(result);
        
    }
}