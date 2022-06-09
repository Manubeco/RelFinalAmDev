import util.Calculadora;

public class DiagonalQuadrado{
    public static void main(String[] args) {
            double ComprimentoParede = 10.00;                               
            double DiagonalQuarto;
            DiagonalQuarto = ComprimentoParede * (Calculadora.raizQuadrada(2));

            System.out.print("O Comprimento de cabo necessário para atravessar um quarto de 100m² na diagonal é: " + DiagonalQuarto);
    }
}
