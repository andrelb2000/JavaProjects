
<form action="http://localhost:8383/Aula10Ex1_LojaVest2/index.html">
    <?php
      include './ControladorBanco.php';
      include './TabelaCompras.php';

      $comando = $_GET['ACAO'];
      $carrinhoCompras = [];
      echo "Identifiquei a acao para a peca $comando ";
      
      // ACRESCENTAR
      $bancoDB = new ControladorBanco();
      $bancoDB->conectarBanco();
      $carrinhoCompras = $bancoDB->lerPecaBanco($comando);
      
      
      mostraCarrinho2($carrinhoCompras);   
      $bancoDB->removePecaBanco($comando);
              
      
      echo "</br> <input type='submit' value='Comprar Mais' />";      
    ?>
</form>  

