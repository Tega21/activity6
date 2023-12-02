// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet
package app;

/**
 * MyThread2 is a class that implements the Runnable interface.
 * It represents a task that can be executed by a Thread.
 */
public class MyThread2  implements Runnable{
	
	/**
     * The run method is overridden from the Runnable interface.
     * It contains the code that is executed when the thread running this task starts.
     */
    @Override
    public void run() {
        System.out.println("MyThread2 is running");
    }
}
