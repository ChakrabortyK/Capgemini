public class CharFreq {
    public static void main(String[] args) {
        String s = "assadddd";
        freqArr(s);


    }


    public static void freqArr(String s){
        int arr[] = new int[26];
        int count =0;
        for(char c : s.toCharArray()){
            int pos = c-'a';
            arr[pos]++;
            if (arr[pos]==2) {
                count ++;
                // arr[pos] = 0; //kkkk is 2 double chars 
            }
        }

        System.out.println("Count of double characters: "+ count);
    }
    public static void hashTable(){

    }
}
