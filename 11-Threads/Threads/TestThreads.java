public class TestThreads {
    public static void main(String[] args) {

        //********************************* Implements Runnable interface   *********************************
        /*MyThreadTwo typeTwo = new MyThreadTwo("1");
        Thread tInOne = new Thread(typeTwo);
        MyThreadTwo typeTwoClone = new MyThreadTwo("2");
        Thread tInTwo = new Thread(typeTwoClone);
        tInOne.start();
        tInTwo.start();*/

        //*********************************  Extends Thread implementation *********************************
        MyThreadOne typeOne = new MyThreadOne("1");
        MyThreadOne typeOneClone = new MyThreadOne("2");
        typeOne.start();
        typeOneClone.start();

        try {
            MyThreadOne.sleep(10000); //Trava por 10 segundos antes de finalizar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
