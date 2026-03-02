class Test implements Runnable{
    int count =0;
    
    @Override
    public void run(){
        show();
    }

    void show(){
        count += 50;
    }
}

public class MultiThreads {
    public static void main(String[] args) {
        
        Test obj = new Test();

        Thread t1 = new Thread(obj);
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(obj.count);


    }
}
