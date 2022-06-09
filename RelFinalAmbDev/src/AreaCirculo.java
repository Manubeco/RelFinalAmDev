import util.Calculadora;

public class AreaCirculo {

		public static void main(String[] args){
            //pi representa a variavel universal;
            //raioCirculo representa a metade do diametro;
            //areaCirculo representa o calculo da area;
            double pi = 3.14159;
            double raioCirculo = 15;
            double areaCirculo;

            areaCirculo = pi*Calculadora.exponencial(raioCirculo, 2);

            System.out.print(areaCirculo);

        }
    }
