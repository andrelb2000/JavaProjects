
package aula8ex1doencajdbc;

public class Doenca {
   private String nomeDoenca;
   private int    nrPacientes;

    public Doenca(String nomeDoenca, int nrPacientes) {
        this.nomeDoenca = nomeDoenca;
        this.nrPacientes = nrPacientes;
    }

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public int getNrPacientes() {
        return nrPacientes;
    }

    @Override
    public String toString() {
        return (nomeDoenca + " - " + nrPacientes);
    }
   
   
    
}
