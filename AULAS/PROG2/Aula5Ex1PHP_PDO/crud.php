

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h1> Resultado da Conexao: </h1>
        <h3> --- CONECTANDO COM O BANCCO ---- </h3>
        <?php
        $dsn = 'mysql:dbname=test;host=127.0.0.1:3306';
        $user = 'root';
        $password = '';
        try {
            echo 'Tentando conectar <br/>';
            echo "DNS:".$dsn . "<br/>" ;
            echo "Usuario: " . $user = 'root' . "<br/>";
            echo "Password: " . $password  . "<br/>";
            
            $dbh = new PDO($dsn, $user, $password);
            echo '<h3> --- CONEXAO BEM SUCEDIDA ---- </h3>';
        } catch (PDOException $e) {
            echo 'Connection failed: ' . $e->getMessage();          
        }
        ////////////////////// INSERIR NO BANCO ///////////////        
        $nome  =       htmlspecialchars($_GET["NOMEUSU"]);
        $idade = (int) htmlspecialchars($_GET["IDADEUSU"]);
        $sqlinsert = "INSERT INTO USUARIO(NOME, IDADE)"
                           . "VALUES('$nome','$idade')";
        $count = $dbh->exec($sqlinsert);
        echo "<p>$count registro foi incluído </p>";                
        //////////////////////////////////////////////////////
        
        ////  Mostrar Dados do Banco /////////////
        $sql = 'SELECT NOME, IDADE  '
             . 'FROM usuario';
        foreach ($dbh->query($sql) as $row) {
            print $row['NOME']  . " - Idade: ";
            print $row['IDADE'] . "<br/>";
        }
        ////////////////////////////////////////////        
        ?>
    
        
    </body>
</html>