public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        //Quando há mais de uma instrução(operação) deverá criar um bloco com {} no if
        if(valorSolicitado < saldo){

            saldo -= valorSolicitado;

            System.out.println("Saldo atual: R$" + saldo);
        
        }else

            System.out.println("Saldo insulficiente");

    }
}