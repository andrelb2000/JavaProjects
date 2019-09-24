
package aula5ex1processos;

public class ProcessoLegal {
    private String nrProcesso;
    private String descricaoProcesso;
    private double valorAcaoProcesso;
    private int    anoProcesso;

    public ProcessoLegal(String nrProcesso, String descricaoProcesso, double valorAcaoProcesso, int anoProcesso) {
        this.nrProcesso = nrProcesso;
        this.descricaoProcesso = descricaoProcesso;
        this.valorAcaoProcesso = valorAcaoProcesso;
        this.anoProcesso = anoProcesso;
    }

    public double calculaCustas(){
        return (0.1 * valorAcaoProcesso);
    }
    public String getNrProcesso() {
        return nrProcesso;
    }

    public String getDescricaoProcesso() {
        return descricaoProcesso;
    }

    public double getValorAcaoProcesso() {
        return valorAcaoProcesso;
    }

    public int getAnoProcesso() {
        return anoProcesso;
    }
    
    
    
    
}
