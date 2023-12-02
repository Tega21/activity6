// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * TestMyThreads is the main class for testing the MyThread1 and MyThread2 classes.
 */
public class TestMyThreads {

	 /**
     * The main method is the entry point of the application.
     * It creates and starts instances of MyThread1 and MyThread2
     * 
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();

        Runnable runnable = new MyThread2();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
