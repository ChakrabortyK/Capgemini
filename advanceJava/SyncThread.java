class Test implements Runnable{
    int count =0;
    
    @Override
    public void run(){
        show();
    }

    synchronized void show(){
        for (int i = 0; i < 500; i++) {
            count +=10;
        }

    }
}

public class SyncThread {
    public static void main(String[] args) {
        
        Test obj = new Test();

        Thread t1 = new Thread(obj);
        t1.start();
        Thread t2 = new Thread(obj);
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(obj.count);


    }
}
