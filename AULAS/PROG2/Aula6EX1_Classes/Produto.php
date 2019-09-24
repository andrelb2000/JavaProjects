<?php

class Produto {
    private  $nomeProduto  = '';
    private  $codProduto   = 0;
    private  $qdeProduto   = 0;
    private  $precoProduto = 0.0;
    // Construtor
    function __construct($nomeProduto, $codProduto, $precoProduto) {
        $this->nomeProduto = $nomeProduto;
        $this->codProduto = $codProduto;
        $this->precoProduto = $precoProduto;
    }
    // Quantidade é um item que saberemos apos a criacao do objeto    
    function setQdeProduto($qdeProduto) {
        $this->qdeProduto = $qdeProduto;
    }
   /// "Getters" 
    function getNomeProduto() {
        return $this->nomeProduto;
    }
    function getCodProduto() {
        return $this->codProduto;
    }
    function getQdeProduto() {
        return $this->qdeProduto;
    }
    function getPrecoProduto() {
        return $this->precoProduto;
    }    
    function mostraProduto() {
        echo "Produto:" . $this->nomeProduto;
        echo " - Codigo Produto:" . $this->codProduto;
        echo "- Qde Produto:" . $this->qdeProduto;
        echo " - Preco Produto:" . $this->precoProduto . "<br/>";
    }    
}
