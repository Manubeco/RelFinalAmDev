import util.Calculadora;

public class LadoQuadrado{
    public static void main(String[] args) {
            double AreaQuadrado = 100.00;                               
            double lado;
            
            lado = Calculadora.raizQuadrada(AreaQuadrado);

            System.out.print("O tamanho do lado do quadrado com área = " + AreaQuadrado + " é " + lado);
    }
}
