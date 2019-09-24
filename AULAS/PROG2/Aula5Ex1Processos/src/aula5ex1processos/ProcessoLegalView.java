package aula5ex1processos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProcessoLegalView {
    
    private JFrame      processoJFrame;
    
    private JLabel      nrProcessoJLabel;
    private JTextField  nrProcessoJTextField;
    
    private JLabel      descricaoProcessoJLabel;
    private JTextField  descricaoProcessoJTextField;
    
    private JLabel      valorAcaoJLabel;
    private JTextField  valorAcaoJTextField;
    
    private JLabel      anoAcaoJLabel;
    private JTextField  anoAcaoJTextField;
    
    private JLabel      custasProcessoJLabel;
    private JTextField  custasProcessoJTextField;
    
    private JButton     inserirJButton;
    
    private JButton     listarJButton;
    
    private JLabel     listaProcessosJLabel;
    
    public ProcessoLegalView(){
        processoJFrame      = new JFrame("Visualizador de Processos");
        processoJFrame.setSize(300,300);
        processoJFrame.setLayout(new FlowLayout());
        processoJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nrProcessoJLabel       = new JLabel("Nr. Processso:");
        nrProcessoJTextField   = new JTextField(10);

        descricaoProcessoJLabel     = new JLabel("Descrição:");
        descricaoProcessoJTextField = new JTextField(30);

        valorAcaoJLabel             = new JLabel("Valor da Ação R$ ");
        valorAcaoJTextField         = new JTextField(5);

        anoAcaoJLabel               = new JLabel("ANO: ");
        anoAcaoJTextField           = new JTextField(4);

        custasProcessoJLabel        = new JLabel("Custas do Processo R$:");
        custasProcessoJTextField    = new JTextField(4);
        
        inserirJButton              = new JButton("Inserir Processo");
        listarJButton               = new JButton("Listar Processos");
        listaProcessosJLabel        = new JLabel("Lista:");

        processoJFrame.add(nrProcessoJLabel);
        processoJFrame.add(nrProcessoJTextField);

        processoJFrame.add(descricaoProcessoJLabel);
        processoJFrame.add(descricaoProcessoJTextField);

        processoJFrame.add(valorAcaoJLabel);
        processoJFrame.add(valorAcaoJTextField);

        processoJFrame.add(anoAcaoJLabel);
        processoJFrame.add(anoAcaoJTextField);

        processoJFrame.add(custasProcessoJLabel);
        processoJFrame.add(custasProcessoJTextField);
        
        processoJFrame.add(inserirJButton);
        processoJFrame.add(listarJButton);
        processoJFrame.add(listaProcessosJLabel);

        processoJFrame.setVisible(true);
        
    }
    
    
    
    
    public void mostraProcesso(ProcessoLegal pl){
        // Colocar os dados nos objetos visuais
        nrProcessoJTextField.setText(pl.getNrProcesso());
        descricaoProcessoJTextField.setText(pl.getDescricaoProcesso());
        valorAcaoJTextField.setText(Double.toString(pl.getValorAcaoProcesso()));
        anoAcaoJTextField.setText(Integer.toString(pl.getAnoProcesso()));
        custasProcessoJTextField.setText(Double.toString(pl.calculaCustas()));
        
    }
    
    public void mostraLista(String lista){
        listaProcessosJLabel.setText(lista);
    }
    
    public ProcessoLegal retornaProcesso(){
        String nrprocesso = nrProcessoJTextField.getText();
        String descricao  = descricaoProcessoJTextField.getText();
        double valor      = Double.parseDouble(valorAcaoJTextField.getText());
        int    ano        = Integer.parseInt(anoAcaoJTextField.getText());
        
       ProcessoLegal pl = new ProcessoLegal(nrprocesso, descricao, valor, ano);
        return pl;
    }
    
    public void adicionarListenerInserir(ActionListener al){
        inserirJButton.addActionListener(al);        
    }
    public void adicionarListenerListar(ActionListener al){
        listarJButton.addActionListener(al);
    }
    
    
    
}
