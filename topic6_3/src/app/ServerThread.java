// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

import java.io.IOException;

/**
 * ServerThread class extends Thread and is responsible for running the server.
 * It encapsulates server operations in a separate thread.
 */
public class ServerThread extends Thread {

	/**
     * The run method is overridden from the Thread class.
     * It starts the server on a specified port and handles the cleanup after the server is shut down.
     */
    @Override
    public void run() {
        Server server = new Server();
        try {
        	
        	server.start(6666);
        	server.cleanup();
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
    }
}
