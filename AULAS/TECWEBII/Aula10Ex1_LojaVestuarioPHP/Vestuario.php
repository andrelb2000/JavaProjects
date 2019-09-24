<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Vestuario
 *
 * @author professor
 */
class Vestuario {
    private $nomeVestuario = '';
    private $tamVestuario = 'P';
    private $precoVestuario = 0.0;
    private $qdeVestuario = 0;
    
    function __construct($nomeVestuario, $tamVestuario, $precoVestuario, $qdeVestuario) {
        $this->nomeVestuario = $nomeVestuario;
        $this->tamVestuario = $tamVestuario;
        $this->precoVestuario = $precoVestuario;
        $this->qdeVestuario = $qdeVestuario;
    }
    function getNomeVestuario() {
        return $this->nomeVestuario;
    }
    function getTamVestuario() {
        return $this->tamVestuario;
    }
    function getPrecoVestuario() {
        return $this->precoVestuario;
    }
    function getQdeVestuario() {
        return $this->qdeVestuario;
    }
    function mostraLinhaCarrinho(){
        echo "<tr>";
          echo "<td>" . $this->nomeVestuario . "</td>";
          echo "<td>" . $this->tamVestuario . "</td>";
          echo "<td>" . $this->precoVestuario . "</td>";
          echo "<td>" . $this->qdeVestuario . "</td>";
          echo "<td>" . ($this->qdeVestuario * $this->precoVestuario) . "</td>";        
          echo "<td>  <input name = 'ACAO' type='submit' value=$this->nomeVestuario /> </td>";                       
        echo "</tr>";
    }
    
    
}
