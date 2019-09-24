
package aula6ex1listasviagem;

public class Viagem {
    private String destinoViagem;
    private String origemViagem;
    private double precoViagem;
    private int    nrDiasViagem;
    private int    milhasViagem;

    public Viagem(String destinoViagem, String origemViagem, double precoViagem, int nrDiasViagem, int milhasViagem) {
        this.destinoViagem = destinoViagem;
        this.origemViagem = origemViagem;
        this.precoViagem = precoViagem;
        this.nrDiasViagem = nrDiasViagem;
        this.milhasViagem = milhasViagem;
    }

    @Override
    public String toString() {
        return "Destino:" + destinoViagem ;
    }

    
    
    public String getDestinoViagem() {
        return destinoViagem;
    }

    public String getOrigemViagem() {
        return origemViagem;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public int getNrDiasViagem() {
        return nrDiasViagem;
    }

    public int getMilhasViagem() {
        return milhasViagem;
    }
    
    
    
    
}
