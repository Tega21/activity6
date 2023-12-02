// Brandon Ortega// CST 239// 12.03.2023// Code used from activity work sheet

package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Client class handles the client-side operations for a socket-based communication.
 * It connects to a server, sends messages, and receives responses.
 */
public class Client {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    /**
     * Connects to a server at the specified IP address and port.
     *
     * @param ip   The IP address of the server.
     * @param port The port number of the server.
     * @throws UnknownHostException If the IP address of the host could not be determined.
     * @throws IOException          If an I/O error occurs when creating the socket.
     */
    public void start(String ip, int port) throws UnknownHostException, IOException{
        clientSocket = new Socket(ip, port);

        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    /**
     * Sends a message to the server and waits for a response.
     *
     * @param msg The message to be sent to the server.
     * @return The response from the server.
     * @throws IOException If an I/O error occurs when sending the message.
     */
    public String sendMessage(String msg) throws IOException{
        out.println(msg);
        return in.readLine();
    }

    /**
     * Closes the I/O streams and the socket, cleaning up the resources.
     *
     * @throws IOException If an I/O error occurs when closing the streams or socket.
     */
    public void cleanup() throws IOException{
        in.close();
        out.close();
        clientSocket.close();
    }
    
    /**
     * The main method for the Client application.
     * Connects to the server, sends a series of messages, and then shuts down.
     *
     * @param args 
     * @throws IOException If an I/O error occurs in the client's start, sendMessage, or cleanup methods.
     */
    public static void main(String[] args) throws IOException{

       Client client = new Client();
       client.start("127.0.0.1", 6666);

       // Send 10 messages to Server
       String response;
       for (int count = 0; count <= 8; count++) {
           String message = "Hello from Client" + count;
           response = client.sendMessage(message);
           System.out.println("Server response was " + response);
       }

       // Send shutdown command
       response = client.sendMessage(".");
       System.out.println("Server response was " + response);

       // Cleanup after all communication is done
       client.cleanup();
        }

    }

