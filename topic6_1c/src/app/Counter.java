// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * Counter class provides a thread-safe way to increment and retrieve a static count value.
 * It utilizes synchronized methods to ensure safe access to the count variable across multiple threads.
 */
public class Counter {
	
	static int count = 0;
	
	 /**
     * Increments the static count variable in a thread-safe manner.
     * This method is synchronized to prevent concurrent access issues.
     */
	static synchronized void increment() { 		 
		count = count + 1;
	}
	
	/**
     * Retrieves the current value of the static count variable.
     * 
     * @return The current value of count.
     */
	static int getCount() {
		return count;
	}

}
