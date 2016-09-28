import java.io.IOException;
import java.net.Socket;

/**
 * Created by Michael Kolarik on 9/28/16.
 */

public class FTPClient {

    public Socket clientSocket;

    public FTPClient() {
        try {
            clientSocket = new Socket("http://localhost", 5012);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Please choose a command:\n\n");
            System.out.println("CONNECT <server name/IP address> <server port>\n");
            System.out.println("LIST\n");
            System.out.println("RETR <filename>\n");
            System.out.println("STOR <filename>\n");
            System.out.println("QUIT\n");
        }
    }

}
