// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

import java.util.Random;

/**
 * CounterThread is a custom thread that increments a shared counter.
 * It sleeps for a random duration before performing the increment to simulate asynchronous behavior.
 */
public class CounterThread extends Thread{
	
	/**
     * The run method is overridden from the Thread class.
     * It sleeps for a random duration and then increments the shared counter.
     */
	@Override
	public void run() {
		// Sleep this thread for random amount, increment, then exit thread
		try {
			Random rand = new Random();
			int sleeper = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
			Thread.sleep(sleeper);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Counter.increment();
	}

}
