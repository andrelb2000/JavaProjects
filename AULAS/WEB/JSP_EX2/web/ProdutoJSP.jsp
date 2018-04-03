<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! private double totalLucro = 0;
            private double totalVenda = 0; %>
        
        <h1>Mostrando os dados:</h1>
        <h3> Nome do Produto:  <%= request.getParameter("NomeProduto")  %> </h3>
        <h4> Preco do Produto: R$ <%= request.getParameter("PrecoProduto")  %></h4>
        <h4>Custo do Produto: R$ <%= request.getParameter("CustoProduto")  %></h4>
        <h4>Unidades do Produto <%= request.getParameter("QdeProduto")  %></h4>
        <%  
            double preco = Double.parseDouble(request.getParameter("PrecoProduto"));
            double custo = Double.parseDouble(request.getParameter("CustoProduto"));
            int    qde   = Integer.parseInt(request.getParameter("QdeProduto"));
            totalVenda = preco * qde;
            totalLucro = totalVenda - (qde*custo);
        %>
        <h4>Total Venda:<%=totalVenda %></h4>
        <h4>Total Lucro:<%=totalLucro %></h4>
    </body>
</html>
