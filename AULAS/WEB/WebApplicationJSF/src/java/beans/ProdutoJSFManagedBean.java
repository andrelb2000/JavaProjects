/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author andre
 */
public class ProdutoJSFManagedBean {

        private String nomeProduto;

    private double precoProduto;

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
     * Get the value of nomeProduto
     *
     * @return the value of nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Set the value of nomeProduto
     *
     * @param nomeProduto new value of nomeProduto
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    
    /**
     * Creates a new instance of ProdutoJSFManagedBean
     */
    public ProdutoJSFManagedBean() {
    }
    
}
