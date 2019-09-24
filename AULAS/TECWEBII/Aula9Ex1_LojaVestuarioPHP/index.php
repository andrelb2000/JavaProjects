<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
           include './BancoDadosVestuario.php';
           include './TabelaCompras.php';
           $carrinhoCompras = [];
           $dbh = conectarBanco();
           $comando = $_GET['COMANDO'];
           if ($comando == "Carrinho"){
               $carrinhoCompras = lerBanco($dbh);           
               mostraCarrinho($carrinhoCompras);        
           }
           if ($comando == "Comprar"){
               $peca = construirPeca($_GET);               
               inserirBanco($dbh, $peca);                                              
               echo "<H1> Peca Inserida </H1>";
           }
           if ($comando == "Remover"){
               $peca = construirPeca($_GET);               
               removeBanco($dbh, $peca);
               echo "<H1> Peca Removida </H1>";
           }
           if ($comando == "Alterar"){
               $peca = construirPeca($_GET);               
               alterabanco($dbh, $peca);
               echo "<H1> Peca Alterada </H1>";
           }           
           if ($comando == "Consulta"){
               $peca = construirPeca($_GET);               
               $carrinhoCompras = lerBancoPreco($dbh,$peca);           
               mostraCarrinho($carrinhoCompras);        
           }           
           
        ?>
        <form action="http://localhost:8383/Aula9Ex1_Loja_Vestuario/index.html">
            
            <input type="submit" value="Comprar Mais" />
            
        </form>
        
    </body>
</html>
