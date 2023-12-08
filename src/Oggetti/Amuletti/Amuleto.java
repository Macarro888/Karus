package Oggetti.Amuletti;

public class Amuleto {
    private String nome;
    private int effettiVita;
    private int effettiDanno;

    public Amuleto(String nome, int effettiVita, int effettiDanno) {
        this.nome = nome;
        this.effettiVita = effettiVita;
        this.effettiDanno = effettiDanno;
    }

// --------------|Getter e Setter|--------------


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEffettiVita() {
        return effettiVita;
    }
    public void setEffettiVita(int effettiVita) {
        this.effettiVita = effettiVita;
    }
    public int getEffettiDanno() {
        return effettiDanno;
    }
    public void setEffettiDanno(int effettiDanno) {
        this.effettiDanno = effettiDanno;
    }

// ---------------|Metodi|----------------
}
