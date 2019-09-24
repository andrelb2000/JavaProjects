package aula7excarros;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class CarrosViewJFrame extends javax.swing.JFrame {

    private DefaultListModel<Veiculo> listaVisual;
    private ArrayList<Veiculo>        listaPistaCarros;
     
    public CarrosViewJFrame() {
        listaPistaCarros = new ArrayList<Veiculo>();
        listaVisual      = new DefaultListModel<Veiculo>();
        initComponents();
        pistaVeiculosJPanel1.setListaPista(listaPistaCarros); 

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeVeiculojTextField1 = new javax.swing.JTextField();
        posXjTextField2 = new javax.swing.JTextField();
        posYjTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        compjTextField4 = new javax.swing.JTextField();
        largjTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<Veiculo>();
        correDireitajButton1 = new javax.swing.JButton();
        maxXjTextField1 = new javax.swing.JTextField();
        maxYjTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minXjTextField3 = new javax.swing.JTextField();
        minYjTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        veljTextField1 = new javax.swing.JTextField();
        inserirjButton1 = new javax.swing.JButton();
        pistaVeiculosJPanel1 = new aula7excarros.PistaVeiculosJPanel();
        paraIniciajButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Veiculo");

        nomeVeiculojTextField1.setText("Delorean");

        posXjTextField2.setText("10");

        posYjTextField3.setText("20");

        jLabel2.setText("Pos(X,Y)");

        jLabel3.setText("Comp,Larg");

        compjTextField4.setText("10");

        largjTextField5.setText("30");

        jList1.setModel(listaVisual);
        jScrollPane1.setViewportView(jList1);

        correDireitajButton1.setText("Corrida Direita");

        maxXjTextField1.setText("400");

        maxYjTextField2.setText("800");

        jLabel4.setText("LimMax(x,y)");

        jLabel5.setText("LimMin(x,y)");

        minXjTextField3.setText("0");

        minYjTextField4.setText("0");

        jLabel6.setText("Velociade");

        veljTextField1.setText("20");

        inserirjButton1.setText("Inseerir");

        pistaVeiculosJPanel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pistaVeiculosJPanel1Layout = new javax.swing.GroupLayout(pistaVeiculosJPanel1);
        pistaVeiculosJPanel1.setLayout(pistaVeiculosJPanel1Layout);
        pistaVeiculosJPanel1Layout.setHorizontalGroup(
            pistaVeiculosJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        pistaVeiculosJPanel1Layout.setVerticalGroup(
            pistaVeiculosJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        paraIniciajButton1.setText("Para / Inicia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(posXjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(posYjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(veljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(compjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(minYjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(largjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(minXjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxXjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxYjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeVeiculojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(correDireitajButton1)
                            .addComponent(jLabel6)
                            .addComponent(inserirjButton1)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paraIniciajButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pistaVeiculosJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pistaVeiculosJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeVeiculojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(posXjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posYjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(compjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(largjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxXjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxYjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(minXjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minYjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(veljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(correDireitajButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inserirjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paraIniciajButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Veiculo obterVeiculoDigitado(){
        String nome = nomeVeiculojTextField1.getText();
        int x = Integer.parseInt(posXjTextField2.getText());
        int y = Integer.parseInt(posYjTextField3.getText());
        int c = Integer.parseInt(compjTextField4.getText());
        int l = Integer.parseInt(largjTextField5.getText());
        int limMinx = Integer.parseInt(minXjTextField3.getText());
        int limMiny = Integer.parseInt(minYjTextField4.getText());
        int limMaxx = Integer.parseInt(maxXjTextField1.getText());
        int limMaxy = Integer.parseInt(maxYjTextField2.getText()); 
        int velocidade = Integer.parseInt(veljTextField1.getText());
        Veiculo v = new Veiculo(nome, x, y, l,c, limMinx, limMaxx, 
                                limMiny, limMaxy, velocidade);
        posYjTextField3.setText(""+(y+3*c));
        
        return v;
    }
    public void inserirNaListaVisual(Veiculo v){
        listaPistaCarros.add(v);
        listaVisual.addElement(v);
    }
    public void limparListaVisual(){
        
    }
    public void atualizarVisual(){
        pistaVeiculosJPanel1.repaint();        
    }
    
    
    public void adicionarInsereListener(ActionListener l){
        inserirjButton1.addActionListener(l);
    }
    public void adicionarCarregarListener(ActionListener l){
        
    }
    public void adicionarUPListener(ActionListener l){
        
    }
    public void adicionarDOWNListener(ActionListener l){
        
    }   
    public void adicionarRIGHTListener(ActionListener l){
        
    }      
    public void adicionarLEFTListener(ActionListener l){
        
    } 
    public void adicionarCorridaDirListener(ActionListener l){
        correDireitajButton1.addActionListener(l);
    }
    public void adicionaControleCorridaListener(ActionListener l){
        paraIniciajButton1.addActionListener(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compjTextField4;
    private javax.swing.JButton correDireitajButton1;
    private javax.swing.JButton inserirjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<Veiculo> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largjTextField5;
    private javax.swing.JTextField maxXjTextField1;
    private javax.swing.JTextField maxYjTextField2;
    private javax.swing.JTextField minXjTextField3;
    private javax.swing.JTextField minYjTextField4;
    private javax.swing.JTextField nomeVeiculojTextField1;
    private javax.swing.JButton paraIniciajButton1;
    private aula7excarros.PistaVeiculosJPanel pistaVeiculosJPanel1;
    private javax.swing.JTextField posXjTextField2;
    private javax.swing.JTextField posYjTextField3;
    private javax.swing.JTextField veljTextField1;
    // End of variables declaration//GEN-END:variables
}
