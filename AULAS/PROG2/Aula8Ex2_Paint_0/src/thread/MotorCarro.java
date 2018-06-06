/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import aula8ex1_paint.view.MainPaintView;

public class MotorCarro implements Runnable {
    private MainPaintView mainView;
    private boolean ignicao = false;    
    public MotorCarro(MainPaintView mpv) {
        mainView = mpv;
    }
    @Override
    public void run() {  
        try{
           while(ignicao){
            mainView.moveCarrosUp();
            Thread.sleep(500);
            }   
        }catch(InterruptedException ie){              
        }                  
    }
    public void setIgnicao(boolean ignicao) {
        this.ignicao = ignicao;
    }
}
