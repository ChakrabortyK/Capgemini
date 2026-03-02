
import java.util.function.Consumer;
import java.util.function.Function;

interface StaticInterfaceMethod{
    static void show(int n){
        System.out.println(n+500);
    }
    
}

@FunctionalInterface
interface Square {
    int compute(int n);
}


public class MethRefObj implements Square{

    public int show(int n){
        return n*100;
    }

    public int compute(int n){
        return n*n;
    }

    public static void main(String[] args) {

        MethRefObj ob = new MethRefObj();

        // Function<Integer,Integer> f = n -> ;
        
        Consumer<Integer> fc = StaticInterfaceMethod::show;   //STATIC 
        fc.accept(5);

        Function<Integer,Integer> f = ob::show;         //OBJECT REFERENCE (THIS CODE)
        f.apply(5);

        Square s = n -> n * n;                          //CUSTOM FUNCTIONAL INTERFACE 
        s.compute(2);

        Square s2 = MethRefObj::compute;
        


    }
}
