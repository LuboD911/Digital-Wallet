package Server;

import Client.ClientHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer(){

        try{

            while(!serverSocket.isClosed()){

                Socket socket = serverSocket.accept();
                System.out.println("A new client is connected");
                ClientHandler clientHandler = new ClientHandler(socket);


                Thread thread = new Thread(clientHandler);
                thread.start();

            }


        }catch (Exception e){
            System.out.println("Error occurred: " + e);
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
        serverSocket.close();
    }

}
