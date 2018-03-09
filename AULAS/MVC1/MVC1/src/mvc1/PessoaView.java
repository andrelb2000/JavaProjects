/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

import javax.swing.JOptionPane;

public class PessoaView {
    private String  Nome = "";
    private int     Idade = 0;
    public PessoaView() {
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    // Mostra o conteudo do visualizador
    void showPessoa(){
        JOptionPane.showMessageDialog(null, "Nome:" + Nome + " Idade:" + Idade, 
                            "Visualizador de Pessoa",JOptionPane.PLAIN_MESSAGE);
    }
}
