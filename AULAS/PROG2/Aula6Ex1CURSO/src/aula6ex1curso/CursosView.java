package aula6ex1curso;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CursosView {
    private JFrame     cursosJFrame;

    private JLabel     nomeCursoJLabel;
    private JTextField nomeCursoJTextField;
    
    private JLabel     precoCursoJLabel;
    private JTextField precoCursoJTextField;
    
    private JButton    inserirJButton;
    
    public CursosView(){
        cursosJFrame = new JFrame("Entrar Cursos");
        cursosJFrame.setSize(200, 200);
        cursosJFrame.setLayout(new FlowLayout());
        cursosJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nomeCursoJLabel     = new JLabel("Curso:");
        nomeCursoJTextField = new JTextField(10);
        
        precoCursoJLabel     = new JLabel("Preco:");
        precoCursoJTextField = new JTextField(3);

        inserirJButton = new JButton("Inserir");
        
        cursosJFrame.add(nomeCursoJLabel);
        cursosJFrame.add(nomeCursoJTextField);
        cursosJFrame.add(precoCursoJLabel);
        cursosJFrame.add(precoCursoJTextField);
        cursosJFrame.add(inserirJButton);      
        cursosJFrame.setVisible(true);
    }
        
    public Curso obtemCurso(){
        String nome = nomeCursoJTextField.getText();
        double preco = Double.parseDouble(precoCursoJTextField.getText());
        Curso c = new Curso(nome, preco);
        return c;
    }
    
    public void mostrarCurso(Curso c){
        
    }
    
    public void addInserirListener(ActionListener al){
        inserirJButton.addActionListener(al);        
    }
    
    
    
}
