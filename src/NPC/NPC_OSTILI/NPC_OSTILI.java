package NPC.NPC_OSTILI;

import NPC.Giocatore;

public class NPC_OSTILI {
    private String nome;
    private int vita;
    private int danno;
    private boolean vivo = true;
    public NPC_OSTILI(String nome, int vita, int danno) {
        this.nome = nome;
        this.vita = vita;
        this.danno = danno;
    }

// -----------------|Getter e Setter|-------------------


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    // --------------|Metodi|-------------------

   public void attacco (Giocatore player) throws InterruptedException {
       System.out.println(getNome()+" infligge "+getDanno()+" a "+player.getNome_giocatore());
       Thread.sleep(5000);
       player.perditaVita(getDanno());
   }
   public void subisciDanno (int danno){
        setVita(getVita()-danno);
   }

   public void controlloVivo (){
        if (getVita()<=0){
            setVivo(false);
        }
   }
}
