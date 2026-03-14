package modulo08semPOO.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //publico para qualquer classe, tipo do dado que esse metodo vai retornar no caso double, nome do metodo, parametros do metodo;
    public double area(){
         double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));


    }
}
