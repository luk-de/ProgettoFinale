import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Main{
    public static final int PORT = 1050;

    public static void main(String[] args) {

        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(1050);
                try {
                    System.out.println("EchoServer: started ");
                    System.out.println("Server Socket: " + serverSocket);
                    Socket clientSocket = null;
                    try {
                        clientSocket = serverSocket.accept();
                        System.out.println("Connection accepted: " +clientSocket);
                        ThreadServer threadServer = new ThreadServer(clientSocket);
                        threadServer.start();

                    } catch (IOException e) {
                        System.err.println("Accept failed");
                        System.exit(1);
                    }
                } catch (Throwable e) {
                    throw e;
                }

                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    