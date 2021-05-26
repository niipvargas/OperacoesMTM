package matematica;

public class Divisao extends Operacao {
    
     @Override
     public void Calcular(double ValorUm, double ValorDois){
        double resultado = ValorUm / ValorDois;
        System.out.println("O resultado da divisão é: " + resultado); 
        
     }
}