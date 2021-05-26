package matematica;

public class Soma extends Operacao {
    
     @Override
     public void Calcular(double ValorUm, double ValorDois){
        double resultado = ValorUm + ValorDois;
        System.out.println("O resultado da soma é: " + resultado);
        
     }
}
