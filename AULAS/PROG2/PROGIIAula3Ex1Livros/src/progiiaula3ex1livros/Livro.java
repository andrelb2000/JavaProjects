
package progiiaula3ex1livros;

public class Livro {
    //Atributos
    private String nomeLivro;
    private int    nrPaginas;
    private double precoLivro;
    private int    qdeEstoque;

    public Livro(String nomeLivro, int nrPaginas, double precoLivro, 
                 int qdeEstoque) {
        this.nomeLivro = nomeLivro;
        this.nrPaginas = nrPaginas;
        this.precoLivro = precoLivro;
        this.qdeEstoque = qdeEstoque;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public int getQdeEstoque() {
        return qdeEstoque;
    }
    
    
    
}
