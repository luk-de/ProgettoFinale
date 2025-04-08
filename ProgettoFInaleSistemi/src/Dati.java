import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dati {

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


    public Dati(String comune, String provincia, String denominazioneStruttura,
                String categoria, String classificazione, String idStruttura,
                String indirizzo, String CAP, String singlaProvincia, String frazione,
                String localita, String postaElettronica, String FAX, String indirizzoInternet,
                String camere, String suite, String letti, String bagni, String primaColazione,
                String inAbitato, String sulLago, String vicinoEliporto, String vicinoAereporto,
                String zonaCentrale, String vicinoImpiantoRisalita, String zonaPeriferica,
                String zonaStazioneFS, String attrezzature, String carteDiPagamentoAccettate,
                String lingue, String attrezzatureSportive, String attrezzatureCongressi,
                String longitudine, String latitudine) {
        Comune = comune;
        Provincia = provincia;
        DenominazioneStruttura = denominazioneStruttura;
        Categoria = categoria;
        Classificazione = classificazione;
        IdStruttura = idStruttura;
        Indirizzo = indirizzo;
        this.CAP = CAP;
        SinglaProvincia = singlaProvincia;
        Frazione = frazione;
        Localita = localita;
        PostaElettronica = postaElettronica;
        this.FAX = FAX;
        IndirizzoInternet = indirizzoInternet;
        Camere = camere;
        Suite = suite;
        Letti = letti;
        Bagni = bagni;
        PrimaColazione = primaColazione;
        InAbitato = inAbitato;
        SulLago = sulLago;
        VicinoEliporto = vicinoEliporto;
        VicinoAereporto = vicinoAereporto;
        ZonaCentrale = zonaCentrale;
        VicinoImpiantoRisalita = vicinoImpiantoRisalita;
        ZonaPeriferica = zonaPeriferica;
        ZonaStazioneFS = zonaStazioneFS;
        Attrezzature = attrezzature;
        CarteDiPagamentoAccettate = carteDiPagamentoAccettate;
        Lingue = lingue;
        AttrezzatureSportive = attrezzatureSportive;
        AttrezzatureCongressi = attrezzatureCongressi;
        Longitudine = longitudine;
        Latitudine = latitudine;
    }

    public static void readFile() {
        String csvFile = "C:\\Users\\lukas.delvai\\IdeaProjects\\ProgettoFInaleSistemi\\src\\Regione-Lombardia---Mappa-delle-strutture-ricettive.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Usa la virgola come separatore
                String[] data = line.split(csvSplitBy);
                // Stampa i dati letti
                for (String element : data) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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




