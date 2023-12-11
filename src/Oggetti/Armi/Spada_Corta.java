package Oggetti.Armi;

public class Spada_Corta extends Arma{
    public Spada_Corta(String nome_arma, int danno_arma, boolean distanza, int integrita) {
        super(nome_arma, danno_arma, distanza, integrita);
    }

//-----------|Overrider|------------
    @Override
    public String getNome_arma() {
        return super.getNome_arma();
    }

    @Override
    public int getDanno_arma() {
        return super.getDanno_arma();
    }

    @Override
    public void setDanno_arma(int danno_arma) {
        super.setDanno_arma(danno_arma);
    }

    @Override
    public boolean isDistanza() {
        return super.isDistanza();
    }

    @Override
    public void setDistanza(boolean distanza) {
        super.setDistanza(distanza);
    }

    @Override
    public int getIntegrita() {
        return super.getIntegrita();
    }

    @Override
    public void setIntegrita(int integrita) {
        super.setIntegrita(integrita);
    }

// --------------|Metodi|-------------

}
