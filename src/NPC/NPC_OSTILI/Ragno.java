package NPC.NPC_OSTILI;

import NPC.Giocatore;

public class Ragno extends NPC_OSTILI{
    public Ragno(String nome, int vita, int danno) {
        super(nome, vita, danno);
    }

    @Override
    public void attacco(Giocatore player) throws InterruptedException {
        super.attacco(player);
    }

    @Override
    public void subisciDanno(int danno) {
        super.subisciDanno(danno);
    }

    @Override
    public void controlloVivo() {
        super.controlloVivo();
    }
}
