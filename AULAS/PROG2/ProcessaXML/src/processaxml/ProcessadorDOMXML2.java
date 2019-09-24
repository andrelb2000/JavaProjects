package processaxml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProcessadorDOMXML2 {
  private String arquivoXML;
  private String arquivoXMLOut;
  private Document documento;
  public ProcessadorDOMXML2(String arquivoXML,String arquivoOut) {
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
  public void adicionaElemento(String rotulo){
      Element noPrincipal;
      noPrincipal = documento.getDocumentElement();
      Node novoNo = documento.createElement(rotulo);
      noPrincipal.appendChild(novoNo);      
  }
  public void adicionaElementoAtt(String rotulo,String att,String valor){
      Element noPrincipal;
      noPrincipal = documento.getDocumentElement();
      Element novoNo = documento.createElement(rotulo);
      Attr novoAtributo = documento.createAttribute(att);
      novoAtributo.setValue(valor);
      novoNo.setAttributeNode(novoAtributo);
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
        NodeList listaFilhos = noPrincipal.getChildNodes();
        for(int i=0 ; i < listaFilhos.getLength() ; i++){
            Node no = listaFilhos.item(i);
            int tipoNo = no.getNodeType();     
            switch(tipoNo){
                case Element.ELEMENT_NODE: 
                    String qName = no.getNodeName();
                    if(qName.equals("TextView")){
                        NamedNodeMap attributes = no.getAttributes();
                        String texto = attributes.getNamedItem("android:text")
                                      .getNodeValue();
                        System.out.print("\n" + texto);                        
                    }else if(qName.equals("EditText")  ){
                        System.out.println("<Entre com os dados>");
                    }else if(qName.equals("Button")  ){
                        System.out.println("<Digite Enter para continuar>");
                    }                         
                     break;
            }
        }
        System.out.println("\n-----------------------------");          
  }  
}
