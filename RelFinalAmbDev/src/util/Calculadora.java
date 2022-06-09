package util;

import java.lang.Math;

public class Calculadora {
    
    public static double soma(double numeroA, double numeroB){
        return (numeroA + numeroB);
    }
    
    public static double subtracao(double numeroA, double numeroB){
        return (numeroA - numeroB);
    }
    
    public static double multiplicacao(double numeroA, double numeroB){
        return (numeroA * numeroB);
    }
    
    public static double divisao(double numeroA, double numeroB){
        return (numeroA / numeroB);
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
