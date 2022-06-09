import util.Calculadora;

public class MargemLucro {
    public static void main(String[] args) {

        double receitaTotal = 100;
        double custos = 50;
        double lucro;
        double margem;
        double lucroTotal;
            
            lucro = receitaTotal - custos;
            margem = Calculadora.divisao(lucro / receitaTotal);
            lucroTotal = margem*receitaTotal;
    
            System.out.println (lucroTotal);}
    
    }
