package exercicio3.bin.edu.luiz.primeirasemana;

public class MinhaClass {
    public static void main(String[] args) {
        String primeiroNome = "Luiz";
        String segundoNome = "Henrique";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
     }
  
     public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Nome: " + primeiroNome.concat(" ").concat(segundoNome);
     }
    
}
