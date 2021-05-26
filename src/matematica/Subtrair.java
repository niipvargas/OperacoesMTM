package matematica;

public class Subtrair extends Operacao {
    
     @Override
     public void Calcular(double ValorUm, double ValorDois){
        double resultado = ValorUm - ValorDois;
        System.out.println("O resultado da subtração é: " + resultado);
        
     }
}
