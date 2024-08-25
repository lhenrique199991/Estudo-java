public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.desligar ();

        // System.out.println("Novo Status -> TV LIGADA? " + smartTv.ligada);

        if(smartTv.ligada == true)

            System.out.println("TV LIGADA");
           
        else
            System.out.println ("TV DESLIGADA");


        smartTv.aumentarVolume();

        smartTv.aumentarVolume();

        System.out.println ("VOLUME: "+ smartTv.volume);


        smartTv.diminuirVolume();
        System.out.println ("VOLUME: " +  smartTv.volume);


        smartTv.aumentarCanal();
        System.out.println ("Canal Atual: " + smartTv.canal);

        
        smartTv.diminuirCanal();
        System.out.println ("Canal Atual : " + smartTv.canal);
        

        smartTv.escolherCanal(6);
        System.out.println ("Canal Atual: " + smartTv.canal);

    }

    
    
}
