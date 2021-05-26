package matematica;

public class Matematica {
    
    public static void Iani(Operacao op, double x, double y){
        op.Calcular(x, y);
    }
  
    public static void main(String[] args) {
        
        Soma s = new Soma();
        Multiplicar m = new Multiplicar();
        Subtrair s1 = new Subtrair();
        Divisao d = new Divisao();
        
        Iani(s, 565, 435);
        Iani(m, 250, 4);
        Iani(s1, 1584, 584);
        Iani(d, 4000, 4);
    
    }
    
}