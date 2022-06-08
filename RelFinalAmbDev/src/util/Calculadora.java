package util;

import java.lang.Math;

public class Calculadora {
    
    public void soma(){
    }
    
    public void subtracao(){
    }
    
    public void multiplicacao(){
    }
    
    public void divisao(){
    }
    
    public void exponencial(){
    }
    
    public void raizQuadrada(){
    }

    /* Método para usar função matemática teto, 
    *  arrendondado número flutuantes para cima.
    */ 
    public static Double teto(double numeroA){
        return Math.ceil(numeroA);
    }
    
    /* Método para usar função matemática piso, 
    *  arrendondado número flutuantes para baixo.
    */
    public static double piso(double numeroA){
        return Math.floor(numeroA);
    }
    
}
