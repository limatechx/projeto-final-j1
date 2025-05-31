package modelo;

public class Livro extends Item{
    private String autor;
    private int qtdDePaginas;

    public Livro(String nome, String categoria, String autor, int qtdDePaginas) {
        super(nome, categoria);
        this.autor = autor;
        this.qtdDePaginas = qtdDePaginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getQtdDePaginas() {
        return qtdDePaginas;
    }
    public void setQtdDePaginas(int qtdDePaginas) {
        this.qtdDePaginas = qtdDePaginas;
    }

    @Override
    public String toString() {
        String dados = String.format("""
                Título: %s
                Categoria: %s
                Autor: %s
                %d páginas
                """, this.getNome(), this.getCategoria(), this.getAutor(), this.getQtdDePaginas());
        return dados;
    }
}
