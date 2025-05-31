package modelo;

public class Album extends Item {
    private String artista;
    private int qtdDeFaixas;

    public Album(String nome, String categoria, String artista, int qtdDeFaixas) {
        super(nome, categoria);
        this.artista = artista;
        this.qtdDeFaixas = qtdDeFaixas;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getQtdDeFaixas() {
        return qtdDeFaixas;
    }
    public void setQtdDeFaixas(int qtdDeFaixas) {
        this.qtdDeFaixas = qtdDeFaixas;
    }
}
