// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

/**
 * ServerApp class is the main entry point for running the server application.
 * It starts the server in a separate thread and monitors its activity.
 */
public class ServerApp {
    
	 /**
     * The main method of the ServerApp.
     * It creates and starts a ServerThread instance and then periodically checks if the server is still running.
     *
     * @param args 
     */
    public static void main(String[] args) {
        ServerThread serverThread = new ServerThread();
        serverThread.start();

        while (serverThread.isAlive()) {
            System.out.print(".");
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
