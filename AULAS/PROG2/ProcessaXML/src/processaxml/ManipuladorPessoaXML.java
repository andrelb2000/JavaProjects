/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processaxml;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author andre
 */


public class ManipuladorPessoaXML extends DefaultHandler{
    private String rotuloCorrente;
    public ManipuladorPessoaXML() {
        super();
    }
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Iniciando parsing");
    }
    @Override
    public void startElement(String uri, String localName, 
                             String qName, Attributes attributes) 
                             throws SAXException {
        System.out.println("Inicia processando elemento:"+qName);
        rotuloCorrente = qName;
        int nAtributos = attributes.getLength();
        for(int i=0 ; i <nAtributos; i++){
            System.out.println("-->Processando Att:"+ 
                               attributes.getQName(i) + 
                               " = "+ attributes.getValue(i));
        }
    }
    @Override
    public void characters(char[] ch, int start, int length) 
                           throws SAXException {
        String textoRotuloCorrente = new String(ch, start, length);
        System.out.println("  ==> Processa texto:"+
                           textoRotuloCorrente+
                           " do Rotulo:"+rotuloCorrente);
    }
    @Override
    public void endElement(String uri, String localName, 
                           String qName) throws SAXException {
        System.out.println("Termina processando elemento:"+qName+"\n");
        rotuloCorrente = "";
    }
    @Override
    public void endDocument() throws SAXException {
        System.out.println("Finalizando parsing");
    }
    
    
    
    
    
    
    
    
}
