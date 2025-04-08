
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class ThreadServer extends Thread {
    private Socket clientSocket;
    private Dati dati;

    public ThreadServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.dati = dati;
    }

    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(this.clientSocket.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            OutputStreamWriter osw = null;
            osw = new OutputStreamWriter(this.clientSocket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter out = new PrintWriter(bw, true);
            out.print("Hello (END to close connection):");
            out.print("comune, provincia, denominazioneStruttura, categoria, classificazione, idStruttura, indirizzo, CAP, singlaProvincia, frazione, localita, postaElettronica,FAX, indirizzoInternet, camere, suite, letti, bagni, primaColazione, inAbitato,  sulLago,  vicinoEliporto,  vicinoAereporto, zonaCentrale,  vicinoImpiantoRisalita,  zonaPeriferica, zonaStazioneFS,  attrezzature,  carteDiPagamentoAccettate, lingue,  attrezzatureSportive,  attrezzatureCongressi, longitudine,  latitudine ");
            out.flush();

            while (true) {
                String str = null;

                try {
                    str = in.readLine();

                } catch (IOException var8) {
                    throw new RuntimeException(var8);
                }
                if (str.equals("END")) {
                    System.out.println("EchoServer: closing...");
                    this.clientSocket.close();
                    out.close();
                    in.close();
                    return;
                }

                System.out.println("Echoing: " + str.toUpperCase());
                out.println(str.toUpperCase());
            }
        } catch (IOException var9) {
            throw new RuntimeException(var9);
        }
    }
}
