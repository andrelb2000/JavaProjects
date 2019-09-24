package aula7excarros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class ControladorCarros {
    private ControladorBanco    controladorBanco;
    private CarrosViewJFrame    carrosViewJFrame;
    private ArrayList<Veiculo>  listaVeiculos;
    private boolean             corridaOn = false;
    
    private class ControleVisual implements Runnable{

        @Override
        public void run() {
            try{
                while(corridaOn){
                    carrosViewJFrame.atualizarVisual();
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                    
            }
        }
        
        
    }
    
    private class controlaCorridaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(corridaOn){
                corridaOn = false;
            }else{
                corridaOn = true;
            }
        }       
    }
     
    private class InsereListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Veiculo v = carrosViewJFrame.obterVeiculoDigitado();
            controladorBanco.insere(v);
            listaVeiculos.add(v);
            carrosViewJFrame.inserirNaListaVisual(v);
        } 
    }
    private class CarregaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            controladorBanco.carregar(listaVeiculos);
            carrosViewJFrame.limparListaVisual();
            Iterator<Veiculo> iterator = listaVeiculos.iterator();
            while(iterator.hasNext()){
                Veiculo v = iterator.next();
                carrosViewJFrame.inserirNaListaVisual(v);
            }                
        }        
    }
    private class UpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Iterator<Veiculo> iterator = listaVeiculos.iterator();
            while(iterator.hasNext()){
                Veiculo v = iterator.next();
                v.moveUp();
                carrosViewJFrame.atualizarVisual();
            }  
        }
    }
    private class DownListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Iterator<Veiculo> iterator = listaVeiculos.iterator();
            while(iterator.hasNext()){
                Veiculo v = iterator.next();
                v.moveDown();
                carrosViewJFrame.atualizarVisual();
            }  

        }
    }
    private class RightListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Iterator<Veiculo> iterator = listaVeiculos.iterator();
            while(iterator.hasNext()){
                Veiculo v = iterator.next();
                v.moveRight();
                carrosViewJFrame.atualizarVisual();
            }  

        }
    }
    private class LeftListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Iterator<Veiculo> iterator = listaVeiculos.iterator();
            while(iterator.hasNext()){
                Veiculo v = iterator.next();
                v.moveLeft();
                carrosViewJFrame.atualizarVisual();
            }  

            
        }
    }
    private class correDir     implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Iterator<Veiculo> it = listaVeiculos.iterator();
            while(it.hasNext()){
                Veiculo v = it.next();
                Thread t = new Thread(v);
                t.start();  
                System.out.println("Disparando carro:");
            }
            Thread t = new Thread(new ControleVisual());
            corridaOn = true;
            t.start();
        }
    }
    
    public void executar(){
        controladorBanco = new ControladorBanco();
        carrosViewJFrame = new CarrosViewJFrame();
        listaVeiculos    = new ArrayList<Veiculo>();
        
        carrosViewJFrame.adicionarInsereListener(new InsereListener());
        carrosViewJFrame.adicionarCarregarListener(new CarregaListener());
        carrosViewJFrame.adicionarDOWNListener(new DownListener());
        carrosViewJFrame.adicionarUPListener(new UpListener());
        carrosViewJFrame.adicionarLEFTListener(new LeftListener());
        carrosViewJFrame.adicionarRIGHTListener(new RightListener());
        carrosViewJFrame.adicionarCorridaDirListener(new correDir());
        
        carrosViewJFrame.setVisible(true);        
    }
    
}
