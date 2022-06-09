import util.Calculadora;

public class CalculadoraIngresso {
    public static void main(String args[]) {
      double quantidadeTotal = 100.00;
      double ingressosVendidos = 30.00;
      double quantidadeRestante = Calculadora.subtracao(quantidadeTotal, ingressosVendidos);
      
      System.out.println("A quantidade de ingressos restantes é: " + quantidadeRestante);
    }
}