package NPC.NPC_CIVILI;

public class NPC_CIVILI {
    //----------|Attributi e costruttore|-----------
    private String nome;
    private int punti_vita;
    private boolean occupazione;
    private int denaro;
    private int relazione;
    private boolean vivo = true;

    public NPC_CIVILI(String nome, int punti_vita, boolean occupazione, int denaro, int relazione) {
        this.nome = nome;
        this.punti_vita = punti_vita;
        this.occupazione = occupazione;
        this.denaro = denaro;
        this.relazione = relazione;
    }
    //----------|Metodi|-----------

    // presentati: Questo metodo viene utilizzata per presentare NPC al giocatore
    public void presentati (){
        System.out.println("Salve viandante, mi chiamo "+nome+" invece tu come ti chiami?");
    }

    // Risposta_buona: Questo metodo viene utilizzato per rispondere a una risposta buona al giocatore nel presentarsi
    public void Risposta_buona(String nome_giocatore){
        System.out.println("Piacere mio "+nome_giocatore);
        relazione = relazione + 2;
    }
    // Risposta_fredda: Questo metodo viene utilizzato per rispondere a una risposta fredda del giocatore nel presentarsi
    public void Risposta_fredda(){
        System.out.println("Mh...");
    }
    // Risposta_cattiva: Questo metodo viene utilizzato per rispondere au na risposta fredda del giocatore nel presentarsi
    public void Risposta_cattiva(){
        System.out.println("Che maleducato!");
        relazione = relazione - 2;
    }

    public void commercio (){

    }
}
