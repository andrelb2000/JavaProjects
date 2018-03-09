/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

/**
 *
 * @author andre
 */
public class PessoaControler {
    
    public void showPessoa(){
        PessoaModel pm = new PessoaModel();
        PessoaView  pv = new PessoaView();
        pv.lerListaPessoas();
    }
}
