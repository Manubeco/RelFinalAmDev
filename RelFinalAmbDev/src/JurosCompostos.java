

import util.Calculadora;

public class JurosCompostos {

		public static void main(String[] args){

            //valorPresente representa o valor do capital no mês corrente
            //taxa representa (1+taxa ao mês em porcentagem)
            //periodo representa o número de meses
            //valorFuturo representa o Montante no futuro em juros compostos

            double valorPresente = 100.00;
            double taxa = 1.00+(2.00/100.00);
            double periodo = 10.00;
            double valorFuturo;

            valorFuturo = valorPresente*(Calculadora.exponencial(taxa,periodo));

            System.out.print(valorFuturo);

        }
    }