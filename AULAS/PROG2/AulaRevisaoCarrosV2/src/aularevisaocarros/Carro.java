/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aularevisaocarros;

/**
 *
 * @author andre
 */
public class Carro {
    private String donoCarro;
    private String tipoCarro;
    private double precoCarro;
    private boolean vendidoCarro;

    public Carro(String donoCarro, String tipoCarro, double precoCarro, boolean vendidoCarro) {
        this.donoCarro = donoCarro;
        this.tipoCarro = tipoCarro;
        this.precoCarro = precoCarro;
        this.vendidoCarro = vendidoCarro;
    }

    @Override
    public String toString() {        
        if(vendidoCarro){
            return   "Dono:  " + donoCarro + "  -  tipo:  " + tipoCarro + 
               "  -  VENDIDO ";  
        }else{
            return   "Dono:  " + donoCarro + "  -  tipo:  " + tipoCarro + 
                   "    -  preco R$ " + precoCarro ;
        }
    }

    
    
    
    public String getDonoCarro() {
        return donoCarro;
    }

    public void setDonoCarro(String donoCarro) {
        this.donoCarro = donoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public double getPrecoCarro() {
        return precoCarro;
    }

    public void setPrecoCarro(double precoCarro) {
        this.precoCarro = precoCarro;
    }

    public boolean isVendidoCarro() {
        return vendidoCarro;
    }

    public void setVendidoCarro(boolean vendidoCarro) {
        this.vendidoCarro = vendidoCarro;
    }
    
    
    
}
