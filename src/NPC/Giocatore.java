package NPC;

import NPC.NPC_OSTILI.NPC_OSTILI;
import Oggetti.Armi.Arma;

public class Giocatore {
    private String nome_giocatore; // nome del giocatore
    private int punti_salute; //i suou punti ferita
    private Arma Arma_giocatore; // Attributo di tipo arma
    private int denaro; // il denaro che ha
    private int mana; // il mana che possiede
    private int reputazione = 0; // la sua reputazione che di default è 0
    private boolean vivo = true;

    public Giocatore(String nome_giocatore, int punti_salute,int denaro, int mana, int reputazione) {
        this.nome_giocatore = nome_giocatore;
        this.punti_salute = punti_salute;
        this.Arma_giocatore = new Arma("Lama del Viandante",5,false,100);
        // Arma_default, viene creata con questi valori
        this.denaro = denaro;
        this.mana = mana;
        this.reputazione = reputazione;
    }
// ---------------|getter e setter|----------

    public String getNome_giocatore() {
        return nome_giocatore;
    }

    public void setNome_giocatore(String nome_giocatore) {
        this.nome_giocatore = nome_giocatore;
    }

    public int getPunti_salute() {
        return punti_salute;
    }

    public void setPunti_salute(int punti_salute) {
        this.punti_salute = punti_salute;
    }

    public Arma getArma_giocatore() {
        return Arma_giocatore;
    }

    public void setArma_giocatore(Arma arma_giocatore) {
        Arma_giocatore = arma_giocatore;
    }

    public int getDenaro() {
        return denaro;
    }

    public void setDenaro(int denaro) {
        this.denaro = denaro;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getReputazione() {
        return reputazione;
    }

    public void setReputazione(int reputazione) {
        this.reputazione = reputazione;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    // ---------------|Metodi|------------------

// - Il metodo di attacco del giocatore
    public void attacco(NPC_OSTILI Nemico) throws InterruptedException {
    System.out.println("Hai inflitto a "+Nemico.getNome()+" un danno di "+ Arma_giocatore.getDanno_arma());
        Thread.sleep(5000);
        Nemico.subisciDanno(Arma_giocatore.getDanno_arma());
        Arma_giocatore.setIntegrita(Arma_giocatore.getIntegrita()-1);
    }
// - Guadagno e perdita di vita
    public void perditaVita(int danno_subito){
        System.out.println("Hai subito dei danni");
        setPunti_salute(getPunti_salute()-danno_subito);
    }
    public void cura_mangiare (int vita_recuperata){
        System.out.println("Ti senti un po' meglio...");
        setPunti_salute(getPunti_salute()+vita_recuperata);
    }

// - Guadagno e perdita di soldi
    public void spesa (int cifra){
        setDenaro(getDenaro()-cifra);
    }
    public void guadagno (int cifra){
        setDenaro(getDenaro()+cifra);
    }
// - Guadagno e spesa mana
    public void GuadagnoMana (int manaplus){
        setMana(getMana()+manaplus);
    }
    public void spesaMana (int mananoplus){
        setMana(getMana()-mananoplus);
    }
// - Guadagno e perdita reputazione
    public void perditaReputazione (int repu){
        System.out.println("Questa cosa non dovevi farla...");
        setReputazione(getReputazione()-repu);
    }
    public void guadagnoReputazione (int repu){
        System.out.println("Hai fatto una bell'azione");
        setReputazione(getReputazione()+repu);
    }
    public void cambiaArma (Arma nuova_arma){
        setArma_giocatore(nuova_arma);
        System.out.println("Nuova arma equipaggiata: "+Arma_giocatore.getNome_arma());
    }

    public void controlloVivo(){
        if (getPunti_salute()<= 0){
            setVivo(false);
        }
    }
//------------------|Ispezione Admin|------------------

    public void armaAttuale (){
        System.out.println("Arma attuale: ");
        System.out.println("Nome: "+Arma_giocatore.getNome_arma());
        System.out.println("Danno: "+Arma_giocatore.getDanno_arma());
        System.out.println("Condizioni: "+Arma_giocatore.getIntegrita());
    }

    public int condizioneArma (){
        return Arma_giocatore.getIntegrita();
    }

    public void dannoCondizioneZero (){
        Arma_giocatore.setDanno_arma(1);
    }


}
