package exercicio3.bin.edu.luiz.primeirasemana;


public class Operadores {
    public static void main(String[] args) {
        //int idade = 2;
        //double peso = 25.5D;
        //boolean sexo = true;
        //boolean brasileiro = false;
        int numero1 = 5;
        System.out.print(-numero1);
        int numero = 5;
        System.out.print(numero);
        boolean variavel = false;
        System.out.print(!variavel);
        variavel = !variavel;
        System.out.print(variavel);
        int a = 2;
        int b = 5;
        String resultado = "";
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
    
        System.out.print(resultado);
        String resultado2 = a == b ? "verdadeiro" : "falso";
        System.out.print(resultado2);
    }
}
