import java.util.concurrent.ThreadLocalRandom;

public class ProcesoSeletivo {

    public static void main(String[] args) {
        System.out.println("\nPROCESSO SELETIVO:\n");

        //selecaoCandidatos();
        imprimirSelecionados();
    }


    //Usando for
    static void imprimirSelecionados() {

        String [] candidatos = {"FELIPE", "CAIO", "ROBERTO", "JULIA", "MARCIA", "AUGUSTO","MIRELA", "FABIO", "CARLOS", "FERNANDO"};

        System.out.println("Imprimindo a lista de candidatos, informando o indice do elemento.");

        for(int indice=0; indice< candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);

        }

        //for each
        System.out.println("CANDIDATOS:");
        int i = 0;
        for(String candidato:candidatos) {
            i++;
            System.out.println(" "+ i + ") " + candidato);
        }

    }

    //Usando while
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "CAIO", "ROBERTO", "JULIA", "MARCIA", "AUGUSTO","MIRELA", "FABIO", "CARLOS", "FERNANDO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou, este valor de salário "+ salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+ candidato + " foi selecionado a vaga! " );
                candidatosSelecionados ++;
            }
            candidatosAtual++;

        }
        System.out.println("Foram selecionados " + candidatosSelecionados + " candidatos!");
    }
    

    //Retorna valores aleatórios de 1800 a 2200.
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);    
    }


    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println(" LIGAR PARA O CANDIDATO!");

        }else if(salarioBase == salarioPretendido)
            System.out.println(" LIGAR COM CONTRA PROPOSTA!");

        else {
            System.out.println(" AGUADANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }    
    }
}