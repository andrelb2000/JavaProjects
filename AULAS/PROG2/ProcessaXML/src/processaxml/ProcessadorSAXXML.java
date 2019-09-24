/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processaxml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author andre
 */
public class ProcessadorSAXXML {
    private String arquivoXML;
    public ProcessadorSAXXML(String arquivoXML) {
        this.arquivoXML = arquivoXML;
    }    
    public void processa(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try{
            SAXParser parser = factory.newSAXParser();
            DefaultHandler manipulador  = new ManipuladorPessoaXML();
            DefaultHandler manipulador2 = new ManipuladorPessoaXML2();
            
            //parser.parse(arquivoXML, manipulador);                        
            parser.parse(arquivoXML, manipulador2);                        
            
        }catch(Exception e){
            System.out.println("Erro no parse do XML:"+e);
        }
    }    
}
