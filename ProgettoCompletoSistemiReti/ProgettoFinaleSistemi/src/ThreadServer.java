import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ThreadServer extends Thread{
    private Socket clientSocket;
    private ArrayList<StruttureRicettive> data = new ArrayList<>();
    private ArrayList<StruttureRicettive> strutture = new ArrayList<>();
    private ArrayList<StruttureRicettive> results = new ArrayList<>();
    private String searchCampo;
    private String searchTipo;
    private StruttureRicettive struttureRicettive;

    public ThreadServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.struttureRicettive=new StruttureRicettive();
        this.data = StruttureRicettive.loadData("Regione-Lombardia---Mappa-delle-strutture-ricettive.csv");
    }

        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader in = new BufferedReader(isr);
                OutputStreamWriter osw = new OutputStreamWriter(clientSocket.getOutputStream());
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter out = new PrintWriter(bw, true);

                out.println("Hello (END to close connection):");
                out.println("Ricerche possibili che puoi fare:");
                out.println("comune;provincia;denominazioneStruttura;categoria;classificazione;idStruttura;Indirizzo;cap;siglaProvincia;frazione;localita;postaElettronica;indirizzoInternet;suite;letti;bagni;primaColazione;inAbitato;sulLago;vicinoEliporto;vicinoAereoporto;zonaCentrale;vicinoImpiantoRisalita;zonaPeriferica;zonaStazioneFS\n");
                out.flush();

                out.println("\nInserisci il campo di cui vuoi fare la ricerca:");
                out.flush();
                searchCampo = in.readLine();

                out.println("Inserisci il tipo di cui vuoi fare la ricerca:");
                out.flush();
                searchTipo = in.readLine();

                search(out);

                while (true) {
                    String stringa = in.readLine();
                    if (stringa.equalsIgnoreCase("STOP") || stringa.equalsIgnoreCase("END")) {
                        System.out.println("ThreadServer closing...");
                        clientSocket.close();
                        out.close();
                        in.close();
                        break;
                    }

                    System.out.println("Echoing: " + stringa.toUpperCase());
                    out.println(stringa.toUpperCase());

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    private void search(PrintWriter out) {
        results.clear();
        for (StruttureRicettive struttura : data) {
            switch (searchCampo) {
                case "comune":
                    if (struttura.getComune().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "provincia":
                    if (struttura.getProvincia().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "denominazioneStruttura":
                    if (struttura.getDenominazioneStruttura().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "categoria":
                    if (struttura.getCategoria().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "classificazione":
                    if (struttura.getClassificazione().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "idStruttura":
                    if (struttura.getIdStruttura().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "indirizzo":
                    if (struttura.getIndirizzo().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "cap":
                    if (struttura.getCAP().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "siglaProvincia":
                    if (struttura.getSinglaProvincia().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "frazione":
                    if (struttura.getFrazione().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "localita":
                    if (struttura.getLocalita().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "postaElettronica":
                    if (struttura.getPostaElettronica().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "indirizzoInternet":
                    if (struttura.getIndirizzoInternet().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "suite":
                    if (struttura.getSuite().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "letti":
                    if (struttura.getLetti().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "bagni":
                    if (struttura.getBagni().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "inAbitato":
                    if (struttura.getInAbitato().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "sulLago":
                    if (struttura.getSulLago().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "vicinoEliporto":
                    if (struttura.getVicinoEliporto().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "vicinoAereporto":
                    if (struttura.getVicinoAereporto().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "zonaCentrale":
                    if (struttura.getZonaCentrale().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "vicinoImpiantoRisalita":
                    if (struttura.getVicinoImpiantoRisalita().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "zonaPeriferica":
                    if (struttura.getZonaPeriferica().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                case "zonaStazioneFS":
                    if (struttura.getZonaStazioneFS().equalsIgnoreCase(searchTipo)) {
                        results.add(struttura);
                    }
                    break;
                    default:
                out.println("Campo di ricerca non valido.");
                return;
            }

        }
            if (results.isEmpty()) {
                out.println("Nessun risultato trovato.");
            } else {
                for (StruttureRicettive result : results) {
                    out.println(result.toString());
                }
            }
    }




    }








