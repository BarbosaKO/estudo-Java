public class MyThreadTwo implements Runnable{

    String name;

    public MyThreadTwo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for(int i = 0; i<=100; i++)
            System.out.println( "Thread: "+getName() );
    }

}