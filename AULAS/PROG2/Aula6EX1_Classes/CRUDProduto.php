

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h1> Acessando dados: </h1>
        <h3> --- Resultado ---- </h3>
        <?php
            include './Exibicao.php';
            include './CRUDProdutoPDO.php';
       
            $dbh = conectarBancoProduto();
            insereBanco($dbh);
            $lista = lerBanco($dbh);     
            exibirListaProdutos($lista);       
        ?>            
    </body>
</html>


