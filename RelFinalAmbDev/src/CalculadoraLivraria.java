import util.Calculadora;

public class CalculadoraLivraria {
    public static void main(String args[]) {
      double livro1 = 70.00;
      double livro2 = 60.00;
      
      double total = Calculadora.soma(livro1, livro2);

      System.out.println("A valor total do preço dos dois livros é: " + total);
    }
}