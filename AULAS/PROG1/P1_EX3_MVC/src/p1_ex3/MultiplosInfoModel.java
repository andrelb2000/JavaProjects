/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex3;

/**
 *
 * @author andre
 */
public class MultiplosInfoModel {
    private int QdeMultiplos = 0;
    private int MultiploGerador = 0;

    public MultiplosInfoModel(int n, int m) {
        this.QdeMultiplos = n;
        this.MultiploGerador = m;
    }
    
    public String geraMultiplos(){ 
        String sTemp = "";
        for(int i=0 ; i < this.QdeMultiplos ; i++){
            sTemp += " |:| " + i* this.MultiploGerador;
        }
        return sTemp;
    }
}
