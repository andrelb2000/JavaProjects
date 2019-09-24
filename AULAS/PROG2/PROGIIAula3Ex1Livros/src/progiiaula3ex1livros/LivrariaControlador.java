package progiiaula3ex1livros;

public class LivrariaControlador {
    
  public void executarLivraria(){
      //TODO codigo de execucao do controlador
      //1 - Criar a View
      LivrosView lv = new LivrosView();
      
      Livro lm = new Livro("Moby Dick", 600, 207, 30);
      
      //2 - Obter o modelo pela View
      //Livro lm = lv.leLivro();
      
      //3 - Mostrar o modelo na view;
      lv.mostraLivro(lm);
      
      
  } 
  
}
