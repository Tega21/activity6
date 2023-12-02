// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * MyThread2 is a class that implements the Runnable interface.
 * 
 */
public class MyThread2  implements Runnable{
	
	/**
     * The run method is overridden from the Runnable interface.
     * It executes a loop 100 times, printing a custom message in each iteration.
     */
    @Override
    public void run() {
    	for(int i = 0; i < 100; i++) {
        System.out.println("CST 239 in iteration " + i);
    	}
    }
}
