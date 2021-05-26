package matematica;

public class Multiplicar extends Operacao {
    
     @Override
     public void Calcular(double ValorUm, double ValorDois){
        double resultado = ValorUm * ValorDois;
        System.out.println("O resultado da multiplicação é: " + resultado);
    
     }
}
