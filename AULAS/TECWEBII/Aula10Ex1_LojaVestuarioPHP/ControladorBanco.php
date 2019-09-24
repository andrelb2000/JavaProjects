<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ControladorBanco
 *
 * @author professor
 */
class ControladorBanco {
    public  $dbh;    
    public  $dsn  = "mysql:dbname=VESTUARIODB;host=localhost:3306";
    private $user = 'root';
    private $pass = '';

    
    function __construct() {
        $this->dbh = NULL;
    }

    
    private function construirPeca($req){
         $nome  = $req['NOME'];
         $tam   = $req['TAMANHO'];
         $preco = $req['PRECO'];
         $qde   = $req['QUANTIDADE'];      
         //Acrescentar mais campos
         $obj = new Vestuario($nome, $tam, $preco, $qde);
         return $obj;
    }
    public function conectarBanco(){        
        try{
            $this->dbh = new PDO($this->dsn,
                                 $this->user,
                                 $this->pass);            
            echo "Conexao bem sucedida";
        } catch (Exception $ex) {
            echo "Problemas na conexao " . $ex->getMessage();

        }        
    }
    public function inserirBanco($req){
        $peca = $this->construirPeca($req);        
        $sql = "INSERT INTO VESTUARIO_TB(NOME,TAMANHO,PRECO,QUANTIDADE) "
             . "VALUES('" . $peca->getNomeVestuario()  .   "',"
                    . "'" . $peca->getTamVestuario()   .   "',"
                    .        $peca->getPrecoVestuario() .     ","
                    .        $peca->getQdeVestuario()   .     ")";
        echo "SQL: " . $sql;
        $this->dbh->exec($sql);        
    }    
    public function lerBanco(){
        $carrinho = [];
        $sql = "SELECT NOME,TAMANHO,PRECO,QUANTIDADE "
             . "FROM VESTUARIO_TB";
     foreach ($this->dbh->query($sql) as $reg) {         
         $obj = $this->construirPeca($reg);         
         $carrinho[] = $obj;                  
     }
     return $carrinho;           
    }
    public function apagaBanco(){
        $sql ="DELETE "
            . "FROM VESTUARIO_TB ";
        $this->dbh->exec($sql);            
        echo "SQL: " . $sql;      
    } 
    public function removeBanco($req) {
        $peca = $this->construirPeca($req);
        $sql ="DELETE "
            . "FROM VESTUARIO_TB "
            . "WHERE NOME = '" . $peca->getNomeVestuario() . "'"
                 . " AND TAMANHO = '" . $peca->getTamVestuario() . "'";
        $this->dbh->exec($sql);            
        echo "SQL: " . $sql;        
    }
    public function removePecaBanco($peca) {        
        $sql ="DELETE "
            . "FROM VESTUARIO_TB "
            . "WHERE NOME = '" . $peca . "'";
        $this->dbh->exec($sql);            
        echo "SQL: " . $sql;        
    }
    
    public function alterabanco($req){
        $peca = $this->construirPeca($req);
        $sql = "UPDATE VESTUARIO_TB "
                     . "SET TAMANHO    = '" . $peca->getTamVestuario()   . "',"
                     .     "PRECO      = "  . $peca->getPrecoVestuario() . "," 
                     .     "QUANTIDADE = "  . $peca->getQdeVestuario() 
                     . " WHERE NOME = '" . $peca->getNomeVestuario() . "'";        
        $this->dbh->exec($sql);            
        echo "SQL: " . $sql; 
    }
    public function lerBancoPreco($req){
        $carrinho = [];
        $peca = $this->construirPeca($req);
        $sql = "SELECT NOME,TAMANHO,PRECO,QUANTIDADE "
             . "FROM VESTUARIO_TB "
             . "WHERE PRECO > " . $peca->getPrecoVestuario();
        echo "SQL: " . $sql;         
        foreach ($this->dbh->query($sql) as $reg) {

            $nome  = $reg['NOME'];
            $tam   = $reg['TAMANHO'];
            $preco = $reg['PRECO'];
            $qde   = $reg['QUANTIDADE'];         
            $obj = new Vestuario($nome, $tam, $preco, $qde);
            $carrinho[] = $obj;                  
        }
        return $carrinho;           
    }
    
    public function lerPecaBanco($peca){
        $carrinho = [];
        $sql = "SELECT NOME,TAMANHO,PRECO,QUANTIDADE "
             . "FROM VESTUARIO_TB "
             . "WHERE NOME ='$peca'";
        echo "SQL: " . $sql;         
     foreach ($this->dbh->query($sql) as $reg) {         
         $obj = $this->construirPeca($reg);         
         $carrinho[] = $obj;                  
     }
     
     return $carrinho;           
    }
    
    
}
