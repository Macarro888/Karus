package NPC;

public class NPC_CIVILI {
    private String nome;
    private int punti_vita;
    private String occupazione;
    private int denaro;
    private int relazione;

    public NPC_CIVILI(String nome, int punti_vita, String occupazione, int denaro, int relazione) {
        this.nome = nome;
        this.punti_vita = punti_vita;
        this.occupazione = occupazione;
        this.denaro = denaro;
        this.relazione = relazione;
    }

    public void presentati (){
        System.out.println("Salve viandante, mi chiamo "+nome+" invece tu come ti chiami?");
    }

    public void Risposta_buona(String nome_giocatore){
        System.out.println("Piacere mio "+nome_giocatore);
        relazione = relazione + 2;
    }

    public void Risposta_fredda(){
        System.out.println("Mh...");
    }

    public void Risposta_cattiva(){
        System.out.println("Che maleducato!");
        relazione = relazione - 2;
    }
}
