
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    
    public Server(int porta){
        try {
            ss = new ServerSocket(porta);
            System.out.println("OK sono in ascolto...");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inAscolto(){
        try {
            so = ss.accept();
            System.out.println("Connessione stabilita...");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void scrivi(String messaggio){
        try {
            bw = new BufferedWriter(new OutputStream(so.getOutputStream()));
            bw.write(messaggio+"\n");
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}