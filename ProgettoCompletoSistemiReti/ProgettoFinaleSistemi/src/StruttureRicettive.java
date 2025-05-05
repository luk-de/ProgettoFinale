import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StruttureRicettive {

    private String Comune;
    private String Provincia;
    private String DenominazioneStruttura;
    private String Categoria;
    private String Classificazione;
    private String IdStruttura;
    private String Indirizzo;
    private String CAP;
    private String SinglaProvincia;
    private String Frazione;
    private String Localita;
    private String PostaElettronica;
    private String FAX;
    private String IndirizzoInternet;
    private String Camere;
    private String Suite;
    private String Letti;
    private String Bagni;
    private String PrimaColazione;
    private String InAbitato;
    private String SulLago;
    private String VicinoEliporto;
    private String VicinoAereporto;
    private String ZonaCentrale;
    private String VicinoImpiantoRisalita;
    private String ZonaPeriferica;
    private String ZonaStazioneFS;
    private String Attrezzature;
    private String CarteDiPagamentoAccettate;
    private String Lingue;
    private String AttrezzatureSportive;
    private String AttrezzatureCongressi;
    private String Longitudine;
    private String Latitudine;

    public StruttureRicettive() {

    }


        public String getComune () {
        return Comune;
    }

        public void setComune (String comune){
        Comune = comune;
    }

        public String getProvincia () {
        return Provincia;
    }

        public void setProvincia (String provincia){
        Provincia = provincia;
    }

        public String getDenominazioneStruttura () {
        return DenominazioneStruttura;
    }

        public void setDenominazioneStruttura (String denominazioneStruttura){
        DenominazioneStruttura = denominazioneStruttura;
    }

        public String getCategoria () {
        return Categoria;
    }

        public void setCategoria (String categoria){
        Categoria = categoria;
    }

        public String getClassificazione () {
        return Classificazione;
    }

        public void setClassificazione (String classificazione){
        Classificazione = classificazione;
    }

        public String getIdStruttura () {
        return IdStruttura;
    }

        public void setIdStruttura (String idStruttura){
        IdStruttura = idStruttura;
    }

        public String getIndirizzo () {
        return Indirizzo;
    }

        public void setIndirizzo (String indirizzo){
        Indirizzo = indirizzo;
    }

        public String getCAP () {
        return CAP;
    }

        public void setCAP (String CAP){
        this.CAP = CAP;
    }

        public String getSinglaProvincia () {
        return SinglaProvincia;
    }

        public void setSinglaProvincia (String singlaProvincia){
        SinglaProvincia = singlaProvincia;
    }

        public String getFrazione () {
        return Frazione;
    }

        public void setFrazione (String frazione){
        Frazione = frazione;
    }

        public String getLocalita () {
        return Localita;
    }

        public void setLocalita (String localita){
        Localita = localita;
    }

        public String getPostaElettronica () {
        return PostaElettronica;
    }

        public void setPostaElettronica (String postaElettronica){
        PostaElettronica = postaElettronica;
    }

        public String getFAX () {
        return FAX;
    }

        public void setFAX (String FAX){
        this.FAX = FAX;
    }

        public String getIndirizzoInternet () {
        return IndirizzoInternet;
    }

        public void setIndirizzoInternet (String indirizzoInternet){
        IndirizzoInternet = indirizzoInternet;
    }

        public String getCamere () {
        return Camere;
    }

        public void setCamere (String camere){
        Camere = camere;
    }

        public String getSuite () {
        return Suite;
    }

        public void setSuite (String suite){
        Suite = suite;
    }

        public String getLetti () {
        return Letti;
    }

        public void setLetti (String letti){
        Letti = letti;
    }

        public String getBagni () {
        return Bagni;
    }

        public void setBagni (String bagni){
        Bagni = bagni;
    }

        public String getPrimaColazione () {
        return PrimaColazione;
    }

        public void setPrimaColazione (String primaColazione){
        PrimaColazione = primaColazione;
    }

        public String getInAbitato () {
        return InAbitato;
    }

        public void setInAbitato (String inAbitato){
        InAbitato = inAbitato;
    }

        public String getSulLago () {
        return SulLago;
    }

        public void setSulLago (String sulLago){
        SulLago = sulLago;
    }

        public String getVicinoEliporto () {
        return VicinoEliporto;
    }

        public void setVicinoEliporto (String vicinoEliporto){
        VicinoEliporto = vicinoEliporto;
    }

        public String getVicinoAereporto () {
        return VicinoAereporto;
    }

        public void setVicinoAereporto (String vicinoAereporto){
        VicinoAereporto = vicinoAereporto;
    }

        public String getZonaCentrale () {
        return ZonaCentrale;
    }

        public void setZonaCentrale (String zonaCentrale){
        ZonaCentrale = zonaCentrale;
    }

        public String getVicinoImpiantoRisalita () {
        return VicinoImpiantoRisalita;
    }

        public void setVicinoImpiantoRisalita (String vicinoImpiantoRisalita){
        VicinoImpiantoRisalita = vicinoImpiantoRisalita;
    }

        public String getZonaPeriferica () {
        return ZonaPeriferica;
    }

        public void setZonaPeriferica (String zonaPeriferica){
        ZonaPeriferica = zonaPeriferica;
    }

        public String getZonaStazioneFS () {
        return ZonaStazioneFS;
    }

        public void setZonaStazioneFS (String zonaStazioneFS){
        ZonaStazioneFS = zonaStazioneFS;
    }

        public String getAttrezzature () {
        return Attrezzature;
    }

        public void setAttrezzature (String attrezzature){
        Attrezzature = attrezzature;
    }

        public String getCarteDiPagamentoAccettate () {
        return CarteDiPagamentoAccettate;
    }

        public void setCarteDiPagamentoAccettate (String carteDiPagamentoAccettate){
        CarteDiPagamentoAccettate = carteDiPagamentoAccettate;
    }

        public String getLingue () {
        return Lingue;
    }

        public void setLingue (String lingue){
        Lingue = lingue;
    }

        public String getAttrezzatureSportive () {
        return AttrezzatureSportive;
    }

        public void setAttrezzatureSportive (String attrezzatureSportive){
        AttrezzatureSportive = attrezzatureSportive;
    }

        public String getAttrezzatureCongressi () {
        return AttrezzatureCongressi;
    }

        public void setAttrezzatureCongressi (String attrezzatureCongressi){
        AttrezzatureCongressi = attrezzatureCongressi;
    }

        public String getLongitudine () {
        return Longitudine;
    }

        public void setLongitudine (String longitudine){
        Longitudine = longitudine;
    }

        public String getLatitudine () {
        return Latitudine;
    }

        public void setLatitudine (String latitudine){
        Latitudine = latitudine;
    }

    public static ArrayList<StruttureRicettive> loadData(String filePath) {
        ArrayList<StruttureRicettive> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";", -1);
                StruttureRicettive struttura = new StruttureRicettive();
                struttura.setComune(values[0]);
                struttura.setProvincia(values[1]);
                struttura.setDenominazioneStruttura(values[2]);
                struttura.setCategoria(values[3]);
                struttura.setClassificazione(values[4]);
                struttura.setIdStruttura(values[5]);
                struttura.setIndirizzo(values[6]);
                struttura.setCAP(values[7]);
                struttura.setSinglaProvincia(values[8]);
                struttura.setFrazione(values[9]);
                struttura.setLocalita(values[10]);
                struttura.setPostaElettronica(values[11]);
                struttura.setFAX(values[12]);
                struttura.setIndirizzoInternet(values[13]);
                struttura.setCamere(values[14]);
                struttura.setSuite(values[15]);
                struttura.setLetti(values[16]);
                struttura.setBagni(values[17]);
                struttura.setPrimaColazione(values[18]);
                struttura.setInAbitato(values[19]);
                struttura.setSulLago(values[20]);
                struttura.setVicinoEliporto(values[21]);
                struttura.setVicinoAereporto(values[22]);
                struttura.setZonaCentrale(values[23]);;;;
                struttura.setVicinoImpiantoRisalita(values[24]);
                struttura.setZonaPeriferica(values[25]);
                struttura.setZonaStazioneFS(values[26]);
                struttura.setAttrezzature(values[27]);
                struttura.setCarteDiPagamentoAccettate(values[28]);
                struttura.setLingue(values[29]);
                struttura.setAttrezzatureSportive(values[30]);
                struttura.setAttrezzatureCongressi(values[31]);
                struttura.setLongitudine(values[32]);
                struttura.setLatitudine(values[33]);
                data.add(struttura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }



    @Override
        public String toString () {
        return "Dati{" +
                "Comune='" + Comune + '\'' +
                ", Provincia='" + Provincia + '\'' +
                ", DenominazioneStruttura='" + DenominazioneStruttura + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", Classificazione='" + Classificazione + '\'' +
                ", IdStruttura='" + IdStruttura + '\'' +
                ", Indirizzo='" + Indirizzo + '\'' +
                ", CAP='" + CAP + '\'' +
                ", SinglaProvincia='" + SinglaProvincia + '\'' +
                ", Frazione='" + Frazione + '\'' +
                ", Localita='" + Localita + '\'' +
                ", PostaElettronica='" + PostaElettronica + '\'' +
                ", FAX='" + FAX + '\'' +
                ", IndirizzoInternet='" + IndirizzoInternet + '\'' +
                ", Camere='" + Camere + '\'' +
                ", Suite='" + Suite + '\'' +
                ", Letti='" + Letti + '\'' +
                ", Bagni='" + Bagni + '\'' +
                ", PrimaColazione='" + PrimaColazione + '\'' +
                ", InAbitato='" + InAbitato + '\'' +
                ", SulLago='" + SulLago + '\'' +
                ", VicinoEliporto='" + VicinoEliporto + '\'' +
                ", VicinoAereporto='" + VicinoAereporto + '\'' +
                ", ZonaCentrale='" + ZonaCentrale + '\'' +
                ", VicinoImpiantoRisalita='" + VicinoImpiantoRisalita + '\'' +
                ", ZonaPeriferica='" + ZonaPeriferica + '\'' +
                ", ZonaStazioneFS='" + ZonaStazioneFS + '\'' +
                ", Attrezzature='" + Attrezzature + '\'' +
                ", CarteDiPagamentoAccettate='" + CarteDiPagamentoAccettate + '\'' +
                ", Lingue='" + Lingue + '\'' +
                ", AttrezzatureSportive='" + AttrezzatureSportive + '\'' +
                ", AttrezzatureCongressi='" + AttrezzatureCongressi + '\'' +
                ", Longitudine='" + Longitudine + '\'' +
                ", Latitudine='" + Latitudine + '\'' +
                '}';
    }
    }




