import util.Calculadora;

public class CalcHoraEstacionamento {
    
/* Classe responável por calcular o valor a ser cobrado 
* pelo tempo de permanência em um estacionamento.
* Neste estacionamento não se cobra por fração de hora, 
* apenas por horas inteiras. Assim caso tenha se passados apenas
* minutos, estes são arredondados para baixo, afim de cobrar apenas
* as horas inteiras 
*/ 

    public static void main(String[] args) {
        
        double valorHora=5.5;
        double horaInicial=13.00;
        double horaFinal=15.50;
        double horaTotal;
        double valorFinal;

        horaTotal = Calculadora.piso( horaFinal-horaInicial);
        valorFinal = Calculadora.multiplicacao(horaTotal,valorHora);
         
        System.out.println("O total de horas foi: "+horaTotal+" e o valor a pagar é: "+ valorFinal);
    }


}
