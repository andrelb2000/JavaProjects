<?php
    function construirPeca($req){
         $nome  = $req['PECA'];
         $tam   = $req['TAMANHO'];
         $preco = $req['PRECO'];
         $qde   = $req['QUANTIDADE'];         
         $obj = new Vestuario($nome, $tam, $preco, $qde);
         return $obj;
    }
    function conectarBanco(){
        $dsn = "mysql:dbname=VESTUARIODB;host=localhost:3306";
        $user = 'root';
        $pass = '';
        try{
            $dbh = new PDO($dsn,$user,$pass);            
            echo "Conexao bem sucedida";
        } catch (Exception $ex) {
            echo "Problemas na conexao " . $ex->getMessage();

        }
        return $dbh;
    }
    function inserirBanco($dbh,$peca){
        $sql = "INSERT INTO VESTUARIO_TB(NOME,TAMANHO,PRECO,QUANTIDADE) "
             . "VALUES('" . $peca->getNomeVestuario()  .   "',"
                    . "'" . $peca->getTamVestuario()   .   "',"
                    .        $peca->getPrecoVestuario() .     ","
                    .        $peca->getQdeVestuario()   .     ")";
        echo "SQL: " . $sql;
        $dbh->exec($sql);        
    }
    function lerBanco($dbh){
        $carrinho = [];
        $sql = "SELECT NOME,TAMANHO,PRECO,QUANTIDADE "
             . "FROM VESTUARIO_TB";
     foreach ($dbh->query($sql) as $reg) {
         
         $nome  = $reg['NOME'];
         $tam   = $reg['TAMANHO'];
         $preco = $reg['PRECO'];
         $qde   = $reg['QUANTIDADE'];         
         $obj = new Vestuario($nome, $tam, $preco, $qde);
         $carrinho[] = $obj;                  
     }
     return $carrinho;           
    }
    function apagaBanco($dbh){
            $sql ="DELETE "
            . "FROM VESTUARIO_TB ";
        $dbh->exec($sql);            
        echo "SQL: " . $sql;      
    }
    function removeBanco($dbh,$peca) {
        $sql ="DELETE "
            . "FROM VESTUARIO_TB "
            . "WHERE NOME = '" . $peca->getNomeVestuario() . "'";
        $dbh->exec($sql);            
        echo "SQL: " . $sql;        
    }
    function alterabanco($dbh,$peca){
        $sql = "UPDATE VESTUARIO_TB "
                     . "SET TAMANHO    = '" . $peca->getTamVestuario()   . "',"
                     .     "PRECO      = "  . $peca->getPrecoVestuario() . "," 
                     .     "QUANTIDADE = "  . $peca->getQdeVestuario() 
                     . " WHERE NOME = '" . $peca->getNomeVestuario() . "'";        
        $dbh->exec($sql);            
        echo "SQL: " . $sql; 
    }
    function lerBancoPreco($dbh,$peca){
        $carrinho = [];
        $sql = "SELECT NOME,TAMANHO,PRECO,QUANTIDADE "
             . "FROM VESTUARIO_TB "
             . "WHERE PRECO > " . $peca->getPrecoVestuario();
        echo "SQL: " . $sql;         
     foreach ($dbh->query($sql) as $reg) {
         
         $nome  = $reg['NOME'];
         $tam   = $reg['TAMANHO'];
         $preco = $reg['PRECO'];
         $qde   = $reg['QUANTIDADE'];         
         $obj = new Vestuario($nome, $tam, $preco, $qde);
         $carrinho[] = $obj;                  
     }
     return $carrinho;           
    }

?>

