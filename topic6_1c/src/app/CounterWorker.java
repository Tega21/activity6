// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * CounterWorker is the main class that demonstrates the use of CounterThread.
 * It creates multiple CounterThread instances and starts them to increment the shared counter.
 */
public class CounterWorker {

	/**
     * The main method executes the application.
     * It creates and starts a specified number of CounterThread instances and then waits for all to finish.
     * 
     * @param args Command line arguments (not used in this application).
     * @throws InterruptedException If any thread has interrupted the current thread.
     */
    public static void main(String[] args) throws InterruptedException{
        // Print start MSG
        System.out.println("This is the initial value of the Counter: " + Counter.getCount());

        // Number of counters to create
        int numberCounters = 1000;

        // Create 1000 Counters that can each run in their own thread
        CounterThread[] counters = new CounterThread[numberCounters];
        for (int i = 0; i < 1000; i++){
            counters[i] = new CounterThread();
        }

        // Start all 1000 Counter threads
        for (int i = 0; i<1000; i++){
            counters[i].start();
        }

        // Wait for 100 Counter threads to finish
        for (int i=0; i<1000; i++){
            counters[i].join();
        }

        System.out.println("This is the end value of the Counter: " + Counter.getCount());

    }

}
