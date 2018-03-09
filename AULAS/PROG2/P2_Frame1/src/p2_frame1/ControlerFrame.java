/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

/**
 *
 * @author andre
 */
public class ControlerFrame {
    
    public void showPessoa(){
        //1 - Criar Modelo
        PessoaModel pm = new PessoaModel("Darth Vader", 123);
        
        //2 - Criar Views
        ViewPessoaFrame  pv = new ViewPessoaFrame();
       
        //3 - Ligar Modelo a view
        pv.showPessoa(pm.getNome(),pm.getIdade());
            
 
            
    }
    
    
    
}
