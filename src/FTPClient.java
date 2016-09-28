import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Michael Kolarik on 9/28/16.
 */

public class FTPClient {

    private Socket clientSocket;
    private BufferedReader bufferedReader;

    public FTPClient() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    private void connect(String server, int port) {
        try {
            clientSocket = new Socket(server, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void retr(String filename) {

    }

    private void menu() {
        while(true) {
            System.out.println("Please choose a command:\n");
            System.out.println("CONNECT <server name/IP address> <server port>");
            System.out.println("LIST");
            System.out.println("RETR <filename>");
            System.out.println("STOR <filename>");
            System.out.println("QUIT\n");

            String[] selection = {"INVALID"};

            try {
                //Split command into parts based on space in order to parse server name, port, and filenames
                selection = bufferedReader.readLine().split("\\s");
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch(selection[0]) {
                case "CONNECT": //connect()
                    //Pass in other parameters
                    connect(selection[1], Integer.parseInt(selection[2]));
                    break;
                case "LIST": //list()
                    break;
                case "RETR": //retr();
                    retr(selection[1]);
                    break;
                case "STOR": //stor();
                    break;
                case "QUIT": //quit();
                    break;
                default: //invalid selection
                    break;
            }
        }
    }

    public static void main(String args[]){
        FTPClient client = new FTPClient();
    }
}

