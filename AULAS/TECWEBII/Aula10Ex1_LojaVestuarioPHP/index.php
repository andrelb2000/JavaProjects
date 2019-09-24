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
        <form action="http://localhost/Aula10Ex1_LojaVestuarioPHP/processaAcao.php">            
            <?php            
                include './ControladorBanco.php';
                include './TabelaCompras.php';
                $carrinhoCompras = [];
                
                // ACRESCENTAR
                $bancoDB = new ControladorBanco();
                
                //ANTES:  $dbh = conectarBanco();
                $bancoDB->conectarBanco();
                        
                $comando = $_GET['COMANDO'];
                if ($comando == "Carrinho"){
                    //ANTES: $carrinhoCompras = lerBanco($dbh);           
                    $carrinhoCompras = $bancoDB->lerBanco();                               
                    mostraCarrinho($carrinhoCompras);        
                }
                if ($comando == "Comprar"){
                    //ANTES:                    
                    //$peca = construirPeca($_GET);               
                    //inserirBanco($dbh, $peca);                                              
                    $bancoDB->inserirBanco($_GET);
                    echo "<H1> Peca Inserida </H1>";
                    $carrinhoCompras = $bancoDB->lerBanco();                               
                    mostraCarrinho($carrinhoCompras);        

                }
                if ($comando == "Remover"){
                    //ANTES:                                        
                    //$peca = construirPeca($_GET);
                    //removeBanco($dbh, $peca);
                    $bancoDB->removeBanco($_GET);                    
                    echo "<H1> Peca Removida </H1>";
                    $carrinhoCompras = $bancoDB->lerBanco();                               
                    mostraCarrinho($carrinhoCompras);        
                    
                }
                if ($comando == "Alterar"){
                    //ANTES:                    
                    //$peca = construirPeca($_GET);               
                    //alterabanco($dbh, $peca);
                    $bancoDB->alterabanco($_GET);                    
                    echo "<H1> Peca Alterada </H1>";
                    $carrinhoCompras = $bancoDB->lerBanco();                               
                    mostraCarrinho($carrinhoCompras);        
                    
                }           
                if ($comando == "Consulta"){
                    //ANTES:                    
                    //$peca = construirPeca($_GET);               
                    //$carrinhoCompras = lerBancoPreco($dbh,$peca);           
                    $carrinhoCompras = $bancoDB->lerBancoPreco($_GET);
                    mostraCarrinho($carrinhoCompras);        
                }                 
            ?>
        </form>       
        <form action="http://localhost:8383/Aula10Ex1_LojaVest2/index.html">
         <?php     
           echo "</br> <input type='submit' value='Comprar Mais' />";      
         ?>
        </form>  
        
    </body>
</html>
