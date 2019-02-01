<?php
    function conectarBancoProduto() {
        $dsn = 'mysql:dbname=test;host=127.0.0.1:3306';
            $user = 'root';
            $password = '';
            try {
                /*
                echo 'Tentando conectar <br/>';
                echo "DNS:".$dsn . "<br/>" ;
                echo "Usuario: " . $user = 'root' . "<br/>";
                echo "Password: " . $password  . "<br/>";
*/
                $dbh = new PDO($dsn, $user, $password);
                echo '<h3> --- CONEXAO BEM SUCEDIDA ---- </h3>';
            } catch (PDOException $e) {
                echo 'Connection failed: ' . $e->getMessage();          
            }
        return $dbh;
    }
    function insereBanco($dbh) {
        ////////////////////// INSERIR NO BANCO ///////////////        
        $nome      =         htmlspecialchars($_GET["NOMEPROD"]);
        $codprod   = (int)   htmlspecialchars($_GET["CODPROD"]);
        $qdeprod   = (int)   htmlspecialchars($_GET["QDEPROD"]);
        $precoprod = (float) htmlspecialchars($_GET["PRECOPROD"]);
        
        $sqlinsert = "INSERT INTO PRODUTO(NOMEPROD, CODPRODUTO, QTDPROD, PRECOPROD)"
                           . "VALUES('$nome','$codprod','$qdeprod','$precoprod')";
        $count = $dbh->exec($sqlinsert);
        if($count == 1){
            echo "<p>$count registro foi incluído </p>";                        //////////////////////////////////////////////////////    
        } else {
            echo "<p>Sem inclusao de registros </p>";                        //////////////////////////////////////////////////////        
        }
    }
    function lerBanco($dbh) {
        $listaProdutos = [];
        $sql = 'SELECT NOMEPROD, CODPRODUTO, QTDPROD, PRECOPROD '
                . 'FROM produto';
        foreach ($dbh->query($sql) as $row) {
            // Obter da lista
            $nprod     = $row['NOMEPROD'];
            $codprod   = $row['CODPRODUTO'];
            $qdeprod   = $row['QTDPROD'];
            $precoprod = $row['PRECOPROD'];            
            // Criar objetos
            $objProduto = new Produto($nprod, $codprod, $precoprod);
            $objProduto->setQdeProduto($qdeprod);
            // Colocar no Array (ultima posicao)
            $listaProdutos[] = $objProduto;
        }
        return $listaProdutos;    
    }

?>
