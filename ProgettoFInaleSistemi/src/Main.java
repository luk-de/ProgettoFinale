
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static final int PORT = 1050;

    public static void main(String[] args) {
        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(1050);


                try {
                    System.out.println("EchoServer: started ");
                    System.out.println("Server Socket: " + String.valueOf(serverSocket));
                    Socket clientSocket = null;


                    try {
                        clientSocket = serverSocket.accept();
                        System.out.println("Connection accepted: " + String.valueOf(clientSocket));
                        ThreadServer threadServer = new ThreadServer(clientSocket);
                        threadServer.start();

                    } catch (IOException var5) {
                        System.err.println("Accept failed");
                        System.exit(1);
                    }
                } catch (Throwable var6) {
                    try {
                        serverSocket.close();
                    } catch (Throwable var4) {
                        var6.addSuppressed(var4);
                    }


                    throw var6;
                }

                serverSocket.close();
            } catch (IOException var7) {
                throw new RuntimeException(var7);
            }
        }
    }
}
