<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mostrando os dados:</h1>
        <h3> Nome do Produto:  <%= request.getParameter("NomeProduto")  %> </h3>
        <h4> Preco do Produto: R$ <%= request.getParameter("PrecoProduto")  %></h4>
        <h4>Custo do Produto: R$ <%= request.getParameter("CustoProduto")  %></h4>
        <h4>Unidades do Produto <%= request.getParameter("QdeProduto")  %></h4>
    </body>
</html>
