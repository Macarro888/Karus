package Oggetti.Armi;

public class Artigli_pietra_nera extends Arma{
    public Artigli_pietra_nera(String nome_arma, int danno_arma, boolean distanza, int integrita) {
        super(nome_arma, danno_arma, distanza, integrita);
    }

    @Override
    public String getNome_arma() {
        return super.getNome_arma();
    }

    @Override
    public void setNome_arma(String nome_arma) {
        super.setNome_arma(nome_arma);
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
}
