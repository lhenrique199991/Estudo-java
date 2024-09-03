import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excessao {
    public static void main(String[] args){
        try{
        //Criando objeto scanner
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         
        //Coletando dados do cliente.
         
        System.out.println("Digite seu nome: ");

        String nome = scanner.next();

        
        System.out.println("Digite seu sobreNome: ");

        String sobreNome = scanner.next();


        System.out.println("Digite número da conta: ");

        int numeroConta = scanner.nextInt();


        System.out.println("Digite número da Agência: ");

        String numeroAgencia = scanner.next();


        System.out.println("Informe valor de deposito: ");

        double valorDeposito = scanner.nextDouble();

        
        //Informações do cliente.
         
        System.out.println("Olá " + nome +" "+ sobreNome + ", Obrigado por criar uma conta em nosso Banco!");

        System.out.println("Sua agência é: " + numeroAgencia);

        System.out.println("Número da Conta: " + numeroConta);

        System.out.println("Saldo de R$" + valorDeposito + ", já está disponível para saque.");

        }
        catch (InputMismatchException e){
            System.out.println("Digite apenas números");
        }
    }
}