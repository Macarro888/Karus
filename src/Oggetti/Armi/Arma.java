package Oggetti.Armi;

public class Arma {
    // ----------|Attributi e Costruttore|----------
    private String nome_arma;
    private int danno_arma;
    private boolean distanza;
    private int integrita;

    public Arma(String nome_arma, int danno_arma, boolean distanza,int integrita) {
        this.nome_arma = nome_arma;
        this.danno_arma = danno_arma;
        this.distanza = distanza;
        this.integrita = integrita;
    }
//-----------------|Getter e Setter|------------------
    public String getNome_arma() {
        return nome_arma;
    }
    public void setNome_arma(String nome_arma) {
        this.nome_arma = nome_arma;
    }
    public int getDanno_arma() {
        return danno_arma;
    }
    public void setDanno_arma(int danno_arma) {
        this.danno_arma = danno_arma;
    }
    public boolean isDistanza() {
        return distanza;
    }
    public void setDistanza(boolean distanza) {
        this.distanza = distanza;
    }
    public int getIntegrita() {
        return integrita;
    }
    public void setIntegrita(int integrita) {
        this.integrita = integrita;
    }

    //-----------------------|Metodi|------------------------

}
