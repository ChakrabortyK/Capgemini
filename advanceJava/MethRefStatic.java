import java.util.function.BiFunction;

interface A{
    static int multiply(int x,int y){
        return x*y;
    }
}


public class MethRefStatic {
    public static void main(String[] args) {
        

        //*** LAMBDA FUNCTION EQUIVALENT ***

        BiFunction<Integer,Integer,Integer> f = (n1,n2) -> A.multiply(n1, n2);
        // System.out.println(f.apply(2, 3));
        

        /* METHOD REFERENCE :: STATIC */
        BiFunction<Integer,Integer,Integer> f2 = A::multiply;
        System.out.println(f2.apply(2, 3));



    }
}


