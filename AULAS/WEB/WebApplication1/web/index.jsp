<%-- 
    Document   : newjsf
    Created on : 02/04/2018, 14:58:29
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="Hello World!"/></h1>
            
            <h:form>
                <h:outputLabel value="Nome do Produto:" for="IDinputNomeProduto" />
                <h:inputText id="IDinputNomeProduto" label="Nome Produto" value="#{produtoBean.nomeProduto}"/>  <br>
                
                      
                <h:commandButton id="mostrar"  value="Mostrar" type="submit" action="viewProduto" />
                
                
            </h:form>

            
            
            
            
        </body>
    </html>
</f:view>
