package aula7excarros;

import javax.swing.JPanel;

public class Veiculo implements Runnable{
    private String nomeVeiculo;
    private int posX,posY;
    private int largura,comprimento;
    private int limMinX,limMaxX;
    private int limMinY,limMaxY;
    private int velocidade;

    public Veiculo(String nomeVeiculo, int posX, int posY, int largura, int comprimento, int limMinX, int limMaxX, int limMinY, int limMaxY, int velocidade) {
        this.nomeVeiculo = nomeVeiculo;
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.comprimento = comprimento;
        this.limMinX = limMinX;
        this.limMaxX = limMaxX;
        this.limMinY = limMinY;
        this.limMaxY = limMaxY;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo:" + nomeVeiculo ;
    }

    @Override
    public void run() {
        try{
            while(true){
                
                moveRight();
                Thread.sleep(1000);  
                System.out.println("Carro:"+nomeVeiculo+ "Em movimento");
               // destino.repaint();
            }
        }catch(InterruptedException e){
            System.out.println("erro de thread no carro: "+nomeVeiculo);           
        }
    }

    
    public void moveUp(){
        posY-=velocidade;
        if(posY<limMinY){
            posY+=velocidade;
        }
    }
    public void moveDown(){
        posY+=velocidade;
        if(posY>limMaxY){
            posY-=velocidade;
        }
    }
    public void moveRight(){
        posX+=velocidade;
        if(posX>limMaxX){
            posX-=velocidade;
        }
    }
    public void moveLeft(){
        posX-=velocidade;
        if(posX<limMinX){
            posX+=velocidade;
        }
    }

    
    
    
    
    
    
    
    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getLargura() {
        return largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLimMinX() {
        return limMinX;
    }

    public int getLimMaxX() {
        return limMaxX;
    }

    public int getLimMinY() {
        return limMinY;
    }

    public int getLimMaxY() {
        return limMaxY;
    }

    public int getVelocidade() {
        return velocidade;
    }
    
   
   
    
}
