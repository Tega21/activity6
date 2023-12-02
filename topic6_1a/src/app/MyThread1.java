// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet
package app;

/**
 * Custom thread that extends the Thread class. 
 */
public class MyThread1 extends Thread{

	/**
     * The run method is overridden from the Thread class.
     * It contains the code that is executed when the thread starts.
     */
    @Override
    public void run(){
        System.out.println("MyThread1 is running");
    }

}
