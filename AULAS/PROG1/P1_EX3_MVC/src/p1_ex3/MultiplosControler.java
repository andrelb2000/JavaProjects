/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex3;

public class MultiplosControler {
    public void processar(){
       boolean continuar = true;
       MultiplosView mV = new MultiplosView();
       while (continuar){
           continuar = mV.leMultiplosInfo();
           MultiplosInfoModel mIM = new MultiplosInfoModel(mV.getQdeMultiplos(),
                                                       mV.getMultiploGerador());            
           mV.mostraMultiplos(mIM.geraMultiplos());
        }
        System.out.println("Tarefa Encerrada!");            
    }
}
