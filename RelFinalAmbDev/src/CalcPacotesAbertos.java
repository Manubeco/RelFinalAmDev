import util.Calculadora;

public class CalcPacotesAbertos{

/* Classe resonsável por calcular quantos pacotes de arroz
* serão necessários abrir para produzir uma quantidade 
* indicada de arroz cozido. Assim caso seja preciso apenas,
* 1,5kg ainda serão precisos abrir 2 pacotes já que cada pacote 
* tem apenas 1kg.
*/

    public static void main(String[] args) {
        
        double arrozCozido=3.5;
        double arroz_QtdPacote=1.0;
        double arroz_RendimentoPct=arroz_QtdPacote*2.0;
        double arrozCruNecessario;
        double PacotesArrozUsados;

        arrozCruNecessario = arrozCozido/arroz_RendimentoPct;
        PacotesArrozUsados= Calculadora.teto(arrozCruNecessario);
        
        System.out.println("Para cozinhar "+arrozCozido+" quilos de arroz, é necessário "+PacotesArrozUsados+" pacotes de arroz.");
    }

}
