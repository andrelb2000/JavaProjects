/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class CadastroCidadao {
    private ArrayList<CidadaoGalaxia> listaCadastro;

    public CadastroCidadao() {
        listaCadastro = new ArrayList<CidadaoGalaxia>();
    }
    
    public void insereCidadao(CidadaoGalaxia c){
        listaCadastro.add(c);
    }
    
    public CidadaoGalaxia buscaCidadao(CidadaoGalaxia cg){
        Iterator<CidadaoGalaxia> it = listaCadastro.iterator();
        boolean naoAchou = true;
        CidadaoGalaxia  cAchado = new CidadaoGalaxia("Nao Achado", "", 0, 0);
        while((it.hasNext()) && naoAchou ){
            CidadaoGalaxia c = (CidadaoGalaxia)it.next();
            String s = c.getNomeCidadao();
            String t = cg.getNomeCidadao();
            if(s.equalsIgnoreCase(t)){
                naoAchou = false;
                cAchado = c;
            }
        }
       return cAchado;
       
    }
    
    
    
 
    
}
