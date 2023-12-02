// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * MyThread1 is a custom thread that extends the Thread class.
 * It performs a task in a loop, printing a message in each iteration.
 */
public class MyThread1 extends Thread{


    /**
     * The run method is overridden from the Thread class.
     * It executes a loop 1000 times, and in each iteration, it prints a message
     * and then sleeps for 1000 milliseconds.
     */
    @Override
    public void run(){
    	for(int i = 0; i < 1000; i++) {
        System.out.println("MyThread1 is running iteration " + i);
        try {
        	Thread.sleep(1000);
        }
        catch (InterruptedException e){
        	e.printStackTrace();
        }
    	}

    }
}
