package util;

import java.lang.Math;

public class Calculadora {
    
    public void soma(){
    }
    
    public void subtracao(){
    }
    
    public void multiplicacao(){}
    
    public void divisao(){
    }
    
    public static double exponencial(double numeroA, double numeroB) {
		return Math.pow(numeroA, numeroB);
	}
    
    public static double raizQuadrada(double NumeroA){
        return Math.sqrt(NumeroA);
    }
    
    public static double teto(double numeroA){
        return Math.ceil(numeroA);
    }
    
    public static double piso(double numeroA){
        return Math.floor(numeroA);
    }
    
}
