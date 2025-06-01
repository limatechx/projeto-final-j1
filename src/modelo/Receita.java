package modelo;

public class Receita extends Item {
    private String ingredientes;
    private String modoDePreparo;

    public Receita(String nome, String categoria, String ingredientes, String modoDePreparo) {
        super(nome, categoria);
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    @Override
    public String toString() {
        String dados = String.format("""
                Título: %s
                Categoria: %s
                Ingredientes: %s
                Modo de Preparo: %s
                """, this.getNome(), this.getCategoria(), this.getIngredientes(), this.getModoDePreparo());
        return dados;
    }
}
