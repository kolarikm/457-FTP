/**
 * Created by Michael Kolarik on 9/28/16.
 */

import java.io.InputStream;
import java.net.*;

public class FTPServer {
    private ServerSocket serverSocket;
    //Michael K.'s ending g-number for ths project.
    private int port = 5012;

    public FTPServer(){
        super();
    }

    private void startServer() {
        while (true) {
            try {
                serverSocket = new ServerSocket(this.port);
                Socket clientSocket = serverSocket.accept();
                if(clientSocket.isBound()){
                    System.out.println("Accepted a client on: "+ this.port);
                }
            } catch (Exception e) {
                System.out.println("Something went wrong connecting Client Socket to Server \n");
            }
        }
    }

    private void getFile() {

    }

    public static void main(String args[]) {
        FTPServer server = new FTPServer();
        server.startServer();
    }


}
