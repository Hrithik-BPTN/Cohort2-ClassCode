package week3.wednesday.synchrionization;

class SampleCode {

    void printTestsample() {

        // Lock the object
        synchronized (this) {
            System.out.println("Inside of the synchronized block.");
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1);
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }

    }
}

class Thread1 extends Thread
{
    SampleCode obj;

    // Create a constructor to initialize the above instance variable

    public Thread1(SampleCode obj){
        this.obj = obj;
    }

    // Override the run() method here to call printTestSample()
    @Override
    public void run(){
        obj.printTestsample();
    }

}


class Thread2 extends Thread
{
    SampleCode obj;

    // Create a constructor to initialize the above instance variable
    public Thread2(SampleCode obj){
        this.obj = obj;
    }

    // Override the run() method here to call printTestSample()

    @Override
    public void run(){
        obj.printTestsample();
    }
}


public class Main
{
    public static void main(String[] args)
    {
        // use same object in both thread
        SampleCode ob = new SampleCode();
        Thread1 t1=new Thread1(ob);
        Thread2 t2=new Thread2(ob);
        //start the threads t1 and t2
        System.out.println("Start thread1"); // First thing printing
        t1.start();
        System.out.println("Start thread2"); // Unsure when printed, but mostly 2nd thing
        t2.start();
    }  }
