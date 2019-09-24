<?php
    include './Vestuario.php';
    function mostraCarrinho($carrinho){
      echo "<table border=1>";
       echo "<tbody>";
      echo "<tr>"
            . "<td>Peca</td>"
            . "<td>TAM</td>"              
            . "<td>Preco</td>"
            . "<td>Qde</td>"                       
            . "<td>Total</td>"                                 
         . "</tr>";  
        foreach ($carrinho as $peca) {
            $peca->mostraLinhaCarrinho();               
        }
       echo "<tbody>";        
      echo "</table>";        
    }

?>
