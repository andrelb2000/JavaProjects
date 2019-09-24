/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processaxml;

/**
 *
 * @author andre
 */
public class ProcessaXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String arquivoXML     = "D:\\GALB2000\\PROFESSOR\\TRABALHOS\\ESTACIO\\Conteudista\\DISCIPLINAS\\CCT0869_XML\\PRODUCAO\\AULA03_EX5.xml";
        String arquivoXML2    = "D:\\GALB2000\\PROFESSOR\\TRABALHOS\\ESTACIO\\Conteudista\\DISCIPLINAS\\CCT0869_XML\\PRODUCAO\\android_main.xml";
        String arquivoXMLOut  = "D:\\GALB2000\\PROFESSOR\\TRABALHOS\\ESTACIO\\Conteudista\\DISCIPLINAS\\CCT0869_XML\\PRODUCAO\\android_mainOut.xml";       
  //      ProcessadorSAXXML psx = new ProcessadorSAXXML(arquivoXML2);
  //      psx.processa(); 
        
        ProcessadorDOMXML2 pdx = new ProcessadorDOMXML2(arquivoXML2,arquivoXMLOut);
        pdx.adicionaElementoAtt("TextView","android:text","Quantidade:");
        pdx.adicionaElemento("EditText");
        
        pdx.processa();
        pdx.escreveDOM();
    }
    
}
