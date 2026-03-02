

interface A{
    int show();
    static int multiply(int x,int y){
        return x*y;
    }
}

//***FIRST***

// class Test implements A{
//     public int show(){
//         return 2;
//     }
// }

//***SECOND***


public class LambdaFunc {
    public static void main(String[] args) {
        
        // A obj = new Test();
        // obj.show();

        A obj = ()->{
        System.out.println("Hello");
            return 1;
        };

        int val = obj.show();

        // BiFunction<Integer,Integer,Integer> f = (n1,n2) -> A.multiply(n1, n2);
        // System.out.println(f.apply(2, 3));
        
        // BiFunction<Integer,Integer,Integer> f2 = A::multiply;
        // System.out.println(f2.apply(2, 3));



    }
}
