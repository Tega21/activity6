// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server class handles the server-side operations for a socket-based communication.
 * It waits for client connections, receives messages, and sends responses.
 */
public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    /**
     * Starts the server on a specified port and handles client connections.
     *
     * @param port The port number on which the server will listen for connections.
     * @throws IOException If an I/O error occurs when opening the socket.
     */
    public void start(int port) throws IOException{

        // Wait for client connection
        System.out.println("Waiting for Client connection.....");
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        // If you get here then Client is connected to this Server
        System.out.println("Received a Client connection on port " + clientSocket.getLocalPort());
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

       
        String inputLine;
        while ((inputLine = in.readLine()) != null) {        	
            System.out.println("Got a message of: " + inputLine);
            if(".".equals(inputLine)){
                out.println("QUIT");
                System.out.println("Got message to shut the Server down");
                break;
            } else {
                out.println("OK");
            }
        }


        System.out.println("Server is shut down");

    }

    /**
     * Closes the server and client sockets, as well as the I/O streams.
     *
     * @throws IOException If an I/O error occurs when closing the sockets or streams.
     */
    public void cleanup() throws IOException{
        // Close all input and output network buffers and sockets
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    /**
    * The main method for the Server application.
    * Starts the server, waits for a client connection, processes messages, and then shuts down.
    *
    * @param args
    * @throws IOException If an I/O error occurs in the server's start or cleanup methods.
    */
    public static void main(String[] args) throws IOException{

        Server server = new Server();
        server.start(6666);
        server.cleanup();

    }
}
