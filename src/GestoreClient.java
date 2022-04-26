
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestoreClient {

    public static void main(String[] args) {
        try {
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            
            String messaggioLetto = cli.leggi();
            System.out.println(messaggioLetto);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
