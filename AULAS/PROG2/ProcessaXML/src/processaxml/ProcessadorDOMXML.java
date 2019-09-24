package processaxml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProcessadorDOMXML {
  private String arquivoXML;
  private String arquivoXMLOut;
  private Document documento;
  public ProcessadorDOMXML(String arquivoXML,String arquivoOut) {
    this.arquivoXML    = arquivoXML;
    this.arquivoXMLOut = arquivoOut;
    try{
       File xmlFILE = new File(arquivoXML);
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder        builder = factory.newDocumentBuilder();
       documento = builder.parse(xmlFILE);
       documento.getDocumentElement().normalize();
    }catch(Exception e){
       System.out.println("Erro no parse do XML:"+e);
    }   
  }
  public void adicionaNo(String rotulo, String conteudo){
      Element noPrincipal;
      noPrincipal = documento.getDocumentElement();
      Node novoNo = documento.createElement(rotulo);
      novoNo.setTextContent(conteudo);
      noPrincipal.appendChild(novoNo);      
  }
  
  public void escreveDOM(){
      try{         
        TransformerFactory tFac = TransformerFactory.newInstance();
        Transformer transformer = tFac.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource fonteDOM = new DOMSource(documento);       
        StreamResult arqStrm = new StreamResult(new File(arquivoXMLOut));
        transformer.transform(fonteDOM, arqStrm);           
      }catch(Exception e){
         System.out.println("Erro de escrita do XML:"+e);        
      }
  }
  
  
  public void processa(){
        Element noPrincipal;
        noPrincipal = documento.getDocumentElement();
        String nomeNo = noPrincipal.getNodeName();
        System.out.println("-----------------------------");
        System.out.println("Criando e PROCESSANDO o DOM");
        System.out.println("No Principal: " + nomeNo );
        System.out.println("-----------------------------");
        NodeList listaFilhos = noPrincipal.getChildNodes();
        for(int i=0 ; i < listaFilhos.getLength() ; i++){
            System.out.println("-----------------------------");
            Node no = listaFilhos.item(i);
            int tipoNo = no.getNodeType();     
            switch(tipoNo){
                case Element.ELEMENT_NODE: 
                     System.out.println("No Filho(" + i + ") = " + 
                                         no.getNodeName());
                     NamedNodeMap listaAtt = no.getAttributes();
                     for(int j=0 ; j < listaAtt.getLength(); j++){
                        Node noAtt = listaAtt.item(j);
                        System.out.println("Att(" + j + ") = " + 
                                           noAtt.getNodeValue()); 
                     }
                     break;
                case Element.TEXT_NODE: 
                     System.out.println("No Texto(" + i + "): Value = " + 
                                        no.getNodeValue());
                     break;  
            }
            System.out.println("-----------------------------");  
        }
  }  
  
  
  
  
}
