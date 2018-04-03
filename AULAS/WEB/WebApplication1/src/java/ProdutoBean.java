/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author andre
 */
@Named(value = "produtoBean")
@Dependent
public class ProdutoBean {

    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;
    private double totalProduto;

    public void calculaTotal(){
        totalProduto = quantidadeProduto * precoProduto;
    }
    
    /**
     * Get the value of totalProduto
     *
     * @return the value of totalProduto
     */
    public double getTotalProduto() {
        return totalProduto;
    }

    /**
     * Set the value of totalProduto
     *
     * @param totalProduto new value of totalProduto
     */
    public void setTotalProduto(double totalProduto) {
        this.totalProduto = totalProduto;
    }


    /**
     * Get the value of precoProduto
     *
     * @return the value of precoProduto
     */
    public double getPrecoProduto() {
        return precoProduto;
    }

    /**
     * Set the value of precoProduto
     *
     * @param precoProduto new value of precoProduto
     */
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    

    /**
     * Get the value of quantidadeProduto
     *
     * @return the value of quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * Set the value of quantidadeProduto
     *
     * @param quantidadeProduto new value of quantidadeProduto
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }


    /**
     * Get the value of nomeProduto
     *
     * @return the value of nomeProduto
     */
    public String getNomeProduto() {
        System.out.println("getNomeProduto:"+nomeProduto);
        return nomeProduto;
    }

    /**
     * Set the value of nomeProduto
     *
     * @param nomeProduto new value of nomeProduto
     */
    public void setNomeProduto(String nome) {
        System.out.println("Set Nome Produto: " + nome);
        this.nomeProduto = nome;
    }

    
    
    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {
        System.out.println("Bean Sendo Criado");
    }
    
}
