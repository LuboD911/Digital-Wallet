package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket clientSocket) throws IOException {
        this.client = clientSocket;
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);
    }


    @Override
    public void run() {

        try {
            while (true) {
                String message = in.readLine();
                System.out.println(message);
                if (message.equalsIgnoreCase("stop")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("IO exception in client handler");
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
