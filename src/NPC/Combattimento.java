package NPC;

import NPC.NPC_OSTILI.NPC_OSTILI;

public class Combattimento {
    private Giocatore Player;
    private NPC_OSTILI Nemico;


    // -----------|Setter e Getter|-----------
    public Combattimento(Giocatore player, NPC_OSTILI nemico) {
        Player = player;
        Nemico = nemico;
    }

    public Giocatore getPlayer() {
        return Player;
    }

    public void setPlayer(Giocatore player) {
        Player = player;
    }

    public NPC_OSTILI getNemico() {
        return Nemico;
    }

    public void setNemico(NPC_OSTILI nemico) {
        Nemico = nemico;
    }

    public void lotta(Giocatore player, NPC_OSTILI Nemico) throws InterruptedException {
        boolean finish = true;
        do {
            if (player.condizioneArma() <= 0){
                System.out.println("La tua arma è rotta");
                Thread.sleep(5000);
                player.dannoCondizioneZero();
            }
            player.attacco(Nemico);
            Nemico.controlloVivo();
            if (!Nemico.isVivo()) {
                System.out.println("Hai vinto!");
                Thread.sleep(5000);
                finish = false;
                break;
            }
            Nemico.attacco(player);
            player.controlloVivo();
            if (!player.isVivo()) {
                System.out.println("Sei morto!");
                Thread.sleep(5000);
                player.setVivo(false);
                finish = false;
            }
        } while (finish) ;
    }
}
