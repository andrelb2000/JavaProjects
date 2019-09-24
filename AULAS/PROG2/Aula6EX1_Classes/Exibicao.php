<?php
include './Produto.php';

function exibirListaProdutos($arrayProdutos) {
    foreach ($arrayProdutos as $value) {
        $value->mostraProduto();
    }
}


?>

