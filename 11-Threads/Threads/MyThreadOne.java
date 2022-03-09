public class MyThreadOne extends Thread{

    String nameOfMyThread;


    public MyThreadOne(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for(int i = 0; i<=100; i++)
            System.out.println( "Thread: "+super.getName()+"\n"+System.currentTimeMillis() );
    }
}