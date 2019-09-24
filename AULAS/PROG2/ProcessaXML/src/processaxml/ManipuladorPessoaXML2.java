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


public class ManipuladorPessoaXML2 extends DefaultHandler{
    public ManipuladorPessoaXML2() {
        super();
    }
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--------------------");
    }
    @Override
    public void startElement(String uri, String localName, 
                             String qName, Attributes attributes) 
                             throws SAXException {
        if(qName.equals("TextView")){
            String texto = attributes.getValue("android:text");
            System.out.print(texto);
        }else if(qName.equals("EditText")  ){
            System.out.print("<Entre com os dados>");
        }else if(qName.equals("Button")  ){
            System.out.print("<Digite Enter para continuar>");
        }            
    }
    @Override
    public void endElement(String uri, String localName, 
                           String qName) throws SAXException {
        if(qName.equals("EditText")  ){
            System.out.println();
        }else if(qName.equals("Button")  ){
            System.out.println();
        }            
    }
    @Override
    public void endDocument() throws SAXException {
          System.out.println("\n--------------------");
    }
}
