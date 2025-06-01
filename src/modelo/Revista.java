package modelo;

public class Revista extends Item {
    private String editora;
    private int edicao;

    public Revista(String nome, String categoria, String editora, int edicao) {
        super(nome, categoria);
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        String dados = String.format("""
                Título: %s
                Categoria: %s
                Editora: %s
                Edição: %d
                """, this.getNome(), this.getCategoria(), this.getEditora(), this.getEdicao());
        return dados;
    }
}
